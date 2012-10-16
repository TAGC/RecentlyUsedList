import org.junit.Test;
import junit.framework.TestCase;

public class RecentlyUsedListTests extends TestCase {
	
	@Test
	public void testAddItemToList() {
		RecentlyUsedList<Integer> l = new RecentlyUsedList<Integer>();
		l.add(5);
		System.out.println(l.get(0) != null && l.get(0).equals(5));
		assertTrue(l.get(0) == 5);
	}
	
	@Test
	public void testRemoveItemFromList() {
		
	}
}
