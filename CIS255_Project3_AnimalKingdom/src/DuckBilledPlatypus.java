
public class DuckBilledPlatypus extends Mammal{

	public DuckBilledPlatypus(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}


	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Duck Billed Platypus";
		return s;
	}

}
