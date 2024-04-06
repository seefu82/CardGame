import java.util.ArrayList;

public class Player {
	// instance variables
	private int lifePoints; // player's life points
	private Deck deck; // an array list to store player's cards
	private ArrayList<Card> hand;

	// default constructor
	public Player() {
		this.lifePoints = 20;
		this.deck = new Deck();
	}

	// constructor with only the life points as an argument. This is the one we use.
	public Player(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	// overloaded constructor
	public Player(int lifePoints, Deck deck) {
		this.lifePoints = lifePoints;
		this.deck = new Deck();
	}

	// setter
	private void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	// getters
	public int getLifePoints() {
		return lifePoints;
	}

	public Deck getDeck() {
		return deck;
	}

	public void playerTakeDamage(int damage) {
		this.lifePoints -= damage;
	}

	public void playerGainLife(int lifeGain) {
		this.lifePoints += lifeGain;
	}

	// Just a start, a few creatures
	// The values on the generic unit cards, can be changed to load from a csv file
	// (comma separated values file)
	public void createUnitCards() {
		// This player's deck calls the add method, to add new objects.
		// In the parentheses (" Name " , Cost , Attack Power, Health points )
		deck.add(new UnitCard("RiverCroc", 2, 2, 3));
		deck.add(new UnitCard("RiverCroc", 2, 2, 3));
		deck.add(new UnitCard("RiverCroc", 2, 2, 3));

		deck.add(new UnitCard("Boulderfist Ogre", 6, 6, 7));
		deck.add(new UnitCard("Boulderfist Ogre", 6, 6, 7));
		deck.add(new UnitCard("Boulderfist Ogre", 6, 6, 7));

		deck.add(new UnitCard("Chillwind Yeti", 4, 4, 5));
		deck.add(new UnitCard("Chillwind Yeti", 4, 4, 5));
		deck.add(new UnitCard("Chillwind Yeti", 4, 4, 5));

	}

	// Build the spell card objects.
	public void createSpellCards() {
		// just straight up creates the specific spell
		deck.add(new FireBall());
		deck.add(new FireBall());
		deck.add(new FireBall());

		deck.add(new Polymorph());
		deck.add(new Polymorph());
		deck.add(new Polymorph());
	}

	// This is more to make the code look clean. Separate the unit card creation,
	// and the spell creation.
	public void loadDeck() {
		createUnitCards();
		createSpellCards();
	}

}
