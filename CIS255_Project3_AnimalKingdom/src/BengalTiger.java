public class BengalTiger extends Mammal implements Endangered {

	public BengalTiger(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}

	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Bengal Tiger (endangered)";
		return s;
	}

	@Override
	public void printConservationInformation() {
		System.out.println(this.getName() + " says : " + "Bengal Tigers need your help, there's only 2500 left");
	}
}