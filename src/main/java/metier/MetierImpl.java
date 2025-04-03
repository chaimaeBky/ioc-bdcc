package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier") // remplace : <bean id="metier" class="metier.MetierImpl"> dans le config.xml
public class MetierImpl implements IMetier {
    @Autowired // demander a spring de creer des beans ( utilisant l'injection) !!not recommended!!
    private IDao dao;

    public MetierImpl(@Qualifier ("dao") IDao dao){
        this.dao = dao;
    }

    public MetierImpl() {
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
