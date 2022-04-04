package com.customer.services;

public class CustomerServices {

	int a;// class variable
	static String name = "Calling customer";// static variable
	static float c = 25.00f;

	public void airtelCustomercare() {
		int a = 121;// local variable
		System.out.println("Airtel Customer Care No: " + a);
		System.out.println("Airtel Customer Care Action: " + name);
		// calling static variable in non static method
	}

//used static method- so all variables are static
	static void vodafoneCustomerCare() {
		int b = 123;// static variable
		String name = " Calling Customer";// static variable
		System.out.println("Vodafone Customer Care No: " + b);
		System.out.println("Vodafone Customer Care Action: " + name);

	}

	// local variable
	void jioCustomerCare() {
		int c = 198;
		System.out.println("JIO Customer Care No: " + c);
		System.out.println("JIO Customer Care Action: " + name);
		System.out.println("For Tamil press: " + a);
		// calling class variable
	}

//static block
	static {
		System.out.println("TRIA:");
	}
	// multiple static block used here for checking
	static {
		System.out.println("Customer Care Details ");
	}
	// Non-static Block
	{
		int d = 1800001210;
		System.out.println("TOLL FREE NO:" + d);
	}

//static method - so all variables are static
	static void aircelCustomerCare() {
		int a = 196;// static variable
		String name = "calling Customer";// static variable
		System.out.println("Aircel Customer Care No: " + a);
		System.out.println("Aircel Customer Care Action: " + name);
	} 
	public static void main(String[] args) {

		CustomerServices cs = new CustomerServices();
		cs.airtelCustomercare();// calling non static method
		vodafoneCustomerCare();// calling static method
		cs.jioCustomerCare();// calling non-static method
		aircelCustomerCare();// calling static method
		System.out.println("Customer's Usage: " + c + "% per Networks");
//calling static variable which is used outside the method
	}
}
