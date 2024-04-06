
public class FireBall extends SpellCard implements TargetsPlayer, TargetsUnit {

	// constructor
	public FireBall() {
		this.name = "Fireball";
		this.cost = 4;
		this.description = "Deal 6 damage to any target.";
	}

	@Override
	public void targetUnit(UnitCard unit) {
		unit.takeDamage(6);
	}

	@Override
	public void targetPlayer(Player player) {
		player.playerTakeDamage(6);
	}

}
