package paragraphsandbits;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paragraph: ");
		String inputone = sc.nextLine();
		System.out.println("Enter the word to count: ");
		String inputtwo = sc.nextLine();
		ParagraphWordFrequency pwf = new ParagraphWordFrequency(inputone, inputtwo);
		System.out.println("Word count: " + pwf.wordFrequency(inputone, inputtwo));
//		sc.close();
		System.out.println("Enter a value to find it binary equivalent: ");
		int inp = sc.nextInt();
		DecimalBits db = new DecimalBits(inp);
		System.out.println("The binary value of the input is: " + db.DecimalBits(inp));
		
		
	}

}
