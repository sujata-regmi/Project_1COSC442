package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Defines the GUI interactions required by the Monopoly game engine.
 * Implementations update the visible board state and collect user input.
 */
public interface MonopolyGUI {
	/**
	 * Enables the turn-ending action for the specified player.
	 *
	 * @param playerIndex the player index to update
	 */
	public void enableEndTurnBtn(int playerIndex);

	/**
	 * Enables the dice roll control for the specified player.
	 *
	 * @param playerIndex the player index to update
	 */
	public void enablePlayerTurn(int playerIndex);

	/**
	 * Enables the purchase button for the specified player.
	 *
	 * @param playerIndex the player index to update
	 */
	public void enablePurchaseBtn(int playerIndex);

	/**
	 * Requests a dice roll value from the user interface.
	 *
	 * @return the dice values rolled
	 */
	public int[] getDiceRoll();

    /**
     * Checks whether the draw card button is enabled.
     *
     * @return true if the draw card action is enabled
     */
    public boolean isDrawCardButtonEnabled();

    /**
     * Checks whether the end turn button is enabled.
     *
     * @return true if the end turn action is enabled
     */
    public boolean isEndTurnButtonEnabled();

	/**
	 * Checks whether the get out of jail action is enabled.
	 *
	 * @return true if the action is enabled
	 */
	public boolean isGetOutOfJailButtonEnabled();

    /**
     * Checks whether the trade button for a player is enabled.
     *
     * @param i the player index
     * @return true if the trade action is enabled
     */
    public boolean isTradeButtonEnabled(int i);

	/**
	 * Moves a player's token on the visible board.
	 *
	 * @param index the player index
	 * @param from the source cell index
	 * @param to the destination cell index
	 */
	public void movePlayer(int index, int from, int to);

    /**
     * Opens the response dialog for a proposed trade.
     *
     * @param deal the trade proposal to evaluate
     * @return the dialog instance handling the response
     */
    public RespondDialog openRespondDialog(TradeDeal deal);

    /**
     * Opens the trade dialog for the current player.
     *
     * @return the trade dialog instance
     */
    public TradeDialog openTradeDialog();

    /**
     * Sets the buy house button state.
     *
     * @param b true to enable the button
     */
    public void setBuyHouseEnabled(boolean b);

    /**
     * Sets the draw card button state.
     *
     * @param b true to enable the button
     */
    public void setDrawCardEnabled(boolean b);

    /**
     * Sets the end turn button state.
     *
     * @param enabled true to enable the button
     */
    public void setEndTurnEnabled(boolean enabled);

    /**
     * Sets the get out of jail button state.
     *
     * @param b true to enable the button
     */
    public void setGetOutOfJailEnabled(boolean b);

    /**
     * Sets the purchase property button state.
     *
     * @param enabled true to enable the button
     */
    public void setPurchasePropertyEnabled(boolean enabled);

    /**
     * Sets the roll dice button state.
     *
     * @param b true to enable the button
     */
    public void setRollDiceEnabled(boolean b);

    /**
     * Sets the trade button state for a specific player.
     *
     * @param index the player index
     * @param b true to enable the trade button
     */
    public void setTradeEnabled(int index, boolean b);

    /**
     * Displays the buy house dialog for the given player.
     *
     * @param currentPlayer the player purchasing houses
     */
    public void showBuyHouseDialog(Player currentPlayer);

    /**
     * Displays informational text to the player.
     *
     * @param string the message to display
     */
    public void showMessage(String string);

	/**
	 * Requests the utility dice roll value from the user interface.
	 *
	 * @return the utility dice roll value
	 */
	public int showUtilDiceRoll();

	/**
	 * Starts a new game instance.
	 */
	public void startGame();

	/**
	 * Refreshes the interface to reflect the latest game state.
	 */
	public void update();
}
