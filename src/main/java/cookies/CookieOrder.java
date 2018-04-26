package cookies;

public class CookieOrder {

	private String variety;
	private int getBoxCount;

	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.getBoxCount = numBoxes;
	}

	public String getVariety() {

		return variety;
	}

	public int getGetBoxCount() {
		
		return getBoxCount;
	}

}
