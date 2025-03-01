package SpringBootApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import SpringBootApplication.bindings.StockPriceResponse;
import SpringBootApplication.repo.StockPriceRepository;

public class StockServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepo;
	@Autowired
	private Environment env;
	
	
	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		// TODO Auto-generated method stub
		Double stockPrice=stockPriceRepo.findStockPriceByCompanyName(companyName);
		StockPriceResponse response= new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPrice);
		
		String port=env.getProperty("server.port");
		response.setPortNumber(Integer.parseInt(port));
		
		
		
		return response;
	}

}
