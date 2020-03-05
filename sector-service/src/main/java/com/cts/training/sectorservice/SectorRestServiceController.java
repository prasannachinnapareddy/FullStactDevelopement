package com.cts.training.sectorservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class SectorRestServiceController
{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SectorRepo sectorRepo;
	
	@Autowired
	SectorService sectorService;
	
	@Autowired
	private UserServiceProxy proxy;
	
	@GetMapping(value="/sector",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>getallInitialPublicOfferings()
	  {
			List<Sector> list = sectorService.getAllSectors();
			if(list.size()>0)
			{
				return new ResponseEntity<List<Sector>>(list , HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("No Companies found",HttpStatus.NOT_FOUND);
			}
		}
	
  	
	@RequestMapping(value="/sector/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sector> findone(@PathVariable int id)
	{
		Sector sector = sectorService.getSectorById(id);
		return new ResponseEntity<Sector>(sector,HttpStatus.OK);
	}
	
	@RequestMapping(value="/sector", method= RequestMethod.POST)
	public ResponseEntity<Sector> save(@RequestBody Sector sector)
	{
		sectorService.addSector(sector);
		return new ResponseEntity<Sector>(sector,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/sector/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id)
	{
		sectorService.deleteSector(id);
	}
	
	@RequestMapping(value = "/sector", method = RequestMethod.PUT)
	public ResponseEntity<Sector> update(@RequestBody Sector sector)
	{
		sectorService.addSector(sector);
		return new ResponseEntity<Sector>(sector,HttpStatus.OK) ;
	}
	
	 @GetMapping("/users-by-sector")
	  public ResponseEntity<?>getAllUsersBySector()
	  {
		 logger.info("Get All Users Invoked.....!");
		 ResponseEntity<?> users=proxy.getallusers();
		 logger.info("Information ---> {}",users);
		 return proxy.getallusers();
	  }
	 
}