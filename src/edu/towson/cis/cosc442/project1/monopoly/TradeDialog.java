package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents a dialog that collects a trade offer from the player.
 */
public interface TradeDialog {
    /**
     * Retrieves the trade deal created by the dialog.
     *
     * @return the selected trade deal or null if canceled
     */
    TradeDeal getTradeDeal();
}
