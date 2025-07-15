package ticTacToe;

import java.util.Scanner;

public class Main {

	public static void displayBoard(int[][] game) {
		
		System.out.println("\t\t\t\t+--- --- ---+\n\t\t\t\t| "+game[0][0]+" | "+game[0][1]+" | "+game[0][2]+" |"+
							"\n\t\t\t\t ___ ___ ___ \n\t\t\t\t| "+game[1][0]+" | "+game[1][1]+" | "+game[1][2]+" |"+
							"\n\t\t\t\t ___ ___ ___ \n\t\t\t\t| "+game[2][0]+" | "+game[2][1]+" | "+game[2][2]+" |"+
							"\n\t\t\t\t+--- --- ---+");
	}

	public static void main(String[] args) {
		
		int[][] gameBoard = new int[3][3];
		int chance=1;
		
		Scanner sc = new Scanner(System.in);
		
		Main.displayBoard(gameBoard);
		
		while(true) {
			if((gameBoard[0][0]==1 && gameBoard[0][1]==1 && gameBoard[0][2]==1) || (gameBoard[0][0]==1 && gameBoard[1][0]==1 && gameBoard[2][0]==1) || (gameBoard[0][0]==1 && gameBoard[1][1]==1 && gameBoard[2][2]==1)){
				System.out.println("Player 1 won");
				break;
			}
			if((gameBoard[0][0]==2 && gameBoard[0][1]==2 && gameBoard[0][2]==2) || (gameBoard[0][0]==2 && gameBoard[1][0]==2 && gameBoard[2][0]==2) || (gameBoard[0][0]==2 && gameBoard[1][1]==2 && gameBoard[2][2]==2)) {
				System.out.println("Player 2 won");
				break;
			}
			
			
			if((gameBoard[1][0]==1 && gameBoard[1][1]==1 && gameBoard[1][2]==1) || (gameBoard[0][1]==1 && gameBoard[1][1]==1 && gameBoard[2][1]==1) || (gameBoard[2][0]==1 && gameBoard[1][1]==1 && gameBoard[0][2]==1)){
				System.out.println("Player 1 won");
				break;
			}
			if((gameBoard[1][0]==2 && gameBoard[1][1]==2 && gameBoard[1][2]==2) || (gameBoard[0][1]==2 && gameBoard[1][1]==2 && gameBoard[2][1]==2) || (gameBoard[2][0]==2 && gameBoard[1][1]==2 && gameBoard[0][2]==2)) {
				System.out.println("Player 2 won");
				break;
			}
			
			
			if((gameBoard[2][0]==1 && gameBoard[2][1]==1 && gameBoard[2][2]==1) || (gameBoard[0][2]==1 && gameBoard[1][2]==1 && gameBoard[2][2]==1)){
				System.out.println("Player 1 won");
				break;
			}
			if((gameBoard[2][0]==2 && gameBoard[2][1]==2 && gameBoard[2][2]==2) || (gameBoard[0][2]==2 && gameBoard[1][2]==2 && gameBoard[2][2]==2)) {
				System.out.println("Player 2 won");
				break;
			}
			
			System.out.println("\nYour turn Player "+chance);
			System.out.print("\nEnter your choice ->"); int place = sc.nextInt();
			if(place == 1 && gameBoard[0][0]==0) {
				gameBoard[0][0] = chance;
				chance=(chance%2+1);
			}
			else if(place == 2 && gameBoard[0][1]==0) {
				gameBoard[0][1] = chance;
				chance=(chance%2+1);
			}
			else if(place == 3 && gameBoard[0][2]==0) {
				gameBoard[0][2] = chance;
				chance=(chance%2+1);
			}
			else if(place == 4 && gameBoard[1][0]==0) {
				gameBoard[1][0] = chance;
				chance=(chance%2+1);
			}
			else if(place == 5 && gameBoard[1][1]==0) {
				gameBoard[1][1] = chance;
				chance=(chance%2+1);
			}
			else if(place == 6 && gameBoard[1][2]==0) {
				gameBoard[1][2] = chance;
				chance=(chance%2+1);
			}
			else if(place == 7 && gameBoard[2][0]==0) {
				gameBoard[2][0] = chance;
				chance=(chance%2+1);
			}
			else if(place == 8 && gameBoard[2][1]==0) {
				gameBoard[2][1] = chance;
				chance=(chance%2+1);
			}
			else if(place == 9 && gameBoard[2][2]==0) {
				gameBoard[2][2] = chance;
				chance=(chance%2+1);
			}
			else System.out.println("Wrong value, try again");
			
//			for(int i=0; i<3;i++) {
//				for(int j=0; j<3; j++) {
//					System.out.print(gameBoard[i][j]+" | ");
//				}
//				System.out.println();
//			}
			Main.displayBoard(gameBoard);
			
			}
		}
	}

