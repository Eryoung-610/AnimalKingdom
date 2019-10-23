
public abstract class Mammal extends Animal{

	
	public Mammal(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}

	@Override
	public boolean isWarmBlooded() {
		return true;
	}

	@Override
	public String getDescription() {
		String s = "Mammal";
		return s; 
	}

}
