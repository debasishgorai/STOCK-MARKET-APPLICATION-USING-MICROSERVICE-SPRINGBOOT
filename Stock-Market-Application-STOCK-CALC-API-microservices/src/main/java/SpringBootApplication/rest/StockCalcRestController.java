package SpringBootApplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.StockCalApiResponse;
import SpringBootApplication.service.StockCalcService;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockCalcService calcService;
	
	@GetMapping("/calc/{companyName}/{quantity}")
	private StockCalApiResponse getStocksCost(@PathVariable        String companyName,Integer quantity)
	{
		
		return calcService.getStocksCost(companyName, quantity);
		
	}
}
