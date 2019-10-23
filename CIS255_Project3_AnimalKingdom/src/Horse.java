
public class Horse extends Mammal{

	public Horse(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}


	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += "\t Horse";
		return s;
	}

}
