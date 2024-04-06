import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> deckList;

	// default constructor
	public Deck() {
		this.deckList = new ArrayList<>();
	}

	/**
	 * Use this method to build the deck
	 * 
	 * @param Card
	 */
	public void add(Card card) {
		deckList.add(card);
	}

	/**
	 * randomizes the positions of all the cards in the deck
	 */
	public void shuffle() {
		Collections.shuffle(deckList);
	}

	/**
	 * Removes a card object from the decklist. The calling function gets a copy of
	 * the card removed.
	 * 
	 * @return Card
	 * @throws IndexOutOfBoundsException
	 */
	public Card drawCard() throws IndexOutOfBoundsException {
		if (deckList.isEmpty()) {
			throw new IndexOutOfBoundsException("Cannot Draw.  Deck is empty.");
		}
		return deckList.remove(0);
	}

	/**
	 * draws X number of cards, by calling drawCard() X number of times
	 * 
	 * @param number
	 * @return ArrayList<Card>
	 */
	public ArrayList<Card> drawCards(int number) {
		ArrayList<Card> drawnCards = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			drawnCards.add(drawCard());
		}
		return drawnCards;
	}

}
