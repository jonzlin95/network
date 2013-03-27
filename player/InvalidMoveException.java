/* InvalidMoveException.java */

package player;

/**
 *  Implements an Exception that signals an invalid Move (add, step (while removing or adding), quit)
 */

public class InvalidMoveException extends Exception {
	protected InvalidMoveException() {
		super();
	}
}