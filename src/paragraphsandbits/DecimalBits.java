package paragraphsandbits;

public class DecimalBits {
	int d;
	
	public DecimalBits() {
		// TODO Auto-generated constructor stub
	}
	public DecimalBits(int d) {
		this.d = d;
	}
	
	public String DecimalBits(int d) {
//		String s = Double.doubleToRawLongBits(d);
//		return s;
		String s = Integer.toBinaryString(d);
		return s;
	}

}
