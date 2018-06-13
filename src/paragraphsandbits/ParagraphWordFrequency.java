package paragraphsandbits;

public class ParagraphWordFrequency {
	String input = "";
	String wordCheck = "";
	
	public ParagraphWordFrequency() {
		// TODO Auto-generated constructor stub
	}
	public ParagraphWordFrequency(String input, String wordCheck) {
		this.input = input;
		this.wordCheck = wordCheck;
	}
	public int wordFrequency(String input, String wordCheck) {
		input = input.replaceAll("[^a-zA-Z0-9\\s]", "");
//		System.out.println(input);
		String[] wordArr = input.split(" ");
//		System.out.println(wordArr[0]);
		int count = 0;
		for(int i = 0; i<wordArr.length; i++) {
			if(wordArr[i].equalsIgnoreCase(wordCheck)) {
				count++;
			}
		}
		return count;
	}
}
