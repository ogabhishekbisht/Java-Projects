import java.lang.*;
import java.util.*;
class Queen {
	
	public static void setQueen(int[][] a, int i) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the x,y value for Queen in the grid = ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	if(a[x-1][y-1] != -1){
		System.out.print("\n Wrong Entry.. Game over!!");
		System.exit(0);
	}
	else {
		a[x-1][y-1] = 100;
		//for left and right
		for(int gridx = 0; gridx < 4; gridx++)	{
		a[gridx][y-1] = i+1;
			
}// end of for
		// for up and down
for(int gridy = 0; gridy < 4; gridy++)	{
		a[x-1][gridy] = i+1;
			
}// end of for
		// for diagonals 
for(int gridx = x-1, gridy = y-1; gridx < 4 && gridy < 4; gridx++, gridy++)
{
		a[gridx][gridy] = i+1;
} // end of for

for(int gridx = x-1, gridy = y-1; gridx >= 0 && gridy >= 0; gridx--, gridy--)
{
		a[gridx][gridy] = i+1;
} // end of for
for(int gridx = x-1, gridy = y-1; gridx < 4 && gridy >= 0; gridx++, gridy--)
{
		a[gridx][gridy] = i+1;
} // end of for
for(int gridx = x-1, gridy = y-1; gridx >= 0 && gridy <  4; gridx--, gridy++)
{
		a[gridx][gridy] = i+1;
} // end of for
		a[x-1][y-1] = 100;
	}


}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[][] a = new int[4][4];
	for(int x = 0; x < 4; x++){
	for(int y = 0; y < 4; y++){
		a[x][y] = -1;

}
		System.out.println();
	}
	int[] Q = new int[4];
	for(int i = 0; i < 4; i++){
	Q[i] = i+1;
	} // end of for
	for(int i = 0; i < 4;  i++){
	setQueen(a, i);
	System.out.print("\n\n Board Right now = \n");
	for(int x = 0; x < 4; x++){
	for(int y = 0; y < 4; y++){
		System.out.print("\t" + a[x][y]);

}
		System.out.println();
	}
}
	System.out.print("\n\n Congrats you did it!!!");
	System.out.print("\n Final Result \n");
	for(int x = 0; x < 4; x++){
	for(int y = 0; y < 4; y++){
		System.out.print("\t" + a[x][y]);

}
		System.out.println();
	}
	
} // end of main
} // end of class
