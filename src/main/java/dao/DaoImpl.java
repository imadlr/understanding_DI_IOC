package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version de bdd");
        return 34;
    }
}
