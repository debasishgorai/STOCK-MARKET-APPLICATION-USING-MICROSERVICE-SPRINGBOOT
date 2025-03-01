package SpringBootApplication.bindings;

public class StockPriceResponse {

	private String CompanyName;
	
	private Double CompanyStockPrice;
	
	@Override
	public String toString() {
		return "StockPriceResponse [CompanyName=" + CompanyName + ", CompanyStockPrice=" + CompanyStockPrice
				+ ", portNumber=" + portNumber + "]";
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public Double getCompanyStockPrice() {
		return CompanyStockPrice;
	}

	public void setCompanyStockPrice(Double companyStockPrice) {
		CompanyStockPrice = companyStockPrice;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

	private Integer portNumber;
}
