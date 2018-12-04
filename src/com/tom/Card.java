package com.tom;

public class Card {
	
	int value;
	int suit;
	int symbol;
	char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
	
	public Card (int value) {
		this.value = value;
	}
	
	public String get(){
		String s = value%13+1 + ""+ suits[value/13];
		return s;
	}
}
