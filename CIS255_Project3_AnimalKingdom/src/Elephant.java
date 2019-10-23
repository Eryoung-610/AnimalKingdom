
public class Elephant extends Mammal implements Endangered{

	public Elephant(int id, String name, BirthType birthType) {
		super(id, name, birthType);
	}

	
	@Override
	public String getDescription() {
		String s = super.getDescription();
		s += " Elephant (endangered)";
		return s;
	}


	@Override
	public void printConservationInformation() {
		System.out.println(this.getName() + " says : " + "Help save the beautiful elephants!");
	}







}
