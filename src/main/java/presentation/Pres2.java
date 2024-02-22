package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // instanciation d'objet dao

        // lire le fichier de configuration
        Scanner scanner = new Scanner(new File("config.txt"));
        // extraire le nom de la classe à utiliser
        String daoClasseName = scanner.nextLine();
        // charger la classe en mémoire
        Class<?> cDao = Class.forName(daoClasseName);
        // instanciation dynamique du class
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // <=> new DaoImpl2()

        // instanciation d'objet metier

        String metierClasseName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClasseName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        // injection des dépendances
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);

        System.out.println("Résultat : " + metier.calcul());
    }
}