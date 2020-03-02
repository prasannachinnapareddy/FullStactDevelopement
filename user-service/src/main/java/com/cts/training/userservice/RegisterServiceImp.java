package com.cts.training.userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class RegisterServiceImp implements RegisterService
{
	@Autowired
	RegisterDAO registerDAO;
	
	@Autowired
	RegisterService registerService;

	@Autowired
	JavaMailSender javaMailSender;
	
	@Override
	public Register insert(Register register) {
		Register registerObject=new Register();
		BeanUtils.copyProperties(register, registerObject);
		registerDAO.save(registerObject);
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("prasannasvvl@gmail.com");
			sm.setTo(register.getEmail());
			sm.setSubject("verfication mail");
			sm.setText("Account created click on <a href='http://localhost:4200/activate?"+registerObject.getEmail()+"'>Click</a>");
			javaMailSender.send(sm);
			System.out.println("sending mail.....");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return register;
	}

	@Override
	public void delete(int id) 
	{
		registerDAO.deleteById(id);
	}
	
	@Override
	public List<Register> getAllUsers(){
		List<Register> entities = registerDAO.findAll();
		List<Register> users = new ArrayList<Register>();
		for(Register entity: entities) {
			Register register = new Register();
			BeanUtils.copyProperties(entity, register);
			users.add(register);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+users);
		return users;
	}
	@Override
	public Register updateUser(Register users) {
		Register register = new Register();
		BeanUtils.copyProperties(users, register);
		BeanUtils.copyProperties(registerDAO.save(register), users);
		return users;
	}
	@Override
	public Register getUserById(int id) {
		Optional<Register> user =registerDAO.findById(id);
		Register register =new Register();
		BeanUtils.copyProperties(user.orElse(new Register()),register);
		return register;
	}



	@Override
		public String activate(@RequestBody String email) {
			String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
		System.out.println("emil ::"+str);
		Register us= registerDAO.findByEmail(str);
		System.out.println("uname :"+us.getEmail());
		us.setActive("yes");
	    us = registerDAO.save(us);
	       return "{\"status\":\"ok\"}";
		}
}