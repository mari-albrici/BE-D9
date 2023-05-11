package exercise;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		//************** CREAZIONE CLIENTI **************
		
		Costumer marianna = new Costumer(1l, "Marianna", 5);
		Costumer elisa = new Costumer(2l, "Elisa", 2);
		Costumer alice = new Costumer(3l, "Alice", 3);
		Costumer nicola = new Costumer(4l, "Nicola", 2);
		Costumer virginia = new Costumer(5l, "Virginia", 5);
		Costumer andrea = new Costumer(6l, "Andrea", 4);
		Costumer matteo = new Costumer(7l, "Matteo", 1);
		Costumer emauele = new Costumer(8l, "Emanuele", 1);
		Costumer greta = new Costumer(9l, "gret", 2);
		
		
		//************** CREAZIONE PRODOTTI **************
		
		List<Product> products = new ArrayList<Product>();
		
		Product productOne = new Product(1l, "Ruspa", "Boys", 19.90 );
		Product productTwo = new Product(2l, "Il Vangelo secondo la scienza", "Books", 120.80 );
		Product productThree = new Product(3l, "Nappies", "Baby", 24.50 );
		Product productFour = new Product(4l, "Hot Wheels", "Boys", 3.90 );
		Product productFive = new Product(5l, "Il Genio non esiste", "Books", 12.90 );
		Product productSix = new Product(6l, "Binky", "Baby", 3.40 );
		Product productSeven = new Product(7l, "Pallone", "Boys", 0.90 );
		Product productEight = new Product(8l, "Toy", "Baby", 19.90 );
		Product productNine = new Product(9l, "Orgoglio e Pregiudizio", "Books", 19.90 );
		
		products.add(productOne);
		products.add(productTwo);
		products.add(productThree);
		products.add(productFour);
		products.add(productFive);
		products.add(productSix);
		products.add(productSeven);
		products.add(productEight);
		products.add(productNine);
		
		//************** CREAZIONE ORDINI **************
		
		LocalDate today = new LocalDate(11, 5, 2023);		
		
		Order orderOne = new Order(1l, "sent", );
		
		
		
		//************** EXERCISE 1**************
		List<String> costsMoreThan100 = products.stream().filter(book -> book.getProductCategory().equals("Books")).filter(book -> book.getProductPrice() > 100).map(Product::getProductName).toList();	
		logger.info("Books that cost more than $100 are: " + costsMoreThan100);
		
		//************** EXERCISE 2 **************
		
		
		//************** EXERCISE 3 **************
		
		
		//************** EXERCISE 4 **************

	}

}
