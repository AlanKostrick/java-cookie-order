package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	private List<CookieOrder> orders = new ArrayList<>();

	public void addOrder(CookieOrder theOrder) {

		orders.add(theOrder);

	}

	public int getVarietyCount() {

		return orders.size();
	}

	public int getBoxCount() {
		int boxes = 0;

		// for(int i=0; i<orders.size(); i++) {
		// boxes += orders.get(i).getNumBoxes();
		// }
		for (CookieOrder order : orders) {
			boxes += order.getGetBoxCount();
		}
		return boxes;
	}

	public void removeVariety(String variety) {
		for (int i = orders.size() - 1; i >= 0; i--) {
			if (orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}

	public void showOrder() {
		for (CookieOrder order : orders) {
			System.out.println("Variety: " + order.getVariety() +
					" Boxes: " + order.getGetBoxCount());
		}
	}

}
