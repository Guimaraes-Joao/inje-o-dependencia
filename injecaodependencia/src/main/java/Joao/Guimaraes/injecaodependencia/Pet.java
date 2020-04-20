package Joao.Guimaraes.injecaodependencia;

import Joao.Guimaraes.injecaodependencia.Interface.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private IAnimal iAnimal;

    public void exexute(){
        iAnimal.comunicar();
    }
}