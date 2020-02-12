package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.StockExchange;

public interface StockExchangeDAO {
	
	public boolean addStockExchange(StockExchange stockExchange);

	public boolean updateStockExchange(StockExchange stockExchange);

	public boolean deleteStockExchange(StockExchange stockExchange);

	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchanges();
}