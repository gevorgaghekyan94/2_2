package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Rose rose = new Rose();
        Bud bud = new Bud();
        Petal petal = new Petal();
        petal.setColor(Color.RED);
        ArrayList<Petal> petals = new ArrayList<>();
        petals.add(petal);
        bud.setPetals(petals);
        bud.setDegreeOfOpenness(0);
        rose.setBud(bud);
        rose.setHeight(150);

        System.out.println(rose.getBud().getDegreeOfOpenness());
        rose.printQuantityOfPetals();

        rose.bloom();
        System.out.println(rose.getBud().getDegreeOfOpenness());
        rose.printQuantityOfPetals();

        rose.wilt();
        System.out.println(rose.getBud().getDegreeOfOpenness());
        rose.printQuantityOfPetals();

    }
}
