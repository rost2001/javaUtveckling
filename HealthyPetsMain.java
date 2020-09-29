package inlämningsuppgift1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * Main klass för djurhotellet som instansierar olika djur och lägger in dom i
 * en ArrayList. Tillfrågar användaren vilket djur som ska matas och kollar så
 * djuret finns med i systemet, därefter skriver den ut informationen om djuret.
 * 
 * @author Robin
 *
 */
public class HealthyPetsMain {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();

		try {
			list.add(new Hund("Sixten", 5000));
			list.add(new Hund("Dogge", 10000));
			list.add(new Katt("Venus", 5000));
			list.add(new Katt("Ove", 3000));
			list.add(new Orm("Hypno", 1000));
		} catch (Exception e) { // kastar exception om det inte är korrekta värden
			e.printStackTrace();
			System.exit(1);
		}

		String in = JOptionPane.showInputDialog("Vilket djur ska få mat?");

		// iterator som går igenom listan och hittar djuret, annars ger det ett
		// felmeddelande.
		Iterator<Animal> itr = list.iterator();
		while (itr.hasNext()) {
			Animal a = itr.next();
			if (a.getName().equalsIgnoreCase(in)) {
				JOptionPane.showMessageDialog(null, a.getAnimalInfo());
				break;
			} else if (!itr.hasNext()) { // om iteratorn kommer till slutet av listan utan att hitta namnet
				JOptionPane.showMessageDialog(null, "Djuret finns inte med i systemet!");
			}
		}
	}
}
