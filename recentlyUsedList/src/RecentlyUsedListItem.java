
public class RecentlyUsedListItem<T> implements Comparable<T> {
	
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

	@Override
	public int compareTo(Object obj) {
		RecentlyUsedListItem<?> that;
		if(obj == null) {
			throw new NullPointerException();
		} else if(!(obj instanceof RecentlyUsedListItem<?>)) {
			throw new ClassCastException();
		} else {
			that = (RecentlyUsedListItem<?>)obj;
			if(this.getValue() < that.getValue()) {
				ret
			}
		}
		
		return 0;
	}
}
