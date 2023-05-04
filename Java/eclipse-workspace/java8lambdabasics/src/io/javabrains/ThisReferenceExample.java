package io.javabrains;

import java.security.PublicKey;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.proceess(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);

		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		/*
		 * AANNONYMUS INNER CLASS thisReferenceExample.doProcess(10, new Process() {
		 * 
		 * @Override public void proceess(int i) { System.out.println("Value of i is "+
		 * i); System.out.println(this);
		 * 
		 * }
		 * 
		 * public String toString() { return "This is the anonymus inner class"; }
		 * 
		 * });
		 */

		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);

		});
		
		thisReferenceExample.execute();

	}
	
	public String toString() {
		return "This is the main ThisReferenceExample class instance"; 
	}

}
