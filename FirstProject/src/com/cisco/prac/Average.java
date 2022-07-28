package com.cisco.prac;

public class Average {

	public static void main(String[] args) {
		
		int i ,sum=0,avg=0;
		
		int arrNum[] = {2,2,2,2,2,2};
		
//		int arrNum[] = new int[5];
		arrNum[0] = 1;
		
		arrNum[0] = 2;
		arrNum[1] = 3;
		arrNum[2] = 4;
		arrNum[3] = 5;
		arrNum[4] = 6;
//		arrDec[5] = 7;
		
		int cnt;
		System.out.println(arrNum.length);
		for (cnt = 0; cnt < arrNum.length; cnt++) {
			sum = sum + arrNum[cnt];
		}
		System.out.println(sum);
		avg=sum/arrNum.length;
		System.out.println(avg);
		
		
	}

}
