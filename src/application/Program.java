package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		String s1 = "Test";
		String s2 = "Test";
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));  // compare content
		System.out.println(c1 == c2); // also compare the memory reference when instantiated
	
		System.out.println(s1 == s2); // not instantiated
	}

}
