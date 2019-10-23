
public class BlueWhale extends Whale implements Endangered {

	public BlueWhale(int id, String name, BirthType birthtype) {
		super(id, name, birthtype);
	}

	public String getDescription() {
		String s = super.getDescription();
		s += "\t Blue Whale (endangered) ";
		return s;
	}

	public void printConservationInformation() {
		System.out.println(this.getName() + " says : " + "Help save the mighty blue whale!");
	}

}
