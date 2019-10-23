
public class CaliforniaCondor extends Bird implements Endangered{

	public CaliforniaCondor(int id, String name) {
		super(id, name);
	}

	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " California Condor (flies, endangered)";
		return s;
	}

	public boolean canFly() {
		return true;
	}

	@Override
	public void printConservationInformation() {
		System.out.println(this.getName() + " says : " + "Help save the breathtaking California Condor!");
	}
}
