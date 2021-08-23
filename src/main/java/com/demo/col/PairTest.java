package com.demo.col;

public class PairTest {

	public static void main(String []args) {
		 Pair<Integer, String> worldCup = new Pair<Integer, String>(2018, "Russia");
		 System.out.println("World cup " + worldCup.getFirst() +
		 " in " + worldCup.getSecond());
		 }
}
