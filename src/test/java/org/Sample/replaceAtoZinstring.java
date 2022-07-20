package org.Sample;

public class replaceAtoZinstring {

	public static void main(String[] args)  {
			String str="Sudhais Good 7978i68 ^^&&*";
					
					
		String	s=	str.replaceAll("[^a-z0-9A-Z]", "***");
					
					System.out.println(s);
					
					//Special Characters include Space as well
	}

}
