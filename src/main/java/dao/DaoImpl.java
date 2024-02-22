package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("vb") // => au démarrage de l'application créer un objet de cette classe
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version de bdd");
        return 34;
    }
}
