
public class Bird extends Mammal implements Winged{

	private static final BirthType DEFAULT_BIRD_BIRTHTYPE = BirthType.LAYS_EGGS;
	
	public Bird(int id, String name) {
		super(id, name, DEFAULT_BIRD_BIRTHTYPE);
		
	}

	@Override
	public boolean isWarmBlooded() {
		return true;
	}

	@Override
	public String getDescription() {
		String s = "Bird (has wings)\t";
		return s; 
	}

	@Override
	public boolean canFly() {
		return true;
	}

	
	
}
