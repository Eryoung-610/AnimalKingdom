import java.util.*;

public class AnimalKingdomDriver {

	public static void main(String[] args) {

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Goldfish(1, "Goldie Goldfishy", BirthType.LAYS_EGGS));
		animalList.add(new Goldfish(2, "Blingy Gold Gold", BirthType.LAYS_EGGS));
		animalList.add(new GreatWhiteShark(3, "Toothy the Shark", BirthType.LIVE_BIRTH));
		animalList.add(new Parakeet(4, "Tweety Parakeety"));
		animalList.add(new Parakeet(5, "Pretty Bird Pretty"));
		animalList.add(new CaliforniaCondor(6, "Cali Condor the Great"));
		animalList.add(new Ostrich(7, "Head in the Sand Hallie"));
		animalList.add(new BelugaWhale(8, "BabyBeluga O'BabyBeluga",BirthType.LIVE_BIRTH));
		animalList.add(new BlueWhale(9, "Spouty the Blue Whale",BirthType.LIVE_BIRTH));
		animalList.add(new Elephant(10, "Never Irrelephant", BirthType.LIVE_BIRTH));
		animalList.add(new DuckBilledPlatypus(11, "Donald Duck E. Platt", BirthType.LAYS_EGGS));
		animalList.add(new Horse(12, "Horsey McHorseface", BirthType.LIVE_BIRTH));
		animalList.add(new Horse(13, "Mr. Ed the Fourth", BirthType.LIVE_BIRTH));
		animalList.add(new BengalTiger(14, "Tony the Tiger", BirthType.LIVE_BIRTH));

		Collections.sort(animalList);

		System.out.println("***TEST ALL ANIMALS AND COMPARABLE IMPLEMENTATION");
		System.out.println("Should print 13 animals, ordered in alphabetic order by name:\n");
		for (Animal animal : animalList) {
			System.out.println(animal);
		}

		System.out.println("\n\n******TEST WARM/COLD BLOODED");
		System.out.println("All warm blooded animals. Should print: ");
		System.out.println(
				"BabyBeluga O\'BabyBeluga   Cali Condor the Great   Donald Duck E. Platt   Head in the Sand Hallie   Horsey McHorseface   Mr. Ed the Fourth   Never Irrelephant   Pretty Bird Pretty   Spouty the Blue Whale   Tony the Tiger  Tweety Parakeety");
		for (Animal animal : animalList) {
			if (animal.isWarmBlooded()) {
				System.out.print(animal.getName() + "   ");
			}
		}
		System.out.println();

		System.out.println("\nAll cold blooded animals. Should print: ");
		System.out.println("Blingy Gold Gold   Goldie Goldfishy   Toothy the Shark   ");
		for (Animal animal : animalList) {
			if (!animal.isWarmBlooded()) {
				System.out.print(animal.getName() + "   ");
			}
		}
		System.out.println();

		System.out.println("\n\n******TEST BIRTH TYPE");
		System.out.println("All live birth animals. Should print: ");
		System.out.println(
				"BabyBeluga O\'BabyBeluga   Horsey McHorseface   Mr. Ed the Fourth   Never Irrelephant   Spouty the Blue Whale  Tony the Tiger   Toothy the Shark");
		for (Animal animal : animalList) {
			if (animal.hasLiveBirth()) {
				System.out.print(animal.getName() + "   ");
			}
		}
		System.out.println();

		System.out.println("\nAll egg laying animals. Should print: ");
		System.out.println(
				"Blingy Gold Gold   Cali Condor the Great   Donald Duck E. Platt   Goldie Goldfishy   Head in the Sand Hallie   Pretty Bird Pretty   Tweety Parakeety   ");
		for (Animal animal : animalList) {
			if (animal.laysEggs()) {
				System.out.print(animal.getName() + "   ");
			}
		}
		System.out.println();

		System.out.println("\n\n******TEST EQUALS METHOD");
		Animal testAnimal = new BlueWhale(9, "Spouty the Blue Whale", BirthType.LIVE_BIRTH);
		System.out.println("Contains spouty (id 9)  is true:  " + animalList.contains(testAnimal));
		testAnimal = new BlueWhale(9, "SPOUTY THE BLUE WHALE",BirthType.LIVE_BIRTH);
		System.out.println("Contains spouty (id 9)  is true:  " + animalList.contains(testAnimal));
		testAnimal = new BlueWhale(9, "Spouty the Blue Whale", BirthType.LIVE_BIRTH);
		System.out.println("Contains spouty (id 9)  is true:  " + animalList.contains(testAnimal));
		testAnimal = new BlueWhale(19, "Spouty the Blue Whale",BirthType.LIVE_BIRTH);
		System.out.println("Contains spouty (id 19) is false: " + animalList.contains(testAnimal));
		testAnimal = new BlueWhale(9, "Sprouty the Purple Whale",BirthType.LIVE_BIRTH);
		System.out.println("Contains sprouty (id 9) is false: " + animalList.contains(testAnimal));

		System.out.println("\n\n******TEST ANIMALS WITH WINGS");
		System.out.println(
				"Should print 4 lines: Cali can fly, Head in Sand flightless, Pretty can fly, and Tweety can fly.\n");
		for (Animal animal : animalList) {
			if (animal instanceof Winged) {
				Winged winged = (Winged) animal;
				String fly = winged.canFly() ? " can fly!" : " is flightless.";
				System.out.println(animal.getName() + fly);
			}
		}

		System.out.println("\n\n******TEST WATER DWELLERS");
		System.out.println(
				"Should print 5 lines: Beluga breathes air, Blingy breathes water, Goldie breathes water, Spouty breathes air, and Toothy breathes water.\n");
		for (Animal animal : animalList) {
			if (animal instanceof WaterDweller) {
				WaterDweller waterDweller = (WaterDweller) animal;
				String water = waterDweller.breathesAir() ? " lives in the water but breathes air!"
						: "lives in the water and breathes water";
				System.out.println(animal.getName() + water);
			}
			
		}

		System.out.println("\n\n******TEST ENDANGERED ANIMALS");
		System.out.println("Should print 5 lines for Cali, Irrelephant, Spouty, Tony and Toothy.\n");
		for (Animal animal : animalList) {
			
			if (animal instanceof Endangered) {
				Endangered endangered = (Endangered) animal;
				endangered.printConservationInformation();
			}

		}
	}
}
