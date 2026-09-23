package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents a single six-sided die used to determine movement.
 */
public class Die {
	/**
	 * Rolls the die and returns a value between 1 and 6.
	 *
	 * @return a random value from 1 to 6
	 */
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}
