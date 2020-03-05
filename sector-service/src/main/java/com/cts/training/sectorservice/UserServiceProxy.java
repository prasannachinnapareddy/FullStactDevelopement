package com.cts.training.sectorservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient("user-service")
@FeignClient("netflix-zuul-api-gateway-server")
public interface UserServiceProxy 
{
	 @GetMapping("/user-service/allUsers")
	  public ResponseEntity<?> getallusers();
	 
}
