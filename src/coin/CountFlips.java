package coin;

import java.util.ArrayList;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	// Output:
	// The number flips: 1000
	// The number of heads: 493
	// The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin c = new Coin();
		int numOfFlips = 1000;
		int heads = 0;
		int tails = 0;
		for (int i = 1; i <= numOfFlips; i++) {
			if (c.isHeads()) {
				heads++;
			}
			else {
				tails++;
			}
			c.flip();
		}
		System.out.println("Number of Flips: " + numOfFlips);
		System.out.println("Number of Heads: " + heads);
		System.out.println("Number of Tails: " + tails);
	}
}
