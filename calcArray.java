package calc;

import java.util.Scanner;

public class calcArray {
	public static void main (String[]args){
		
	
	Scanner scan=new Scanner (System.in);
	int[]numbers={12,2,32,45,11};
	
	
	int sum=0;
	for(int i=0;i<numbers.length;i++)
		sum= sum+ numbers[i];
	double avarage= sum/ numbers.length;
			System.out.println("avarage value of array is "+ avarage);
}
}