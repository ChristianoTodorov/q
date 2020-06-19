import java.util.ArrayList;
import java.util.LinkedList;

class Main {
	static boolean possible(int[][] grid,int r,int s,int value){ // check 3x3 square, check row, check column
	    int X = (r/3)*3;
	    int Y = (s/3)*3;
	    for(int i = 0;i<3;i++){
	        for(int j = 0;j<3;j++){
	            if(grid[i+X][j+Y]==value){
	                return false;
	            }
	        }
	    }
	    for(int w = 0;w<9;w++){
	        if(grid[r][w]==value||grid[w][s]==value){
	            return false;
	        }
	    }
	    return true;
	}
	static ArrayList<Pozice> freeSpace = new ArrayList<Pozice>();
	static int pocetBacktracku = 1;
	static Pozice aktualniDeadEnd; 
	
	public static void solve(int[][] grid){

    for(int r = 0;r<9;r++){
        for(int s = 0;s<9;s++){
            if(grid[r][s]==0){
            boolean duplicates = false;
               for(int x = 0;x<freeSpace.size();x++){
                    if(freeSpace.get(x)==new Pozice(r,s,grid[r][s])){
                            duplicates = true;
                            break;
                          }
                     }
                        if(duplicates==false){
                        freeSpace.add(new Pozice(r,s,grid[r][s]));
                        }
                for(int i = 1;i<10;i++){
                    if(possible(grid,r,s,i)){
                        grid[r][s] = i;
                        solve(grid);
                    }
                }
                backtrack(grid,r,s);
                //solve(grid);
        }
        
    }
}
}
static void backtrack(int[][] grid,int deadR,int deadS){
    boolean free = false;

    for(int i = 0;i<9;i++){
        for(int j = 0;j<9;j++){
            if(grid[i][j]==0){
                free=true;
            }
        }
    }
    if(free==false){
        return;
    }

    if(aktualniDeadEnd!=new Pozice(deadR,deadS,grid[deadR][deadS])||aktualniDeadEnd==null){
        aktualniDeadEnd = new Pozice(deadR,deadS,grid[deadR][deadS]);
        pocetBacktracku = 1;    
    }
    int x = 0;
        for(int i = 0;i<freeSpace.size();i++){
                if(freeSpace.get(i)==aktualniDeadEnd){
                x = i-pocetBacktracku;
                x++;
                }
        }       
    int w = freeSpace.get(x).getValue();
    w++;  
    
    int id1 = freeSpace.get(x).getPozX();    
    int id2 = freeSpace.get(x).getPozY();

        for(int i = x;i<freeSpace.size();i++){
            freeSpace.get(i).setValue(0); 
        }

    for(;w<10;w++){                 
        if(possible(grid,id1,id2,w)){    
        grid[id1][id2] = w;
        pocetBacktracku = 1; 
        return;
        }
    }
    grid[id1][id2] = 0;
    pocetBacktracku++;
    backtrack(grid,deadR,deadS);
}
	
	                                                                       // Musíme se vrátit o 1 pozici zpìt
  public static void main(String[] args) {
	  
	  int [][] board = {{5,3,0,0,7,0,0,0,0},
	                    {6,0,0,1,9,5,0,0,0},
	                    {0,9,8,0,0,0,0,6,0},
	                    {8,0,0,0,6,0,0,0,3},
	                    {4,0,0,8,0,3,0,0,1},
	                    {7,0,0,0,2,0,0,0,6},
	                    {0,6,0,0,0,0,2,8,0},
	                    {0,0,0,4,1,9,0,0,5},
	                    {0,0,0,0,8,0,0,7,9}};
	 
	  solve(board);
	  System.out.println();
	  for(int i = 0;i<9;i++) {
		  System.out.print("|| ");
		  for(int j = 0;j<9;j++) {
			  if(j==2||j==5||j==8) {
				  System.out.print(board[i][j]+" || ");
			  }else
			  System.out.print(board[i][j]+" | ");
		  }
		  if(i==2||i==5||i==8) {
			  System.out.println();
		  }
		  System.out.println();
	  }
}
}