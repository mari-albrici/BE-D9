package exercise;

public class Customer {

	private Long id;
	private String name;
	private int tier;
	
	public Customer (Long id, String name, int tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	
	public void getCustumerInfo() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("TIER: " + tier);
	}
	
	public int getCustomerTier() {
		return tier;
	}
	
	public String getCustomerName() {
		return name;
	}
}
