package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

   private IDao dao;

   public MetierImpl(IDao dao){
       this.dao = dao;
   }

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
