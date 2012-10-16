
public class RecentlyUsedListItem<T> {
	
	private int lastUsed;
	private T value;
	
	public RecentlyUsedListItem(T value) {
		this.value = value;
		lastUsed  = 0;
	}
	
	public int getLastTimeUsed() {
		return lastUsed;
	}
	
	public T getValue() {
		return value;
	}
}
