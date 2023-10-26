package tn.gestion.zoo.entities;

public sealed class Animal permits  Aquatic ,Terrestrial {
    private String family;
    private String name;

    private int age ;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0){
            System.out.println("age can't be negative");
        }else{
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    boolean isMammal;


    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }

    public String toString(){
        return "|Animal Family : " + this.family + " |Animal name : " + this.name +" |Animal age : " + this.age + " |Animal isMammal or no : " + this.isMammal ;
    }
}
