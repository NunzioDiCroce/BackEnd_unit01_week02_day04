package BackEnd_unit01_week02_day04_Package;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - ESERCIZIO 1
		System.out.println("");
		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");

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

		System.out.println("Lista prodotti:");
		for (Product _product : productsList) {
			System.out.println(_product);
		}

		System.out.println("");
		System.out.println("Lista dei prodotti appartenenti alla categoria Books con prezzo > 100:");

		// - - - - - - - - - - - - - - - stream
		List<Product> productsListEsercizio1 = new ArrayList<>();
		productsListEsercizio1 = productsList.stream().filter(_product -> _product.getCategory().equals("Books"))
				.filter(_product -> _product.getPrice() > 100).toList();

		for (Product _product : productsListEsercizio1) {
			System.out.println(_product);
		}

		// - - - - - - - - - - - - - - - ESERCIZIO 2
		System.out.println("");
		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 2 - - - - - - - - - -");
		System.out.println("");
		System.out.println("Lista ordini:");

		// - - - - - - - - - - - - - - - firstOrderList definition and population
		List<Product> firstOrderList = new ArrayList<>();
		firstOrderList.add(prodotto101);
		firstOrderList.add(prodotto102);

		// - - - - - - - - - - - - - - - CustomerOne definition
		Customer customerOne = new Customer(1001L, "Mario", 1);

		// - - - - - - - - - - - - - - - order1001 definition
		Order order1001 = new Order(1001L, "Completed", LocalDate.now(), LocalDate.now().plusDays(3), firstOrderList,
				customerOne);

		// - - - - - - - - - - - - - - - order1001 print
		System.out.println(order1001);

		// - - - - - - - - - - - - - - - secondOrderList definition and population
		List<Product> secondOrderList = new ArrayList<>();
		secondOrderList.add(prodotto103);
		secondOrderList.add(prodotto104);

		// - - - - - - - - - - - - - - - order1002 definition
		Order order1002 = new Order(1002L, "Completed", LocalDate.now(), LocalDate.now().plusDays(3), secondOrderList,
				customerOne);

		// - - - - - - - - - - - - - - - order1002 print
		System.out.println(order1002);

		// - - - - - - - - - - - - - - - thirdOrderList definition and population
		List<Product> thirdOrderList = new ArrayList<>();
		thirdOrderList.add(prodotto105);
		thirdOrderList.add(prodotto106);

		// - - - - - - - - - - - - - - - CustomerTwo definition
		Customer customerTwo = new Customer(1002L, "Paolo", 1);

		// - - - - - - - - - - - - - - - order1003 definition
		Order order1003 = new Order(1003L, "Completed", LocalDate.now(), LocalDate.now().plusDays(3), thirdOrderList,
				customerTwo);

		// - - - - - - - - - - - - - - - order1003 print
		System.out.println(order1003);

		// - - - - - - - - - - - - - - - fourthOrderList definition and population
		List<Product> fourthOrderList = new ArrayList<>();
		fourthOrderList.add(prodotto107);
		fourthOrderList.add(prodotto108);

		// - - - - - - - - - - - - - - - order1004 definition
		Order order1004 = new Order(1004L, "Completed", LocalDate.now(), LocalDate.now().plusDays(3), fourthOrderList,
				customerTwo);

		// - - - - - - - - - - - - - - - order1004 print
		System.out.println(order1004);

		// - - - - - - - - - - - - - - - fifthOrderList definition and population
		List<Product> fifthOrderList = new ArrayList<>();
		fifthOrderList.add(prodotto109);
		fifthOrderList.add(prodotto110);

		// - - - - - - - - - - - - - - - CustomerOne definition
		Customer customerThree = new Customer(1003L, "Giovanni", 2);

		// - - - - - - - - - - - - - - - order1005 definition
		Order order1005 = new Order(1005L, "Completed", LocalDate.now(), LocalDate.now().plusDays(3), fifthOrderList,
				customerThree);

		// - - - - - - - - - - - - - - - order1005 print
		System.out.println(order1005);

		// - - - - - - - - - - - - - - - productsList definition and population
		List<Order> ordersList = new ArrayList<>();
		ordersList.add(order1001);
		ordersList.add(order1002);
		ordersList.add(order1003);
		ordersList.add(order1004);
		ordersList.add(order1005);

		System.out.println("");
		System.out.println("Lista degli ordini con prodotti appartenenti alla categoria Baby:");

		// - - - - - - - - - - - - - - - stream
		List<Order> ordersListEsercizio2 = new ArrayList<>();
		ordersListEsercizio2 = ordersList.stream().filter(
				_order -> _order.getProducts().stream().anyMatch(_product -> _product.getCategory().equals("Baby")))
				.toList();

		for (Order _order : ordersListEsercizio2) {
			System.out.println(_order);
		}
	}

}
