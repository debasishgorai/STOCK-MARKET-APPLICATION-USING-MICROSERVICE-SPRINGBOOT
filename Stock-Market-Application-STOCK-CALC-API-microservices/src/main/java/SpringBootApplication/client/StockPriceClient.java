package SpringBootApplication.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import SpringBootApplication.bindings.StockPriceApiResponse;

@FeignClient(name="STOCK-PRICE-API")
public interface StockPriceClient {
	
	@GetMapping("/price/{companyName}")
	public StockPriceApiResponse invokeStockPriceApi(@PathVariable String companyName);
	
}
