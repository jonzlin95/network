/**
 *   This comment is indented like the ghey CS61B Comment.
 *   Class Board represents a network board which can have pieces placed, removed, and moved. 
 *   This is to describe any other functions blah blah
 **/
 
 public class Board {
	
	/**
	 *  All private data fields of a board.
	 */
	 
	 public static final int EMPTY = 0;
	 public static final int WHITE = 1;
	 public static final int BLACK = 2;
	 private int[][] gameBoard;
	 public static final int DIMENSION = 8;
	 
	 /** 
	  *   Constructs a new empty network board with dimensions of DIMENSION
	  **/
	 
	 public Board() {
		gameBoard = new int[DIMENSION][DIMENSION];
	 }
	 
	 /**
	  *   addPiece() adds a piece of int color to the board at dimensions (int x, int y) IF
	  *   the position x,y is EMPTY on AND the color of the piece is either WHITE or BLACK.
	  *   If the position at x,y is not empty, addPiece() throws a __________ exception
	  **/
	 
	 public void addPiece (int x, int y, int color) {
		if (gameboard[x][y] == EMPTY && (color == WHITE || color == BLACK)) {
			gameboard[x][y] = color;
		}
	 }
	 
	 /**
	  *   removePiece() removes the piece at position (int x, int y)
	  *   If the position at x,y is empty, removePiece() throws a _________ exception
	  **/
	 
	 public void removePiece (int x, int y) {
		if (gameboard[x][y] == WHITE || gameboard[x][y] == BLACK) {
			gameboard[x][y] == EMPTY;
		}
	 }
	
 }