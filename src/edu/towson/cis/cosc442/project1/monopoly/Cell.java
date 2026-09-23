package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/**
	 * Returns the name of the cell.
	 * @return the name of the cell
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the player who owns this cell.
	 * @return the owner of the cell
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Returns the purchase price of the cell, defaulting to 0 if not overridden.
	 * @return the price of the cell
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Indicates whether the cell is currently available.
	 * @return true if the cell is available, false otherwise
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * Executes the action associated with landing on this cell.
	 */
	public abstract void playAction();

	/**
	 * Sets the availability status of the cell.
	 * @param available the new availability status to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Assigns a name to the cell.
	 * @param name the name to assign to this cell
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the player who owns this cell.
	 * @param owner the player to set as owner
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /**
     * Returns the string representation of the cell.
     * @return the cell's name as a string
     */
    public String toString() {
        return name;
    }
}
