package SpringBootApplication.service;

import SpringBootApplication.bindings.StockPriceResponse;

public interface StockPriceService {

	
	
	public  StockPriceResponse getStockPrice(String companyName);

}
