package BackEnd_unit01_week02_day04_Package;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - products definition
		Product prodotto101 = new Product(101L, "prodotto101", "Books", 50.00);
		Product prodotto102 = new Product(102L, "prodotto102", "Books", 150.00);
		Product prodotto103 = new Product(103L, "prodotto103", "Books", 100.00);
		Product prodotto104 = new Product(104L, "prodotto104", "Books", 150.00);
		Product prodotto105 = new Product(105L, "prodotto105", "Baby", 20.00);
		Product prodotto106 = new Product(106L, "prodotto106", "Baby", 20.00);
		Product prodotto107 = new Product(107L, "prodotto107", "Baby", 20.00);
		Product prodotto108 = new Product(108L, "prodotto108", "Baby", 20.00);
		Product prodotto109 = new Product(109L, "prodotto109", "Boys", 80.00);
		Product prodotto110 = new Product(110L, "prodotto110", "Boys", 160.00);

		// - - - - - - - - - - - - - - - productsList definition and population
		List<Product> productsList = new ArrayList<>();
		productsList.add(prodotto101);
		productsList.add(prodotto102);
		productsList.add(prodotto103);
		productsList.add(prodotto104);
		productsList.add(prodotto105);
		productsList.add(prodotto106);
		productsList.add(prodotto107);
		productsList.add(prodotto108);
		productsList.add(prodotto109);
		productsList.add(prodotto110);

		// - - - - - - - - - - - - - - - ESERCIZIO 1
		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");
		System.out.println("Lista prodotti:");
		for (Product _product : productsList) {
			System.out.println(_product);
		}
		System.out.println("");
		System.out.println("Lista dei prodotti appartenenti alla categoria Books con prezzo > 100:");

		List<Product> productsListEsercizio1 = new ArrayList<>();
		productsListEsercizio1 = productsList.stream().filter(_product -> _product.getCategory().equals("Books"))
				.filter(_product -> _product.getPrice() > 100).toList();

		for (Product _product : productsListEsercizio1) {
			System.out.println(_product);
		}
	}

}
