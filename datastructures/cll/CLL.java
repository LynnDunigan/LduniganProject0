package edu.frostburg.cosc310.datastructures.cll;

/** Please do not change this class file.  You will need to implement this interface based
 * 		on assignment specifications. */

public interface CLL<T> {
	
	/** Standard CLL behavior */
	public boolean 	add(T element);
	public boolean	remove(T element);
	public void rotate();
	
	
	/** Accounting info */
	public int 		size();
	public boolean 	isEmpty();
	
	/** Return your name */
	public String 	myName();
	public String toString();
}
