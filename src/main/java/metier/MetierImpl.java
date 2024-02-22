package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired // lors la création (instanciation) de cette classe affecter à cette variable un objet de type IDao
    @Qualifier("vb") // pour spécifier le nom du bean à injecter
    private IDao dao;
    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 12 + 0.005;
    }

    /**
     * pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
