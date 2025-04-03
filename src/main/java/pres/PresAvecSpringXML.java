package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier"); // retourne un objet => faut faire un casting puisqu'il ss pas le type !
    System.out.println("res="+metier.calcul());
    }
}
