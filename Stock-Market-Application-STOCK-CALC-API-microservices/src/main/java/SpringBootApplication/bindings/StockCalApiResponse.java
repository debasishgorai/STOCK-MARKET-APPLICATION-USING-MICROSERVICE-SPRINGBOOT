package SpringBootApplication.bindings;

public class StockCalApiResponse {

	private String companyName;
	private Integer quantity;;
	public StockCalApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StockCalApiResponse [companyName=" + companyName + ", quantity=" + quantity + ", portNumber="
				+ portNumber + ", totalCost=" + totalCost + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	private Integer portNumber;
	private Double totalCost;
}
