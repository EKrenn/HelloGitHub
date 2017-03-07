package Warenkorb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CartDemo {
	public static void main(String[] args) {
		List<Cart> liste = new ArrayList<Cart>();
		
		liste.add(new Cart("Krenn", 3, 20, 33.0));
		liste.add(new Cart("Schlaipfer", 2, 30, 220.8));
		liste.add(new Cart("Wastl", 5, 22, 34.5));
		liste.add(new Cart("Loibner", 1, 456, 3333.7));
		
		Collections.sort(liste);
		for (Cart cart : liste) {
			System.out.println(cart);
		}
		
		System.out.println("------------------");
		Collections.sort(liste, new CartTotalItemsComparator());
		for (Cart cart : liste) {
			System.out.println(cart);
		}
		
		System.out.println("------------------");
		Collections.sort(liste, new CartUsernameComparator());
		for (Cart cart : liste) {
			System.out.println(cart);
		}
		
		System.out.println("Anonym -------------------");
		Collections.sort(liste, new Comparator<Cart>() {

			@Override
			public int compare(Cart o1, Cart o2) {
				double avg1 = o1.getTotalAmount() / o1.getTotalItems();
				double avg2 = o2.getTotalAmount() / o2.getTotalItems();
				if(avg1 < avg2)
					return -1;
				if (avg1 > avg2)
					return 1;
				return 0;
			}
			
		});
		for (Cart cart : liste) {
			System.out.println(cart);
		}
	}
}
