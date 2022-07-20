package com.ovd.citymall.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.ovd.citymall.MyUtils;

public class Department {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE   = "\u001B[34m";
	String name;
	ArrayList<Item> itemList = new ArrayList<Item>();
	Shop shop;

	public Department(String name) {
		super();
		this.name = name;
		init();
	}

	private void init() {
		// - Clothing
		if (name.equalsIgnoreCase("Men")) {
			itemList.add(new Item("Shirt", 15.25));
			itemList.add(new Item("Short", 10.25));
			itemList.add(new Item("Pant", 25.25));
		} else if (name.equalsIgnoreCase("Women")) {
			itemList.add(new Item("Shirt", 15.25));
			itemList.add(new Item("Short", 10.25));
			itemList.add(new Item("Pant", 25.25));
		} else if (name.equalsIgnoreCase("Kid")) {
			itemList.add(new Item("Shirt", 15.25));
			itemList.add(new Item("Short", 10.25));
			itemList.add(new Item("Pant", 25.25));
		}
		// Sporting
		else if (name.equalsIgnoreCase("Basketball")) {
			itemList.add(new Item("Ball", 79.99));
			itemList.add(new Item("Hoop", 500.00));
			itemList.add(new Item("Shoes", 200.00));
		} else if (name.equalsIgnoreCase("Soccer")) {
			itemList.add(new Item("Jersey", 65.00));
			itemList.add(new Item("Ball", 25.00));
			itemList.add(new Item("Cleats", 75.00));
		} else if (name.equalsIgnoreCase("Football")) {
			itemList.add(new Item("Ball", 35.25));
			itemList.add(new Item("Helmet", 55.50));
			itemList.add(new Item("Sholder Pads", 65.00));
		}
		// Furniture
		else if (name.equalsIgnoreCase("Kitchen")) {
			itemList.add(new Item("Silverware", 36.50));
			itemList.add(new Item("Refrigerator", 2000.00));
			itemList.add(new Item("Airfryer", 300.00));
		} else if (name.equalsIgnoreCase("Living")) {
			itemList.add(new Item("Couch", 1500.00));
			itemList.add(new Item("Media Stand", 161.25));
			itemList.add(new Item("Rug", 400.00));
		} else if (name.equalsIgnoreCase("Bed")) {
			itemList.add(new Item("Bed Frame", 500.00));
			itemList.add(new Item("Dresser", 200.00));
			itemList.add(new Item("Nigh Stand", 25.25));
		}
		// Book
		else if (name.equalsIgnoreCase("Miscellaneous")) {
			itemList.add(new Item("Sherlock Holmes", 15.25));
			itemList.add(new Item("The Great Gatsby", 10.25));
			itemList.add(new Item("No Longer Human", 25.25));
		} else if (name.equalsIgnoreCase("Graphic Novels")) {
			itemList.add(new Item("Marvel Series", 15.25));
			itemList.add(new Item("DC Comics", 10.25));
			itemList.add(new Item("Friends Game", 25.25));
		} else if (name.equalsIgnoreCase("Light Novels")) {
			itemList.add(new Item("Classroom of the elite", 15.25));
			itemList.add(new Item("The Beginning after the end", 10.25));
			itemList.add(new Item("Solo Leveling", 25.25));
		}
	}

	public void displayMenu(Shop shop) {
		this.shop = shop;
		Scanner scan = new Scanner(System.in);
		System.out.println(ANSI_GREEN + "\nWelcome to " + name + "!" + ANSI_RESET);
		System.out.println(ANSI_BLUE + "\nList of Items:");

		for (int i = 0; i < itemList.size(); i++) {
			System.out.println("  " + (i + 1) + ". " + itemList.get(i).getName());
		}
		System.out.println("\n X - to go back" + ANSI_RESET);

		System.out.println("");
		System.out.println("Please select a number corresponding Shop you want to enter: ");
		String userSelection = scan.nextLine();
		if (MyUtils.isInt(userSelection)) {
			int userSelectionInt = Integer.parseInt(userSelection);
			if (userSelectionInt <= itemList.size()) {
				itemList.get(userSelectionInt - 1).displayMenu(this);
			}
		} else {
			if ("X".equalsIgnoreCase(userSelection)) {
				shop.displayMenu(shop.getShopCategory());
			}
		}
		displayMenu(shop);
		scan.close();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
