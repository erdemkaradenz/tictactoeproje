package tictacToe;

import java.util.Scanner;

public class Sonuc {
	 public static void main(String[] args) {
	        Scanner userInputReader = new Scanner(System.in);

	        Tablo board = new Tablo();
	        board.instructionBoard();
	        System.out.println("Baslangic sizde X sizsiniz. Lutfen secmek istediginiz yeri giriniz:");
	        int position = Integer.parseInt(userInputReader.nextLine());
	        board.placePiece(position, "X");

	        boolean isGameInProgress = Oyun.resolve(board.getBoard())==Oyun.GameState.IN_PROGRESS;

	        while( isGameInProgress && !board.isFull()){

	            board.placePieceRandomly("O");
	            board.displayBoard();
	            System.out.println("Lutfen secmek istediginiz yeri giriniz:");
	            position = Integer.parseInt(userInputReader.nextLine());
	            board.placePiece(position, "X");

	            isGameInProgress = Oyun.resolve(board.getBoard())==Oyun.GameState.IN_PROGRESS;

	        }
	        if(!isGameInProgress) {
	            board.displayBoard();
	            System.out.print("OYUN BİTTİ");
	        }
	        else board.displayBoard();
	    }

}
