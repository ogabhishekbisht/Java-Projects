import java.lang.*;
import java.util.*;
class Grid {
	public static boolean checkifcomplete(int[] arr){
		for(int i = 0; i < 8; i++){
			if(arr[i] != i+1)
			return false;
		}
		return true;
	}
	public static boolean checkifexists (int[] arr, int num) {
	//	int flag = 0;
		for(int i = 0; i <= 8; i++) {
			if(arr[i] == num){
				return true;
			}
		}
			return false;
		
	}
	public static void main(String arys[]) {
		Random rand = new Random();
		int i = 0;
		int[] arr = new int[9];
		for(i = 0; i < 8; i++){
			arr[i] = -1;
		}
		arr[i] = -1414;
		int tmp = 8;
		
		int temp;
		for(i = 0; i <= 8; i++){
		//	System.out.print("\n" + arr[i]);
		}
		i = 0;
		System.out.println();
		while(tmp > 0) {
			temp = rand.nextInt(9);
			if(temp == 0)
			continue;
		//	System.out.println(temp);
			if(!checkifexists(arr,temp)){
		//	System.out.println("\n Diddly do!!");
				arr[i] = temp;
				tmp--;
				i++;
			}
			else
			continue;
			
		} 
	/*	arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = -1414;
		arr[8] = 8; */
		for(i = 0; i <= 8; i++){
	//		System.out.print("\n" + arr[i]);
		}
		int k;
		int[][] grid = new int[3][3];
		for(i = 0, k = 0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				grid[i][j] = arr[k];
			}
		}
		System.out.println("\n");
		for(i = 0, k=0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				if(grid[i][j] != -1414)
				System.out.print("\t" + grid[i][j]);
				else
				System.out.print("\t_");
			}
			System.out.println();
		}
		int currentpos = 8;
		Scanner sc = new Scanner(System.in);
		while(!checkifcomplete(arr)){
		System.out.print("\nMenu\n1.Move Up\n2.Move Down\n3.Move Left\n4.Move Right");
		int choi = sc.nextInt();
		switch(choi){
			case 1 : if(currentpos-3 < 0){
			System.out.print("\nInvalid Move!!!!");
			break;
			}
			else{
				temp = arr[currentpos];
				arr[currentpos] = arr[currentpos-3];
				arr[currentpos-3] = temp;
				currentpos -= 3;
			}
			System.out.println();
			for(i = 0, k = 0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				grid[i][j] = arr[k];
			}
		}
		System.out.println("\n");
		for(i = 0, k=0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				if(grid[i][j] != -1414)
				System.out.print("\t" + grid[i][j]);
				else
				System.out.print("\t_");
			}
			System.out.println();
		}
			break;
			
			case 2: if(currentpos+3 > 8){
				System.out.print("\nInvalid Move!!!");
				break;
			}
			else{
				temp = arr[currentpos];
				arr[currentpos] = arr[currentpos+3];
				arr[currentpos+3] = temp;
				currentpos += 3;
			}
			System.out.println();
			for(i = 0, k = 0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				grid[i][j] = arr[k];
			}
		}
		System.out.println("\n");
		for(i = 0, k=0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				if(grid[i][j] != -1414)
				System.out.print("\t" + grid[i][j]);
				else
				System.out.print("\t_");
			}
			System.out.println();
		}
			break;
			case 3: if(currentpos == 0 || currentpos == 3 || currentpos == 6){
				System.out.print("\nInvalid Move!!");
			}
			else {
				temp = arr[currentpos];
				arr[currentpos] = arr[currentpos-1];
				arr[currentpos-1] = temp;
				currentpos -= 1;
			}
			System.out.println();
			for(i = 0, k = 0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				grid[i][j] = arr[k];
			}
		}
		System.out.println("\n");
		for(i = 0, k=0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				if(grid[i][j] != -1414)
				System.out.print("\t" + grid[i][j]);
				else
				System.out.print("\t_");
			}
			System.out.println();
		}
			break;
			case 4: 
			if(currentpos == 2 || currentpos == 5 || currentpos == 8){
				System.out.print("\nInvalid Move!!!");
			}
			else {
				temp = arr[currentpos];
				arr[currentpos] = arr[currentpos+1];
				arr[currentpos+1] = temp;
				currentpos += 1;
			}
			System.out.println();
			for(i = 0, k = 0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				grid[i][j] = arr[k];
			}
		}
		System.out.println("\n");
		for(i = 0, k=0; i < 3; i++){
			for(int j=0; j < 3; j++, k++){
				if(grid[i][j] != -1414)
				System.out.print("\t" + grid[i][j]);
				else
				System.out.print("\t_");
			}
			System.out.println();
		}
			break;
			default : 
			System.out.print("\nINVALID CHOICE!!!!");
			break;
				
			
				
			
				
			
		}
		
		
		}
		System.out.print("\nCongratulations and Celebrations");
	}
}