package inlämningsuppgift1;

/**
 * katt klass som ärver från djur.
 * 
 * @author Robin
 *
 */
public class Orm extends Animal {

	private static String foodType = "Ormpellets"; // statiskt fält då alla katter äter samma mat.

	/**
	 * konstruktor initierar från superklassen.
	 * 
	 * @param name
	 * @param weight
	 * @throws Exception
	 */
	public Orm(String name, int weight) throws Exception {
		super(name, weight);
	}

	/**
	 * implementerad abstrakt metod från superklassen. Den räknar ut hur mycket mat
	 * i gram som ska serveras.
	 */
	@Override
	public int calculatePortion() {
		return 20;
	}

	/**
	 * returnernar vilken typ av mat ormen ska ha.
	 */
	@Override
	public String getFoodType() {
		return Orm.foodType;
	}

}
