package com.company;

public class Rose {

    private Bud bud;
    private int height;

    public Rose() {
    }

    public Rose(Bud bud, int height) {
        this.bud = bud;
        if (height > 0 && height < 200) {
            this.height = height;
        }
    }

    public void bloom() {
        while (this.bud.getDegreeOfOpenness() <= 4) {
            this.bud.setDegreeOfOpenness(this.bud.getDegreeOfOpenness() + 1);
            while (this.bud.getPetals().size() <= 49) {
                this.bud.getPetals().add(new Petal(bud.getPetals().get(0).getColor()));
            }
        }
    }

    public void wilt() {
        while (this.bud.getDegreeOfOpenness() >= 1) {
            this.bud.setDegreeOfOpenness(this.bud.getDegreeOfOpenness() - 1);
            while (this.bud.getPetals().size() >= 1) {
                this.bud.getPetals().remove(this.bud.getPetals().size() - 1);
            }
        }
    }

    public void printQuantityOfPetals() {
        System.out.println(this.bud.getPetals().size());
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0 && height < 200) {
            this.height = height;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rose rose = (Rose) o;

        if (height != rose.height) return false;
        return bud != null ? bud.equals(rose.bud) : rose.bud == null;
    }

    @Override
    public int hashCode() {
        int result = bud != null ? bud.hashCode() : 0;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "bud=" + bud +
                ", height=" + height +
                '}';
    }
}
