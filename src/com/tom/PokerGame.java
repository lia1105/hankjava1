package com.tom;

import java.util.Random;


public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] flowers = {0x2660, 0x2665, 0x2666, 0x2663};
		int[] nums = new int[5];
		nums[0] =77;
		nums[4] =98;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		char f = 0x2665;
		System.out.println(f);
		
		
		
		
		Random random = new Random();
		int pokerNumber = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(pokerNumber);
		char c =0;
		switch (flower) {
		case 0:
			c='C';
			break;
		case 1:
			c='D';
			break;
		case 2:
			c='H';
			break;
		case 3:
			c='S';
			break;
		
		}
		
		System.out.println(c);
	}

}
