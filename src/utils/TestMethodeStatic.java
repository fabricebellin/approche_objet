package utils;
import java.lang.Integer;


public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "4";
		System.out.println(chaine);

		
		Integer chaineInt = Integer.valueOf(chaine);
		
		System.out.println(chaineInt);
		
		int a = 3;
		int b = 5;
		
		int max = Integer.max(a, b);
		
		System.out.println("Le maximum entre " + a + " et " + b + " est " + max);

	}

}
