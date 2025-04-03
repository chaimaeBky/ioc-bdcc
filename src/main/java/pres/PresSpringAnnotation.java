package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.SocketOption;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext" , "metier" , "dao") ;//(net.ELBAKAY) => ( scanner toutes les classes qui se trouve dans le package net.ELBAKAY)
        // si tu trouve une classe qui utilise lannotation component , creer moi un objet de cette classe
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());

    }
}
