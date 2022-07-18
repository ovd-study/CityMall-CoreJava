package com.ovd.citymall.shop;

public class BookShop extends Shop {

	public BookShop(String name) {
		super(name);
		init();
	}

	private void init() {
		departmentList.add(new Department("Fiction"));
		departmentList.add(new Department("Non-Fiction"));
		departmentList.add(new Department("Educational"));
	}
}
