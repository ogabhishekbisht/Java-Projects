import java.lang.*;
import java.util.*;
class Main {
	public static int findnum(int[] number, int max){
		while(max >= 0){
			for(int i = 0; i < 12; i++){
				if(number[i] == max){
					number[i] = -1;
					return max;
				}
			}
			max--;
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String line;
		line = sc.nextLine();
		String[] inputNumber = line.split(",");
		int[] number = new int[12];
		for(int i = 0; i < 12; i++){
			number[i] = Integer.parseInt(inputNumber[i]);
		//	System.out.print("\n" + number[i] );
		}
		int Mon1;
		int Mon2;
		int D1;
		int D2;
		int H1;
		int H2;
		int Min1;
		int Min2;
		int flag = 0;
		Mon1 = findnum(number,1);
		//System.out.println(Mon1);
		if(Mon1 == 1){
		Mon2 = findnum(number,2);
		}
		
		else{
			Mon2 = findnum(number,9);
		}
		//System.out.println(Mon2);
		D1 = findnum(number,3);
		//System.out.println(D1);
		if(D1 == 3 && Mon1 == 1 && Mon2 == 0 || D1 == 3 && Mon1 == 1 && Mon2 == 2 || D1 == 3 && Mon1 == 0 && Mon2 == 1 || D1 == 3 && Mon1 == 0 && Mon2 == 3 || D1 == 3 && Mon1 == 0 && Mon2 == 5 || D1 == 3 && Mon1 == 0 && Mon2 == 7 || D1 == 3 && Mon1 == 0 && Mon2 == 8){
			
			D2 = findnum(number,1);
		}
		else if (D1 == 2 && Mon1 == 0 && Mon2 == 2){
			D2 = findnum(number,8);
		}
		else if(D1 == 3 && Mon1 == 1 && Mon2 == 1 || D1 == 3 && Mon1 == 0 && Mon2 == 9 || D1 == 3 && Mon1 == 0 && Mon2 == 6 || D1 == 3 && Mon1 == 0 && Mon2 == 4){
		   D2 = findnum(number,0);
		   
	}
		else{
			D2 = findnum(number,9);
		}
		//System.out.println(D2);
		if(D2 == -1){
			D1 = findnum(number,2);
			if (D1 == 2 && Mon1 == 0 && Mon2 == 2){
			D2 = findnum(number,8);
		}
		else if(D1 == 3 && Mon1 == 1 && Mon2 == 1 || D1 == 3 && Mon1 == 0 && Mon2 == 9 || D1 == 3 && Mon1 == 0 && Mon2 == 6 || D1 == 3 && Mon1 == 0 && Mon2 == 4){
		   D2 = findnum(number,0);
		   
	}
		else{
			D2 = findnum(number,9);
		}
		}
		//System.out.println(D1);
		//System.out.println(D2);
		H1 = findnum(number,2);
		//System.out.println(H1);
		if(H1 == 2){
			H2 = findnum(number,3);
		}
		else {
		H2 = findnum(number,9);
		}
		//System.out.println(H1);
		Min1 = findnum(number,5);
		//System.out.println(Min1);
		Min2 = findnum(number,9);
		//System.out.println(Min2);
		if(Mon1 == -1 || Mon2 == -1 || D1 == -1 || D2 == -1 || H1 == -1 || H2 == -1 || Min1 == -1 || Min2 == -1 ){
			System.out.print("0");
		}
		else{
			System.out.print(Mon1 + "" + Mon2 + "/" + D1 + "" + D2 + " " + H1 + "" + H2 +":"+ Min1 + "" +Min2);
		}
		
	}
}