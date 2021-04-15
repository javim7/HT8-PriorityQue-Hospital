//Referencia de la clase PriorityQueue
// Libro (c) 1998,2001 duane a. bailey

/*
 * </pre>
 * @version $Id: PriorityQueue.java 34 2007-08-09 14:43:44Z bailey $
 * @author, 2001 duane a. bailey
 */

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	public int size();
	// post: returns number of elements within queue
	
	public void clear();
	// post: removes all elements from queue
}