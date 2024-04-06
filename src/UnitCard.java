/**
 * Unit cards, are a special type of card. The come into play, and fight until
 * they die.
 */
public class UnitCard extends Card {

	private int atk;
	private int hp;
	private int maxHp;

	public UnitCard() {
		super();
	}

	public UnitCard(String name, int cost, int atk, int hp) {
		super(name, cost);
		this.atk = atk;
		this.hp = hp;
	}

	// Setters
	protected void setName(String name) {
		this.name = name;
	}

	protected void setAtk(int atk) {
		this.atk = atk;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	protected void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	// Getters
	protected String getName() {
		return name;
	}

	protected int getAtk() {
		return atk;
	}

	protected int getHp() {
		return hp;
	}

	protected int getMaxHp() {
		return maxHp;
	}

	// methods
	public void takeDamage(int damage) {
		this.hp -= damage;
	}

	public void attackUnit(UnitCard unit) {
		unit.takeDamage(atk);
	}

	public void attackPlayer(Player player) {
		player.playerTakeDamage(atk);
	}

	// to create example
	// UnitCard goblin = new UnitCard("goblin", 2, "a weak creature", 1, 1);

}
