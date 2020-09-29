package inlämningsuppgift1;

/**
 * Hund klass som ärver från djur.
 * 
 * @author Robin
 *
 */
public class Hund extends Animal {

	private static String foodType = "Hundfoder"; // statiskt fält då alla katter äter samma mat

	/**
	 * konstruktor initierar från superklassen.
	 * 
	 * @param name
	 * @param weight
	 * @throws Exception
	 */
	public Hund(String name, int weight) throws Exception {
		super(name, weight);
	}

	/**
	 * implementerad abstrakt metod från superklassen. Den räknar ut hur mycket mat
	 * i gram som ska serveras.
	 */
	@Override
	public int calculatePortion() {
		return super.getWeight() / 100;
	}

	/**
	 * returnernar vilken typ av mat hunden ska ha.
	 */
	@Override
	public String getFoodType() {
		return Hund.foodType;
	}

}
