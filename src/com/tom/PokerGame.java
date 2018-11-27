package com.tom;

import java.util.Random;


public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int pokerNumber = random.nextInt(13)+1;
		int poker = random.nextInt(4);
		
		char suit =0;
		switch (poker) {
		case 0:
			suit='C';
			break;
		case 1:
			suit='D';
			break;
		case 2:
			suit='H';
			break;
		case 3:
			suit='S';
			break;
		
		}
		
		System.out.println(pokerNumber+suit);
	}

}
