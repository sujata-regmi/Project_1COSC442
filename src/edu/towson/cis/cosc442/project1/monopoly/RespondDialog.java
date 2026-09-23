package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents a dialog used to accept or reject a trade proposal.
 */
public interface RespondDialog {
    /**
     * Returns the player's response to the trade request.
     *
     * @return true when the trade is accepted, false otherwise
     */
    boolean getResponse();
}
