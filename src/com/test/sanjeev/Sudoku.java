package com.test.sanjeev;

import java.util.ArrayList;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
		
		
		
		int[][] a =  {
{8, 4, 9, 0, 0, 3, 5, 7, 0},
{0, 1, 0, 0, 0, 0, 0, 0, 0},
{7, 0, 0, 0, 9, 0, 0, 8, 3},
{0, 0, 0, 9, 4, 6, 7, 0, 0},
{0, 8, 0, 0, 5, 0, 0, 4, 0},
{0, 0, 6, 8, 7, 2, 0, 0, 0},
{5, 7, 0, 0, 1, 0, 0, 0, 4},
{0, 0, 0, 0, 0, 0, 0, 1, 0},
{0, 2, 1, 7, 0, 0, 8, 6, 5}
		};
		
		
	
		
		
		System.out.println(solve_sudoku_puzzle(a));
	}
	static ArrayList<ArrayList<Integer>> solve_sudoku_puzzle( int[][]board) {
        // Write your code here.
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 ret.add(new ArrayList<Integer>());
		 for(int i=0;i<9;i++)
			 for(int j=0;j<9;j++)
				 ret.get(i).add(board[i][j]);
		 solve(0, 0,  board,ret);;
        return ret;
    }
	public static boolean solve(int row, int col,int[][] board, ArrayList<ArrayList<Integer>> ret){

		  if (board[row][col]!= 0)
		   nextCell(row, col,board,ret);

		  else {
		   // Try the vacant cell with every Number
		   for (int num = 1; num <= 9; num++) {

		    // check if current number can fit the cell with the given
		    // constraints
		    if (isValid(row, col, num, board)) {
		     board[row][col] = num; // Assuming to be true
		     ret.get(row).add(num);
		     if (row == 8 && col == 8) {
		    		    	
		      return true;
		     }

		     if (solve(row, col, board,ret)) // will be called again and other cells
		      return true;    // will be processed
		      
		     // printSoduku();
		     board[row][col] = 0; // Reverting
		     ret.get(row).set(col, 0);
		    }
		   }
		  }
		  return false; // will be reached if for any cell none of the number(1-9)
		      // fit
		 }

		 /**
		 * Find the next free cell
		 * @return , true if free cell found and currentRow and currentColumn are set
		 */
		 private static void nextCell(int row, int col, int[][]board, ArrayList<ArrayList<Integer>> ret) {
		  if (col < 8)
		   solve(row, col + 1,board,ret);
		  else if (row < 8)
		   solve(row + 1, 0,board,ret);
		 }
		 private static boolean isValid(int row, int col, int num, int[][] board) {
			  return checkRow(row, col, num,board) && checkCol(row, col, num, board)
			    && checkBox(row - row % 3, col - col % 3, num, board);
			 }

			 /**
			 * Check particular for the existance of given number (in a particular row)
			 * @return true if the number does not exist
			 */
			 private static boolean checkRow(int row, int col, int num, int[][] board) {
			  for (int c = 0; c < 9; c++)
			   if (board[row][c] == num)
			    return false;
			  return true;
			 }

			 /**
			 * Check particular for the existance of given number (in a particular col)
			 * @return true if the number does not exist
			 */
			 private static boolean checkCol(int row, int col, int num, int[][] board) {
			  for (int r = 0; r < 9; r++)
			   if (board[r][col] == num)
			    return false;
			  return true;
			 }

			 /**
			 * Check particular for the existance of given given BOX
			 * @return true if the number does not exist
			 */
			 private static boolean checkBox(int row, int col, int num, int[][] board) {
			  for (int r = 0; r < 3; r++) {
			   for (int c = 0; c < 3; c++) {
			    if (board[r + row][c + col] == num)
			     return false;
			   }
			  }
			  return true;
			 }
}
