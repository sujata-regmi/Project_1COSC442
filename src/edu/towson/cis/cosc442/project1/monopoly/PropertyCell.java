package edu.towson.cis.cosc442.project1.monopoly;

public class PropertyCell extends Cell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;

	/**
	 * Returns the color group to which this property belongs.
	 * @return The color group of the property.
	 */
	public String getColorGroup() {
		return colorGroup;
	}

	/**
	 * Returns the price for buying a house on this property.
	 * @return The cost to purchase a house for this property.
	 */
	public int getHousePrice() {
		return housePrice;
	}

	/**
	 * Returns the number of houses currently built on this property.
	 * @return The count of houses on this property.
	 */
	public int getNumHouses() {
		return numHouses;
	}
    
    /**
     * Returns the selling price of this property.
     * @return The price at which this property can be sold.
     */
    public int getPrice() {
		return sellPrice;
	}

	/**
	 * Calculates and returns the current rent owed based on ownership and number of houses.
	 * @return The rent amount due for landing on this property.
	 */
    public int getRent() {
        int rentToCharge = rent;
        String [] monopolies = theOwner.getMonopolies();
        rentToCharge = calculateMonopoliesRent(rentToCharge, monopolies);
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	/**
	 * Calculates the rent with monopoly consideration based on the color group ownership.
	 * @param rentToCharge Initial rent amount to be potentially adjusted.
	 * @param monopolies Array of color groups where the owner has monopolies.
	 * @return The calculated rent adjusted for monopoly ownership.
	 */
	private int calculateMonopoliesRent(int rentToCharge, String[] monopolies) {
		for(int i = 0; i < monopolies.length; i++) {
            if(monopolies[i].equals(colorGroup)) {
                rentToCharge = rent * 2;
            }
        }
		return rentToCharge;
	}

	/**
	 * Executes the action that occurs when a player lands on this property.
	 */
	public void playAction() {
		Player currentPlayer;
		fetchPlayer();
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
	}
	/**
	 * Fetches player information associated with this property (method currently empty).
	 */
	private void fetchPlayer() {
		
	}


	/**
	 * Retrieves the current player (method currently empty).
	 */
	public void getCurrentPlayer() {
		
	}

	/**
	 * Assigns the color group to this property.
	 * @param colorGroup The color group to set for the property.
	 */
	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	/**
	 * Sets the cost to purchase a house on this property.
	 * @param housePrice The house price to assign.
	 */
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * Sets the number of houses currently on this property.
	 * @param numHouses The number of houses to assign.
	 */
	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	/**
	 * Sets the selling price of this property.
	 * @param sellPrice The selling price to assign.
	 */
	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Sets the base rent amount for this property.
	 * @param rent The rent value to assign.
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}
}
