package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Encapsulates a trade offer between players.
 * A trade deal specifies the property being exchanged and the payment amount.
 */
public class TradeDeal {
    private int amount;
    private int playerIndex;
    private String propertyName;

    /**
     * Returns the amount of money being exchanged in the trade.
     *
     * @return the trade amount
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * Returns the index of the player involved in the trade.
     *
     * @return the seller index
     */
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    /**
     * Returns the property name in the trade.
     *
     * @return the property name
     */
    public String getPropertyName() {
        return propertyName;
    }
    
    /**
     * Builds a user-facing message describing the proposed trade.
     *
     * @return a readable trade description
     */
    public String makeMessage() {
        String message = GameMaster.instance().getCurrentPlayer() + 
        	" wishes to purchase " +
        	propertyName + " from " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	" for " + amount + ".  " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	", do you wish to trade your property?";
        return message;
    }
    
    /**
     * Sets the monetary amount for the trade.
     *
     * @param amount the amount to pay or receive
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * Sets the name of the property involved in the trade.
     *
     * @param propertyName the property name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    /**
     * Sets the seller index for the trade.
     *
     * @param playerIndex the player index of the seller
     */
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
}
