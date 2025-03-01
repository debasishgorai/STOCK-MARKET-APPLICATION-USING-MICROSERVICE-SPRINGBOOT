package SpringBootApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootApplication.bindings.StockCalApiResponse;
import SpringBootApplication.bindings.StockPriceApiResponse;
import SpringBootApplication.client.StockPriceClient;

@Service
public class StockCalcService {

	@Autowired
	private StockPriceClient priceClient;
	
	public StockCalApiResponse getStocksCost(String companyName,Integer quantity) {
		
		StockCalApiResponse response=new StockCalApiResponse();
		
	StockPriceApiResponse priceApiResponse=	priceClient.invokeStockPriceApi(companyName);
		
	 Double companyStockPrice= priceApiResponse.getCompanyStockPrice();
		Double totalCost=companyStockPrice*quantity;
		
		response.setCompanyName(companyName);
		response.setPortNumber(priceApiResponse.getPortNumber());
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);
		
		
		
		return response;
		
	}
}
