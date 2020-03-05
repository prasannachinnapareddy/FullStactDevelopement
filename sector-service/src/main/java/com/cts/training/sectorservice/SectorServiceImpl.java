package com.cts.training.sectorservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	SectorRepo sectorRepo;
	
	
	@Override
	public Sector addSector(Sector sector)
	{
		sectorRepo.save(sector);
	    return sector;
	}
	
	@Override
	public List<Sector> getAllSectors()
	{
		return sectorRepo.findAll();
	}
	
	@Override
	public void deleteSector(int id)
	{
		sectorRepo.deleteById(id);
	}
	
	@Override
	public Sector getSectorById(int id)
	{
		Optional<Sector> sectors = sectorRepo.findById(id);
		return sectors.orElse(null);
	}
	
	@Override
	public Sector updateSector(Sector sector)
	{
		sectorRepo.save(sector);
		return sector;
	}

}