
public class Parakeet extends Bird{

	public Parakeet(int id, String name) {
		super(id, name);
	
	}


	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Parakeet (flies)";
		return s;
	}

	
	public boolean canFly() {
		return true;
	}
	
}
