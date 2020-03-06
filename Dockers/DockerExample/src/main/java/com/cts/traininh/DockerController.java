package com.cts.traininh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController 
{
	@GetMapping("/names")
	public List<String> names()
	{
		
		return new ArrayList<String>(Arrays.asList("prasanna","prudhvi","vaishnavi","sravani","supriya"));
	}

}
