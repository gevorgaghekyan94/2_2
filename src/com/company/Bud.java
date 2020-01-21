package com.company;

import java.util.ArrayList;

public class Bud {

    private ArrayList<Petal> petals;
    private int degreeOfOpenness;

    public Bud() {
    }

    public Bud(ArrayList<Petal> petals, int degreeOfOpenness) {
        if (petals.size() > 0 && petals.size() < 50) {
            this.petals = petals;
        }
        if (degreeOfOpenness >= 0 && degreeOfOpenness <= 5) {
            this.degreeOfOpenness = degreeOfOpenness;
        }
    }

    public ArrayList<Petal> getPetals() {
        return petals;
    }

    public void setPetals(ArrayList<Petal> petals) {
        if (petals.size() > 0 && petals.size() < 50) {
            this.petals = petals;
        }
    }

    public int getDegreeOfOpenness() {
        return degreeOfOpenness;
    }

    public void setDegreeOfOpenness(int degreeOfOpenness) {
        if (degreeOfOpenness >= 0 && degreeOfOpenness <= 5) {
            this.degreeOfOpenness = degreeOfOpenness;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bud bud = (Bud) o;

        if (degreeOfOpenness != bud.degreeOfOpenness) return false;
        return petals != null ? petals.equals(bud.petals) : bud.petals == null;
    }

    @Override
    public int hashCode() {
        int result = petals != null ? petals.hashCode() : 0;
        result = 31 * result + degreeOfOpenness;
        return result;
    }

    @Override
    public String toString() {
        return "Bud{" +
                "petals=" + petals +
                ", degreeOfOpenness=" + degreeOfOpenness +
                '}';
    }
}
