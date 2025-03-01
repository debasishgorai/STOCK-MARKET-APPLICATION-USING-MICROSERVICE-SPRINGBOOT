package SpringBootApplication.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SpringBootApplication.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable>{

	@Query("select companyStockPrice from StockPrice where companyName=companyName")
	public Double findStockPriceByCompanyName(String companyName);
	
	
	
}
