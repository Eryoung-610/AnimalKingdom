
public abstract class Whale extends Mammal implements WaterDweller{


	public Whale(int id, String name, BirthType birthtype) {
		super(id, name, birthtype);
	}

	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Whale (lives in water,breathes air)";
		return s;
	}

	@Override
	public boolean breathesAir() {
		return true;
	}
	
}
