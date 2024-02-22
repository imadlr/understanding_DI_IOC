package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        // injection des dépendances
        metier.setDao(dao);
        System.out.println("Résultat : "+metier.calcul());
    }
}
