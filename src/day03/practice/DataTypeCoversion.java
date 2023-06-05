package day03.practice;

public class DataTypeCoversion {

	public static void main(String[] args) {
		
//		string to integer
		String a="3000000";
		int b=Integer.parseInt(a);
		System.out.println(b);
		
//		string to byte
		String c="25";
		byte d=Byte.parseByte(c);
		System.out.println(d);
		
//		string to short
		String e="10000";
		short f=Short.parseShort(e);
		System.out.println(f);
		
//		string to long
		String g="3000000000";
		long h=Long.parseLong(g);
		System.out.println(h);
		
//		string to float
		String i="93.75";
		float j=Float.parseFloat(i);
		System.out.println(j);
		
//		string to double
		String k="3.14159265359";
	    double l=Double.parseDouble(k);
	    System.out.println(l);

	}

}
