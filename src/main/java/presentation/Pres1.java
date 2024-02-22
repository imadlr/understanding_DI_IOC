package presentation;

import extension.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    // factory : là ou on va fabrique les objets
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao); // injection via constructor
        // injection des dépendances
        //metier.setDao(dao);
        System.out.println("Résultat : " + metier.calcul());
    }
}
