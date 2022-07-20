package com.ovd.citymall;

import java.util.ArrayList;
import java.util.Scanner;

public class App extends Object {
	ArrayList<Mall> mallList = new ArrayList<Mall>();;

	public App() {
		super();
		init();
	}

	private void init() {
		this.mallList.add(new Mall("OVD City Mall"));
	}

	public void displayMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("List of Malls \n");

		for (int i = 0; i < mallList.size(); i++) {
			System.out.print("  " + (i + 1) + ". " + mallList.get(i).getName());
		}

		System.out.println("");
		System.out.print("\nPlease select a number corresponding Mall you want to enter: ");
		String userSelection = scan.nextLine();
		if (MyUtils.isInt(userSelection)) {
			int userSelectionInt = Integer.parseInt(userSelection);
			if (userSelectionInt <= mallList.size()) {
				mallList.get(userSelectionInt - 1).displayMenu(this);
			}
		} else {
			if ("X".equalsIgnoreCase(userSelection)) {
				System.exit(0);
			}
		}
		displayMenu();
		scan.close();
	}

	// ------------------------ Entry point -------------

	public static void main(String[] args) {
		App myApp = new App();
		myApp.displayMenu();
	}

}