package inlämningsuppgift1;

/**
 * katt klass som ärver från djur.
 * 
 * @author Robin
 *
 */
public class Katt extends Animal {

	private static String foodType = "Kattfoder"; // statiskt fält då alla katter äter samma mat.

	/**
	 * konstruktor initierar från superklassen.
	 * 
	 * @param name
	 * @param weight
	 * @throws Exception
	 */
	public Katt(String name, int weight) throws Exception {
		super(name, weight);
	}

	/**
	 * implementerad abstrakt metod från superklassen. Den räknar ut hur mycket mat
	 * i gram som ska serveras.
	 */
	@Override
	public int calculatePortion() {
		return super.getWeight() / 150;
	}

	/**
	 * returnernar vilken typ av mat katten ska ha.
	 */
	@Override
	public String getFoodType() {
		return Katt.foodType;
	}

}
