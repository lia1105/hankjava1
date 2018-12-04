package com.tom;

import java.util.Random;

public class Poker {
	
//	int[] cards = new int [52];
	
	Card[] cards =new Card[52];
	
	public Poker() {
		for (int i=0; i<52; i++) {
//			cards [i] = i ;
			cards[i] = new Card(i);
		}
	}	
	public void shuffle() {
		for (int i=0; i<52; i++){
		int r = new Random().nextInt(52);
		// a = cards[i]
		// b = cards[r]
		Card tmp = cards[i];
		cards[i] = cards[r];
		cards[r] = tmp;
		}
	}
	
	public void print() {
		for (int i=0; i<52; i++) {
			/*int flower = cards[i]/13;
			char[] flowers = {0x2660, 0x2665, 0x2666, 0x2663};
			char c = 0x2660;
			switch (flower) {
			case 0:
				c=0x2663;
				break;
			case 1:
				c=0x2666;
				break;
			case 2:
				c= 0x2665;
				break;
			case 3:
				c=0x2660;
				break;
			}*/
			System.out.print(cards[i].get() + " ");
			
			if (i%13 == 12)
				System.out.println();
			
			
		}
	}
}
