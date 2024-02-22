package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    //dépend d'une interface : couplage faible
    private IDao dao; // jusqu'à maintenant la valeur par défaut de dao est null

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
