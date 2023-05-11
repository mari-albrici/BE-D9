package exercise;

public class Costumer {

	private Long id;
	private String name;
	private int tier;
	
	public Costumer (Long id, String name, int tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	
	public void getCostumerInfo() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("TIER: " + tier);
	}
	
}
