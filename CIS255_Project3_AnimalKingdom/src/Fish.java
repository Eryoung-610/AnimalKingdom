
public abstract class Fish extends Animal implements WaterDweller{

	public Fish(int id, String name, BirthType birthType) {
		super(id, name, birthType);

	}

	@Override
	public boolean isWarmBlooded() {
		return false;
	}

	@Override
	public String getDescription() {
		String s = "Fish (lives in water, does not breathe air)\t";
		return s; 
	}

	@Override
	public boolean breathesAir() {
		return false;
	}

}
