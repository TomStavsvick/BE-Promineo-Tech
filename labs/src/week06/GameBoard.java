package week06;

public class GameBoard {

	private Character[][] boxes = new Character[3][3];
	private int moveCounter = 0;
	
	public GameBoard() {
		clearGameBoard();
	}
	
	public void clearGameBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				boxes[i][j] = ((Integer)(3*i + j + 1)).toString().charAt(0);
			}
		}
		moveCounter = 0;
	}
	
	public boolean noMoreMoves() {
		return moveCounter == 9;
	}
	
	public void displayBoard() {
		System.out.println("+---+---+---+");
		System.out.println(String.format("| %c | %c | %c |", boxes[0][0], boxes[0][1], boxes [0][2]));
		System.out.println("+---+---+---+");
		System.out.println(String.format("| %c | %c | %c |", boxes[1][0], boxes[1][1], boxes [1][2]));
		System.out.println("+---+---+---+");
		System.out.println(String.format("| %c | %c | %c |", boxes[2][0], boxes[2][1], boxes [2][2]));
		System.out.println("+---+---+---+");
	}
	
	public boolean setX(int boxNumber) {
		if(boxNumber > 0 && boxNumber < 10) {
			if(!boxes[(boxNumber-1)/3][(boxNumber-1)%3].equals('X') && !boxes[(boxNumber-1)/3][(boxNumber-1)%3].equals('O')) {
				boxes[(boxNumber-1)/3][(boxNumber-1)%3] = 'X';
				moveCounter++;
				return true;
			}
		}
		return false;
	}
	public boolean setO(int boxNumber) {
		if(boxNumber > 0 && boxNumber < 10) {
			if(!boxes[(boxNumber-1)/3][(boxNumber-1)%3].equals('X') && !boxes[(boxNumber-1)/3][(boxNumber-1)%3].equals('O')) {
				boxes[(boxNumber-1)/3][(boxNumber-1)%3] = 'O';
				moveCounter++;
				return true;
			}
		}
		return false;
	}
	public boolean checkWinStatus() {
		//One for loop can check the rows and columns with an if statement in each loop
		for(int i=0; i<3; i++) {
			if(boxes[i][0].equals(boxes[i][1]) && boxes[i][0].equals(boxes[i][2])) {
				//Winner in row i
				System.out.println("The Winner is " + boxes[i][0].toString() + " in Row " + i + "!");
				return true;
			} else if(boxes[0][i].equals(boxes[1][i]) && boxes[0][i].equals(boxes[2][i])) {
				//winner in column i
				System.out.println("The Winner is " + boxes[0][i].toString() + " in Column " + i + "!");
				return true;
			}
		}
		//Diagonals need to be handled separately
		if(boxes[0][0].equals(boxes[1][1]) && boxes[0][0].equals(boxes[2][2])) {
			System.out.println("The Winner is " + boxes[0][0].toString() + " Diagonally (Top Left to Bottom Right)!");
			return true;
		} else if(boxes[2][0].equals(boxes[1][1]) && boxes[2][0].equals(boxes[0][2])) {
			System.out.println("The Winner is " + boxes[2][0].toString() + " Diagonally (Bottom Left to Top Right)!");
			return true;
		}
		//Nobody won, return false
		return false;
	}
	
}
