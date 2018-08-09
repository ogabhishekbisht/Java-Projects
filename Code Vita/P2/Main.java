import java.lang.*;
import java.util.*;
class Main{
	public static void main(String args[]){
		int i,j,k,sqrt,flag;
		long sizeoffactor;
		long sizeofsquare;
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int[] factors = new int[100];
		int[] squares = new int[100];
		for(i = 2, j = 0; i <= n; i++ ){
			if(n % i == 0){
				factors[j] = i;
				j++;
			}
			
		}
		sizeoffactor = j;
		
		for( i = 0, k = 0; i < sizeoffactor; i++ ){
		//	System.out.print("\n  " + factors[i]);
			sqrt = (int)Math.sqrt(factors[i]);
			if(sqrt * sqrt == factors[i]) {
				squares[k] = factors[i];
				k++;
			}
		}
		sizeofsquare = k;
		//System.out.print("\n\n Squares in them\n\n");
		for( i = 0; i < sizeofsquare; i++ ){
		//	System.out.print("\n  " + squares[i]);
		}
		long count = 0;
		
		for( i = 0; i < sizeoffactor; i++ ){
			flag = 0;
			for( j = 0; j < sizeofsquare; j++ ) {
				if(factors[i] % squares[j] == 0){
					flag = 1;
				}
			}
			if(flag == 0){
				count++;
			}
		}
		System.out.print(count);
		
			
		
	}	
	
}