package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("vws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        return 22;
    }
}
