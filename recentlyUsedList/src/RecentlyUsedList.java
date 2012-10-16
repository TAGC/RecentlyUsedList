import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RecentlyUsedList<T extends RecentlyUsedListItem<S>, S> implements Set<T> {
	
	private Set<T> itemSet;
	
	public RecentlyUsedList() {
		itemSet = new HashSet<T>();
	}

	@Override
	public boolean add(T e) {
		return itemSet.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		itemSet.addAll(c);
		return false;
	}

	@Override
	public void clear() {
		itemSet.clear();
	}

	@Override
	public boolean contains(Object o) {
		return itemSet.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return itemSet.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return itemSet.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		return itemSet.remove(o);
	}
	
	private T removeRandomItem()
	{
		T item;
		Iterator<T> iter;
		
		iter = iterator();
		if(iter.hasNext()) {
			item = iter.next();
			remove(item);
			return item;
		} else {
			return null;
		}
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return itemSet.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return itemSet.retainAll(c);
	}

	@Override
	public int size() {
		return itemSet.size();
	}
	
	private void addItemToArray(T item, Object[] array) {
		for(int i=0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = item;
			} else if(array[i])
		}
	}

	@Override
	public Object[] toArray() {
		Set<T> itemSetClone = new HashSet<T>();
		Object[] itemArray = new Object[size()];
		itemSetClone.addAll(itemSet);
		T item;
		
		while(!itemSetClone.isEmpty()) {
			item = removeRandomItem();
			addItemToArray(item, itemArray);
			
		}
		Object[] itemArray = new Object[size()];
		
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
