
public class GreatWhiteShark extends Fish implements Endangered{

	public GreatWhiteShark(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}

	public String getDescription() {
		String s = super.getDescription();
		s += " Great White Shark (endangered)";
		return s; 
	}

	
	public void printConservationInformation() {
		System.out.println(this.getName() + " says : " + "Help save the great white shark!");
	}

}
