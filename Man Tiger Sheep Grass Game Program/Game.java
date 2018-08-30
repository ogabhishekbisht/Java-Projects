import java.lang.*;
import java.util.*;
class Game {
	public static void checkstatus(char[] A, char[] B){
		if(A[0] != 'M' && A[1] == 'T' && A[2] == 'S' || A[0] != 'M' && A[2] == 'S' && A[3] == 'G' || B[0] != 'M' && B[1] == 'T' && B[2] == 'S' ||  B[0] != 'M' && B[2] == 'S' && B[3] == 'G'){
			System.out.print("\n You lost the game!! Play Again.....");
			System.exit(0);
		}
	}
	public static void main(String args[]) {
	int choi;	
	char[] A ={ 'M', 'T', 'S', 'G' }; 
	char[] B ={ 'N', 'N', 'N', 'N' }; 
	Scanner sc = new Scanner(System.in);
	do {
	System.out.print("\n Current Condition = ");
	System.out.print("\n");
	for(int i = 0; i < 4; i++){
	System.out.print(" " + A[i]);
	}
	System.out.print("\n");
	for(int i = 0; i < 4; i++){
	System.out.print(" " + B[i]);
	}
	System.out.print("\n1. Move the man from A to B");
	System.out.print("\n2. Move the man from B to A");
	System.out.print("\n3. Move the tiger from A to B");
	System.out.print("\n4. Move the tiger from B to A");
	System.out.print("\n5. Move the sheep from A to B");
	System.out.print("\n6. Move the sheep from B to A");
	System.out.print("\n7. Move the grass from A to B");
	System.out.print("\n8. Move the grass from B to A");
	System.out.print("\n Enter your choice = ");
	choi = sc.nextInt();
	switch(choi) {
	case 1: 
		System.out.print("\nInvalid Move!!");
		break;
	case 2:
		if(A[0] == 'N' ) {
			A[0] = 'M';
			B[0] = 'N';
		}
		
		else {
		System.out.print("\nInvalid Move!!");
}	
checkstatus(A,B);
		break;	
	case 3: if( A[0] == 'M') {
		B[0] = 'M';
		A[0] = 'N';
		A[1] = 'N';
		B[1] = 'T';		
}
		
		else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;
	case 4: if( B[0] == 'M'){
		B[1] = 'N';
		B[0] = 'N';
		A[1] = 'T';
		A[0] = 'M';
}
		
		else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;
	case 5: if(A[0] == 'M'){
		B[0] = 'M';
		A[0] = 'N';
		A[2] = 'N';
		B[2] = 'S';
				
}
		
		else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;

	case 6 : if( B[0] == 'M'){
		B[2] = 'N';
		B[0] = 'N';
		A[2] = 'S';
		A[0] = 'M';
}
		
		else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;
	case 7: if(A[0] == 'M')
{
		B[0] = 'M';
		A[0] = 'N';
		A[3] = 'N';
		B[3] = 'G';
				
}
		
	else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;
	case 8: if( B[0] == 'M'){
		B[3] = 'N';
		B[0] = 'N';
		A[3] = 'G';
		A[0] = 'M';
}
		
		else {
		System.out.print("\nInvalid Move!!");
}		
checkstatus(A,B);
		break;
	default :
		System.out.print("\nWrong Choice!!!");
		break;
} // end of switch

}while(A[0] != 'N' || A[1] != 'N' || A[2] != 'N' || A[3] != 'N'); // end of do-while
System.out.print("\n\nCongratulations and Celebrations!!!!");

}
}
