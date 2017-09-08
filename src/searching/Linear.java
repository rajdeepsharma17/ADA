package searching;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		
		System.out.println("Enter NO. to search");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c=0;
		
		int Arr[] = {2,6,1,8,9,5};
		for(int i =0;i<6;i++){
			if(Arr[i]==n){
				c++;	
			}
			
		}
		if(c!=0){
			System.out.println("No. present");
		}
		else
			System.out.println("No. absent");
		scn.close();

	}

}
