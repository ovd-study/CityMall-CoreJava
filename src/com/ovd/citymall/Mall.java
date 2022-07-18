package com.ovd.citymall;

import java.util.ArrayList;
import java.util.Scanner;

import com.ovd.citymall.shop.ShopCategory;

public class Mall {
	String name;
	ArrayList<ShopCategory> categoryList = new ArrayList<ShopCategory>();
	App app;

	public Mall(String name) {
		super();
		this.name = name;
		init();
	}

	private void init() {
		categoryList.add(new ShopCategory("Clothing"));
		categoryList.add(new ShopCategory("Sporting"));
		categoryList.add(new ShopCategory("Book"));
		categoryList.add(new ShopCategory("Furniture"));
	}

	public void displayMenu(App app) {
		this.app = app;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nWelcome to " + name + "!");
		System.out.println("\nList of Shop Categories:");

		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println("  " + (i + 1) + ". " + categoryList.get(i).getName());
		}
		System.out.println("\n X - to go back");

		System.out.println("");
		System.out.print("Please select a number corresponding Shop Categories you want to enter: ");
		String userSelection = scan.nextLine();
		if (MyUtils.isInt(userSelection)) {
			int userSelectionInt = Integer.parseInt(userSelection);
			if (userSelectionInt <= categoryList.size()) {
				categoryList.get(userSelectionInt - 1).displayMenu(this);
			}
		} else {
			if ("X".equalsIgnoreCase(userSelection)) {
				app.displayMenu();
			}
		}
		displayMenu(app);
		scan.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public App getApp() {
		return app;
	}

	public void setApp(App app) {
		this.app = app;
	}

}
