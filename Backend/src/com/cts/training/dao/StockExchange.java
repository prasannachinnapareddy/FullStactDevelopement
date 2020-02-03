package com.cts.training.dao;
import java.util.List;
public interface StockExchange
{
		public  boolean saveStockExchange(StockExchange stockexchange);

		public boolean updateStockExchange(StockExchange stockexchange);

		public boolean daleteStockExchange(StockExchange stockexchange);

		public  StockExchange getStockExchangeById(StockExchange stockexchange);

		public  List<StockExchange> getAllStockExchanges();
}
