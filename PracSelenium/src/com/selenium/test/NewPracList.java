package com.selenium.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewPracList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		
		int[] arr = new int[list.size()];
		for (int i = 0; i<list.size();i++) {
			arr[i] = list.get(i);
		}
		

	}

}
