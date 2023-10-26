package tn.gestion.zoo.entities;

public final class  Terrestrial extends Animal {
    private int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String family, String name , int age, int nbrLegs, boolean isMammal){
        super(family,name,age,isMammal) ;
        setNbrLegs(nbrLegs);
    }
    public String toString(){
        return super.toString() +"|Animal nbrlegs : "+ this.nbrLegs ;
    }

}
