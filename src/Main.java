import entities.*;
import model.AnimalAB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AnimalAB> animais = new ArrayList<>();
        animais.add(new Leao("Leão", "Felino", "Saavana", 2, 4, 1.2, 190));
        animais.add(new Elefante("Elefante", "Mamífero", "Selva", 10, 4, 3.0, 6000));
        animais.add(new Gato("Gato", "Felino", "Doméstico", 5, 4, 0.3, 4));
        animais.add(new Cachorro("Cachorro", "Canídeo", "Doméstico", 7, 4, 0.5, 15));
        animais.add(new Peixe("Peixe", "Osteíctio", "Água Doce", 1, 0, 0.2, 0.5));
        animais.add(new Pombo("Pombo", "oviparo", "Urbano", 3, 2, 2, 0.5, 0.3, 0.4));


        for (AnimalAB animal : animais){
            System.out.println(animal);
            animal.comer("Ração");
            animal.moverse("100 metros");
            animal.dormir("3 horas");
            System.out.println();
        }
    }
}