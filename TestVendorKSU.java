/*Class:	CSE 1323L/W01
Date:		9/13/2019  
Name:		Terrence Smith
Assgnmt Name:	Vendor    
Assignment#:	Module 2A - Concept of vendor for KSU
Resources: 	Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 		Ch. 7 and 9. Also google on how to change the value of an array element*/

import java.util.Arrays;
import java.util.Scanner;

public class TestVendorKSU {
	
	public static void main(String[] args) {
		
		double[] orders1 = {150, 200.50, 500.75, 300.99};
		
		VendorKSU v1 = new VendorKSU("NBA", 55555, orders1);
		
		//calls to toString method and inputs v2 data
		System.out.println(v1.toString());
		System.out.println("Total for orders: " + v1.totalPurchases()+"\n");
		
		double[] orders2 = {650, 200.50, 100.75, 225.50};
		
		VendorKSU v2 = new VendorKSU("NFL", 75757, orders2);
		
		//calls to toString method and inputs v2 data
		System.out.println(v2.toString());
		System.out.println("Total for orders: " + v2.totalPurchases()+"\n");
		
		//changes element at index
		v1.setChangeElement(2, 1500);
		v2.setChangeElement(0, 2500.50);
		
		//output to user
		System.out.println("After changes were made by NBA: "+Arrays.toString(v1.getPurchases()));
		System.out.println("After changes were made by NFL: "+Arrays.toString(v2.getPurchases()));

	}
	
}


