package com.ovd.citymall.shop;

public class BookShop extends Shop {

	public BookShop(String name) {
		super(name);
		init();
	}

	private void init() {
		departmentList.add(new Department("Miscellaneous"));
		departmentList.add(new Department("Graphic Novels"));
		departmentList.add(new Department("Light Novels"));
	}
}
