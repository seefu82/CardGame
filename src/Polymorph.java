
public class Polymorph extends SpellCard implements TargetsUnit {

	@Override
	public void targetUnit(UnitCard unit) {
		unit.setName("Sheep");
		unit.setAtk(1);
		unit.setHp(1);
		unit.setMaxHp(1);
	}

}
