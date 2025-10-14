package com.tnsif.PackageAndAccessModifier;


public class AccessModifier {
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int defaultVar = 40;
	public String name="swey";
	private String dept="IT";

	
	
	
	public void show() {
		System.out.println("Public Variable: "+ publicVar);
		System.out.println("Private Variable: "+ privateVar);
		System.out.println("Protected Variable: "+ protectedVar);
		System.out.println("Default Variable: "+ defaultVar);
		System.out.println("nname of the std "+name+" dept "+dept);
	}

	public static void main(String[] args) {
		
		AccessModifier ame = new AccessModifier();
		ame.show();
		

	}

}
