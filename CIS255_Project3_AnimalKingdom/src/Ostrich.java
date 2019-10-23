
public class Ostrich extends Bird{

	public Ostrich(int id, String name) {
		super(id, name);
		
	}

	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Ostrich (does not fly)";
		return s;
	}
	
	public boolean canFly() {
		return false;
	}
	
}
