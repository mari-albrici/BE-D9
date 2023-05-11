package exercise;

public class Product {
	
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Product(Long id, String name, String category, Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		
	}
	
	public String getProductInfo() {
		return ("ID: " + id + " " + "NAME: " + name + " " + "CATEGORY: " + category + " " + "PRICE: " + price);
	}

	public String getProductCategory() {
		return category;
	}
	
	public String getProductName() {
		return name;
	}
	
	public Double getProductPrice() {
		return price;
	}
	
	public Double setProductPrice(Double price) {
		return price;
	}
	
	public Long getProductId() {
		return id;
	}
	
	
}
