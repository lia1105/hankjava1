package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s = "Hello world";

		System.out.println(s.substring(4, 8));
		
		String r = "";
		for (int i = s.length() -1; i>=0; i-- ) {
			System.out.print(s.charAt(i));
		}
		String s2 =new String("Jack Tom Eric ");
		System.out.println();
		System.out.println(s2.indexOf('c'));
		String name = "Tom";
		/*name = name.replace("Tom", "boss");
		System.out.println(s2.substring(0, 5)+ name + s2.substring(8,13));*/
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0, index) + "boss" + s2.substring(index + name.length()));
		
		int nn = Integer.parseInt("12");
		nn++;
		System.out.println(nn);
		float f = Float.parseFloat("55.6");
		System.out.println(f);
	}

}
