package inlämningsuppgift1;

/**
 * Abstrakt klass som representerar ett djur och implementerar IAnimal
 * interface.
 * 
 * @author Robin
 *
 */
public abstract class Animal implements IAnimal {

	private String name; // private så det inte går att ändra direkt i ärvande klasser
	private int weight;

	/**
	 * Konstruktor som kollar in värden för parametrarna genom set metoder.
	 * 
	 * @param name
	 * @param weight
	 * @throws Exception
	 */
	public Animal(String name, int weight) throws Exception {
		setName(name);
		setWeight(weight);
	}

	public String getName() {
		return this.name;
	}

	/**
	 * sätter namnet på djuret och kollar så värdet inte är tomt.
	 * 
	 * @param name
	 * @throws Exception
	 */
	public void setName(String name) throws Exception { // throws exception
		if (!name.isBlank()) {
			this.name = name;
		} else {
			throw new Exception("Namnet får inte vara tomt!");
		}
	}

	public int getWeight() {
		return this.weight;
	}

	/**
	 * Sätter djurets vikt och ser till att det är positivt
	 * 
	 * @param weight
	 * @throws Exception
	 */
	public void setWeight(int weight) throws Exception {
		if (weight > 0) {
			this.weight = weight;
		} else {
			throw new Exception("Vikten måste vara positiv!");
		}
	}

	/**
	 * Implementerad metod från interfacet som returnerar en sträng med info om
	 * djuret.
	 */
	public String getAnimalInfo() {
		String animalInfo = this.getClass().getSimpleName() + ". Namn: " + this.getName() + ". Vikt: "
				+ (this.getWeight() / 1000) + "kg. " + "Den ska ha " + this.calculatePortion() + "g "
				+ this.getFoodType();
		return animalInfo;
	}

	public abstract int calculatePortion(); // abstrakt metod som implementeras i klasserna som ärver från djur

	public abstract String getFoodType();
}
