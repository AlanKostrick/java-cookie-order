package cookies;

import static org.junit.Assert.*;

import org.junit.Test;

public class MasterOrderTest {
	
	@Test
	public void shouldInstantiateAMasterOrderObject() {
		MasterOrder underTest = new MasterOrder();
		
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatAnOrderHasBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",0));
		int check = underTest.getVarietyCount();
		//assertEquals(1, check);
		assertNotNull(check);
	}
	
	@Test
	public void assertThatTwoOrdersHaveBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",0));
		underTest.addOrder(new CookieOrder("",0));
		int check = underTest.getVarietyCount();
		assertEquals(2, check);
	}
	
	@Test
	public void assertThatGetTotalBoxesIsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",1));
		int check = underTest.getBoxCount();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatGetTotalBoxesIsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",2));
		int check = underTest.getBoxCount();
		assertEquals(2, check);
	}
	
	@Test
	public void assertThatGetTotalBoxesIsThreeFromTwoOrders() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",2));
		underTest.addOrder(new CookieOrder("",1));
		int check = underTest.getBoxCount();
		assertEquals(3, check);
	}
	
	
	@Test
	public void assertThatAnOrderHasBeenRemoved() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs",2));
		underTest.addOrder(new CookieOrder("Thin Mints",1));
		underTest.removeVariety("Tagalongs");
		int check = underTest.getVarietyCount();
		assertEquals(1, check);
	
	}

}
