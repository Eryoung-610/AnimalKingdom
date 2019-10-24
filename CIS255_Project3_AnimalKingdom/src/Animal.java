/* ADD EQUALS AND IMPLEMENT COMPARABLE */
/* MAKE NO OTHER CHANGES TO THIS FILE */

public abstract class Animal implements Comparable<Animal>{

	private int id;
	private String name;
	private BirthType birthType;

	public static final String ANIMAL_DESCRIPTION = "Animal";

	public Animal(int id, String name, BirthType birthType) {
		this.id = id;
		this.name = name;
		this.birthType = birthType;
	}
	
	
	// information about birth type
	public final boolean laysEggs() {
		return birthType==BirthType.LAYS_EGGS;
	}
	public final boolean hasLiveBirth() {
		return birthType==BirthType.LIVE_BIRTH;
	}
	public final BirthType getBirthType() {
		return birthType;
	}

	// getters (no setters provided)
	public final int getId() {
		return id;
	}

	public final String getName() {
		return name;
	}

	// toString method will create text with name, id, birth type, warm/cold blodded, and the description
	@Override
	public final String toString() {
		return name + " (id=" + id + "):\t" + birthType.toString() + "\t" +
				(isWarmBlooded() ? "Warm Blooded" : "Cold Blooded") + "\t" +
				getDescription();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal other = (Animal) obj;
			if(this.name.equalsIgnoreCase(other.name) && (this.id == other.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Animal newAnimal) {
		int compareInt = this.name.compareToIgnoreCase(newAnimal.name);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		return 0;
		}
		

	// abstract methods to implement in child classes
	public abstract boolean isWarmBlooded();
	public abstract String getDescription();
	
}
