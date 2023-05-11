package exercise;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private Long id; 
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private Costumer costumer;
	
	
	public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Costumer costumer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.costumer = costumer;
	}
	
	public Long getOrderId() {
		return id;
	}
	
	public String getOrderStatus() {
		return status;
	}
	
	public LocalDate orderDate() {
		return orderDate;
	}
	
	public LocalDate deliveryDate() {
		return deliveryDate;
	}

}
