package SpringBootApplication.rest;

//import org.apache.http.HttpStatus;
//import org.apache.hc.core5.http.HttpStatus;
//import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.StockPriceResponse;
import SpringBootApplication.service.StockPriceService;

@RestController
public class StockRestController {

	@Autowired
	private StockPriceService service;
	@GetMapping("/price/{companyName}")
	public  ResponseEntity<StockPriceResponse>getStockPrice( @PathVariable String companyName){
		StockPriceResponse response=service.getStockPrice(companyName);
	//	return new ResponseEntity<>(response, HttpStatus.Ok)
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
}
