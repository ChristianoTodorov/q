import java.util.Scanner;

public class Main {

	static boolean realSudoku(int[][] grid,int r,int s,int value) {
		if(value==0) {
			return false;
		}
	    int X = (int)Math.floor(r / 3) * 3;
	    int Y = (int)Math.floor(s / 3) * 3;
	    
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (grid[i + X][j + Y] == value && i+X!=r && j+Y != s) {
	                return false;
	            }
	        }
	    }
	    for (int w = 0; w < 9; w++) {
	        if ((grid[r][w] == value || grid[w][s] == value) && w != s && w != r) { //39
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		
		int[][] realSudoku ={{5,3,4,6,7,8,9,1,2},
                			{6,7,2,1,9,5,3,4,8},
                			{1,9,8,3,4,2,5,6,7},
                			{8,5,9,7,6,1,4,2,3},
                			{4,2,6,8,5,3,7,9,1},
                			{7,1,3,9,2,4,8,5,6},
                			{9,6,1,5,3,7,2,8,4},
                			{2,8,7,4,1,9,6,3,5},
                			{3,4,5,2,8,6,1,7,9}};
		int[][] notSoRealSudoku = {{5,3,4,6,7,8,9,1,2},
    							  {6,7,2,1,9,5,3,4,8},
    							  {1,9,8,3,4,2,5,6,7},
    							  {8,5,9,7,6,1,4,2,3},
    							  {4,2,6,8,5,3,7,9,1},
    							  {7,1,3,9,2,4,8,5,6},  // 2 (uprostøed øádku)
    							  {9,6,1,5,2,7,2,8,4},  // 2
    							  {2,8,7,4,1,9,6,3,5},
    							  {3,4,5,2,8,6,1,7,9}};
		boolean answer;
		for(int i = 0;i<9;i++) {
			for(int j = 0;j<9;j++) {
				if(!realSudoku(notSoRealSudoku,i,j,notSoRealSudoku[i][j])) {
					System.out.println("Sudoku není dokonèeno nebo je špatnì vyplnìné");
					return;
				}	
				}
			}
		System.out.println("Sudoku je doopravdy vyøešené !");
		}
	}