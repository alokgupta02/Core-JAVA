package com.practise;

public class EnumExample {

	public enum Menu {
		TEA(10), COFFEE(20), SOFTDRINK(30), LEMONADE(15);

		private int price;

		Menu(int i) {
			price = i;
		}

		int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		// traversing the enum

		System.out.println("Menu");
		System.out.println("----");
		for (Menu s : Menu.values())
			System.out.println(s + " - " + s.price);

		System.out.println("Value of " + Menu.valueOf("TEA"));
		System.out.println("Ordinal of COFFEE: " + Menu.valueOf("COFFEE").ordinal());
	}

}
