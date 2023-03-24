package Lambda_Expression;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.ToString;

@ToString
public class Shop {

	public static void main(String[] Args) {

		customer client = new customer((long) 1, "Luca", 1);
		customer client2 = new customer((long) 2, "Kevin", 2);
		customer client3 = new customer((long) 3, "Bebo", 1);
		customer client4 = new customer((long) 4, "Dany", 3);
		customer client5 = new customer((long) 5, "Vichi", 5);

		product newProd = new product((long) 5264, "Iphone ", "Phone", 1294.25);
		product newProd2 = new product((long) 5594, "Imac", "Computer", 2494.00);
		product newProd3 = new product((long) 6541, "Magic mouse", "Accessories", 94.25);
		product newProd4 = new product((long) 4525, "Apple keyboard", "Accessories", 74.38);
		product newProd5 = new product((long) 7854, "Ipad", "Tablet", 974.38);
		product newProd6 = new product((long) 0124, "Via col vento", "Book", 974.38);
		product newProd6_Bebo = new product((long) 7885, "Green lights", "Book", 174.38);
		product newProd7 = new product((long) 5854, "Harry Potter and The Deathly Hallows part 1", "Book", 125.38);
		product newProd8 = new product((long) 7851, "Colora e impara", "Baby", 154.38);
		product newProd9 = new product((long) 9854, "Farcisci i bignè", "Baby", 24.38);
		product newProd10 = new product((long) 2347, "Men's Health", "Boys", 514.38);
		product newProd11 = new product((long) 0154, "X-box One", "Boys", 14.38);

		List<product> orders = new ArrayList<product>();
		orders.add(newProd);
		orders.add(newProd10);
		orders.add(newProd8);
		List<product> orders2 = new ArrayList<product>();
		orders2.add(newProd2);
		orders2.add(newProd6_Bebo);
		orders2.add(newProd7);
		orders2.add(newProd7);
		orders2.add(newProd7);
		List<product> orders3 = new ArrayList<product>();
		orders3.add(newProd3);
		orders3.add(newProd9);
		orders3.add(newProd10);
		List<product> orders4 = new ArrayList<product>();
		orders4.add(newProd4);
		orders4.add(newProd10);
		orders4.add(newProd8);
		List<product> orders5 = new ArrayList<product>();
		orders5.add(newProd5);
		orders5.add(newProd7);
		orders5.add(newProd9);

		order order_1 = new order((long) 11555, "delivered", LocalDate.parse("2020-02-21"),
				LocalDate.parse("2020-02-22"), orders, client);
		order order_2 = new order((long) 20245, "delivered", LocalDate.parse("2020-02-21"),
				LocalDate.parse("2020-02-22"), orders2, client);
		order order_3 = new order((long) 12595, "delivered", LocalDate.parse("2020-02-21"),
				LocalDate.parse("2020-02-22"), orders3, client);
		order order_4 = new order((long) 32485, "delivered", LocalDate.parse("2020-02-21"),
				LocalDate.parse("2020-02-22"), orders4, client);
		order order_5 = new order((long) 54515, "delivered", LocalDate.parse("2020-02-21"),
				LocalDate.parse("2020-02-22"), orders5, client);

		List<order> myorders = new ArrayList<order>();
		myorders.add(order_1);
		myorders.add(order_2);
		myorders.add(order_3);
		myorders.add(order_4);
		myorders.add(order_5);

		List<product> myproduct = new ArrayList<product>();
		myproduct.add(newProd);
		myproduct.add(newProd2);
		myproduct.add(newProd3);
		myproduct.add(newProd4);
		myproduct.add(newProd5);
		myproduct.add(newProd6);
		myproduct.add(newProd6_Bebo);
		myproduct.add(newProd7);
		myproduct.add(newProd8);
		myproduct.add(newProd9);
		myproduct.add(newProd10);
		myproduct.add(newProd11);

		// 1

		List<product> s = myproduct.stream().filter(prodotto -> prodotto.category.equals("Book") && prodotto.price > 100).distinct()
				.collect(Collectors.toList());
		System.out.println(s.toString());

		// 2

		List<order> babyOrders = myorders.stream()
				.filter(mp -> mp.getProducts().stream().anyMatch(prodotto -> prodotto.getCategory().equals("Baby")))
				.collect(Collectors.toList());

		List<String> babyCustomers = babyOrders.stream().map(x -> x.getCustomer()).map(w -> w.name).distinct()
				.collect(Collectors.toList());

		System.out.println("Baby orders:");
		babyOrders.forEach(x->System.out.println(x));
		System.out.println("Customers with baby orders:");
		babyCustomers.forEach(System.out::println);
		
		// 3 
		
	
		 List<product> boys = myproduct.stream().filter(x->x.category.equals("Boys")).collect(Collectors.toList());;
		 List<product> sale= myproduct.stream().filter(x->x.category.equals("Boys")).map(x->{
			 x.getPrice();
			 
			 return x;
			 
			 
			 
		 }	 
				 ).collect(Collectors.toList());
		 System.out.println(boys.toString() + sale.toString());
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		  
	}

}
