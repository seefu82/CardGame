
public class CardGame {

	private static Player user;
	private static Player ai;

	// to keep track of resources ?
	private int turnCount;

	public static void initialize() {
		user = new Player(30);
		ai = new Player(30);

	}

	/**
	 * Method checks to see if a player is still alive
	 * 
	 * @param player
	 * @return boolean
	 */
	public boolean checkHealth(Player player) {
		int playerHP = player.getLifePoints();
		if (playerHP > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * THis method name can change. It's just a placeholder.
	 */
	public void battleLogic() {

		//
		// players select cards and fight
		//
		//
	}

	public static void main(String[] args) {
		initialize();

	}

}
