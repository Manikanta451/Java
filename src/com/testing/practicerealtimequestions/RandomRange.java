package com.testing.practicerealtimequestions;

import java.util.Random;


public final class RandomRange {
	
	
	public static void main (String[] args) throws Exception {
		Random rand = new Random();
		int num = rand.nextInt(3000000) + 3000000;
		System.out.println(num);

		}
	
}
