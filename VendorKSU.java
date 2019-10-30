/*Class:		CSE 1323L/W01
Date:			9/13/2019  
Name:			Terrence Smith
Assgnmt Name:	Vendor  
Assignment#:	Module 2A - Concept of vendor for KSU
Resources: 	Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 		Ch. 7 and 9. Also google on how to change the value of an array element*/

import java.util.Arrays;
import java.util.Scanner;

public class VendorKSU {
	private String name;
	private int id;
	double[] purchases = new double[4];
	//constructor for class
	VendorKSU(String name, int id, double[] purchases) {
		this.name = name;
		this.id = id;
		this.purchases = purchases;
	}
	//gets name
	public String getName() {
		return name;
	}
	//sets name
	public void setName(String name) {
		this.name = name;
	}
	//gets id
	public int getId() {
		return id;
	}
	//sets id
	public void setId(int id) {
		this.id = id;
	}
	//gets purchase
	public double[] getPurchases() {
		return this.purchases;
	}
	//set purchases from array purchases
	public void setPurchases(double[] purchases) {
		this.purchases = purchases;
	}
	
	public String toString() {
		return "Company Name: " + name + "\nVendor ID: " + id + "\nOrders: " + Arrays.toString(purchases);
	}
	//sum purchases array
	public double totalPurchases() {
		double total = 0;
		
		for (int i=0; i<purchases.length; i++) {
			total += purchases[i];
		}
		return total;
	}
	//change element within array
	public void setChangeElement(int place, double amount) {
		purchases[place] = amount;
	}
}








