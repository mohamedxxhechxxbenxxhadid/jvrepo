package tn.gestion.zoo.entities;

public sealed abstract class Aquatic extends Animal permits Dolphin,Penguin{

    private String habitat ;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name , int age, String habitat, boolean isMammal){
        super(family,name,age,isMammal) ;
        setHabitat(habitat);

    }
    public String toString(){
        return super.toString() + "|Animal habitat: "+ this.habitat ;
    }

    public abstract void swim() ;
    @Override
    public boolean equals(Object obj){
        System.out.println(super.getName());
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if (obj instanceof Aquatic aquatic)
            return this.getName().equals(aquatic.getName()) && this.getAge() == aquatic.getAge() && this.getHabitat().equals(aquatic.getHabitat());
        return false;
    }
}
