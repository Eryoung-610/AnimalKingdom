
public class Goldfish extends Fish{

	public Goldfish(int id, String name, BirthType birthType) {
		super(id, name,birthType);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Goldfish";
		return s; 
	}



}
