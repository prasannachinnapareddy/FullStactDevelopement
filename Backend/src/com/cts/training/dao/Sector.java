package com.cts.training.dao;
import java.util.List;
public interface Sector
{
	public boolean saveSector(Sector sector);

	public boolean updateSector(Sector sector);

	public boolean deleteSector(Sector sector);

	public Sector getSectorById(int id);

	public List<Sector> getAllSectors();
}
