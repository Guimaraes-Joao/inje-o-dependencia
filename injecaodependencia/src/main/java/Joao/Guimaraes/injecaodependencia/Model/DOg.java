package Joao.Guimaraes.injecaodependencia.Model;


import Joao.Guimaraes.injecaodependencia.Interface.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class DOg implements IAnimal {

    @Override
    public void comunicar() {
        //TODO Auto-generated method stub
        System.out.println("Au Auuu");
    }
}
