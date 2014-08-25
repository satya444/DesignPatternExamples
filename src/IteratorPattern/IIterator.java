package IteratorPattern;

/**
 * ITERATORS FOR ARRAYS, LINKEDLISTS, ARRAYLISTS ARE DIFFERENT. WE TRY TO
 * IMPLEMENT A COMMON INTERFACE WHICH HAS SET OF COMMON METHODS
 * 
 * @author Dilip
 * 
 */
public interface IIterator {

	public String first();

	public boolean isDone();

	public String getCurrentElement();

	public String next();

}
