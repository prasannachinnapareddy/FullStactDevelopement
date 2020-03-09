 package com.cts.training.userservice;
  
  import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
  import org.springframework.web.bind.annotation.RequestMapping; 
  import org.springframework.web.bind.annotation.RequestMethod; 
  import org.springframework.web.bind.annotation.RestController;

  @CrossOrigin(origins="*")
  @RestController 
  public class RegisterRestServiceController 
  {
  
	  @Autowired 
	  RegisterDAO registerDAO;
	  
	  Logger logger = LoggerFactory.getLogger(this.getClass()); 
	  
	  @Autowired
	  RegisterService registerService;
	  
	  @Autowired 
	  JavaMailSender javaMailSender;
  
	  @GetMapping("/registers")
	  public ResponseEntity<?>getallusers()
	  {
			List<Register> list = registerService.getAllUsers();
			if(list.size()>0)
			{
				return new ResponseEntity<List<Register>>(list , HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
			}
		}
	 
	  @GetMapping("/userById/{id}")
		public ResponseEntity<Register> getById(@PathVariable int id)
	  	{
			Register register = registerService.getUserById(id);
			return new ResponseEntity<Register>(register,HttpStatus.OK);
		}
	  
	  @DeleteMapping("/deleteUser/{id}")
		public void delete(@PathVariable int id)
	  	{
			registerService.delete(id);
		}

	  @PutMapping("/updateUser")
		public ResponseEntity<Register> update(@RequestBody Register register)
	  	{
			registerService.updateUser(register);
			return new ResponseEntity<Register>(register,HttpStatus.OK);
		}

	  @RequestMapping(value = "/registers",method = RequestMethod.POST)
		public ResponseEntity<Register> save(@RequestBody Register register)
	  	{
			registerService.insert(register);
			return new ResponseEntity<Register>(register,HttpStatus.CREATED);
		}
	  
	  @RequestMapping(value="/activate",method= RequestMethod.PUT)
		public ResponseEntity<String> activate(@RequestBody String email)
	  	{
			registerService.activate(email);
			return new ResponseEntity<String>(email,HttpStatus.CREATED);
		}
	  
	  @GetMapping(value="/login")
	  	public ResponseEntity<?> login()
	  	{
	  		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	  	}
	 
 }