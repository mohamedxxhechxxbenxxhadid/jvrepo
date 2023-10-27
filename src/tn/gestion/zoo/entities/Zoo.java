package tn.gestion.zoo.entities;

public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    final int NBR_CAGES=25 ;
    final int NBR_AQU=10 ;

    private static int nbrTotalAnimals ;
    public Aquatic[] aquaticAnimals ;

    public int nbraquatic;
    public Animal[] getAnimals() {
        return animals;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()) {
            System.out.println("zoo name can t be empty");
        }else{
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public static int getNbrTotalAnimals() {
        return nbrTotalAnimals;
    }

    public static void setNbrTotalAnimals(int nbrTotalAnimals) {
        Zoo.nbrTotalAnimals = nbrTotalAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    int nbrAnimals;
    public Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.city = city;
        nbrAnimals =0 ;
        this.aquaticAnimals = new Aquatic[NBR_AQU] ;
        nbraquatic = 0 ;
    }

    public void displayZoo(){
        System.out.println("The tn.esprit.gestionzoo.entities.Zoo name : " + this.name );
        System.out.println("The tn.esprit.gestionzoo.entities.Zoo city : " + this.city );
        System.out.println("The tn.esprit.gestionzoo.entities.Zoo nbrCages : " + this.NBR_CAGES );
    }
    @Override
    public String toString(){
        return "The tn.esprit.gestionzoo.entities.Zoo name : " + this.name + "\n The tn.esprit.gestionzoo.entities.Zoo city : " + this.city +"\n The tn.esprit.gestionzoo.entities.Zoo nbrCages : " + this.NBR_CAGES;
    }

    public boolean addAnimal(Animal animal){
        if(isZooFull(this)){
            System.out.println("zoo is full");
            return false ;
        }
        if(this.Setanimals(animal)){
            System.out.println("this animal's name exists thnx");
            return false;
        }
        for (int i=0 ;i<NBR_CAGES ; i++){
           if(animals[i] == null){
               nbrAnimals++;
               nbrTotalAnimals++;
              animals[i] = animal ;
              return true ;
           }
        }
        return false ;
    }
    public void afficheAnimal(){
        for(int i=0;i<NBR_CAGES;i++){
            if(animals[i] == null){
                break;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("animal number "+(i+1)+ animals[i]);
            System.out.println("-----------------------------------------------");
        }
    }
    public int searchAnimal(Animal animal){
        for (int i=0;i<NBR_CAGES;i++){
            if(this.animals[i] != null) {
                if (this.animals[i].getName().equals(animal.getName())) {
                    return i;
                }
            }
        }
        return -1 ;
    }
    private boolean Setanimals( Animal animal){
        for (int i=0;i<NBR_CAGES;i++){
            if(this.animals[i] != null) {
                if (this.animals[i].getName().equals(animal.getName())) {
                    return true;
                }
            }
        }
        return false ;
    }
    public void removeAnimal(Animal animal){
        for (int i=0;i<NBR_CAGES;i++){
            if(animals[i] != null){
                if (animal.getName().equals(animals[i].getName())) {
                    nbrAnimals--;
                    nbrTotalAnimals--;
                    animals[i] = null;
                    for (int j = i; j < NBR_CAGES; j++) {
                        if (animals[j + 1] == null) {
                            System.out.println("the animal is removed " + animal.getName());
                            i = NBR_CAGES ;
                            break;
                        } else {
                            animals[j] = animals[j + 1];
                            animals[j+1] = null ;
                        }
                    }
                }
            }else  {
                System.out.println("this animal doesn't exist " + animal.getName());
                break;
            }
        }
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimals<z2.nbrAnimals){
            return z2 ;
        }else if (z1.nbrAnimals>z2.nbrAnimals) {
            return z1;
        }else{
            System.out.println("egaux");
            return z1 ;
        }
    }
    public static boolean isZooFull(Zoo zoo){
        return zoo.nbrAnimals == zoo.NBR_CAGES;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if(nbraquatic == NBR_AQU){
            System.out.println("aquatic is full");
        }else{
            System.out.println(nbraquatic);
            aquaticAnimals[nbraquatic] = aquatic ;
            nbraquatic=nbraquatic+1 ;
        }
    }
    public void swim(){
        for(int i=0 ;i<10;i++){
            if(this.aquaticAnimals[i] == null){
                break;
            }else{
                aquaticAnimals[i].swim();
            }
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxdepth = 0f;
        for(Aquatic aquaAnimal : aquaticAnimals){
            if(aquaAnimal == null)
                break;
            if(aquaAnimal instanceof Penguin penguin){
                if (penguin.getSwimmingDepth() >maxdepth){
                    maxdepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxdepth ;
    }
    public void displayNumberOfAquaticsByType(){
        int dauphinNumber = 0,penguinNumber =0 ;
        for(Aquatic aquaAnimal : aquaticAnimals){
            if(aquaAnimal == null)
                break;
            if(aquaAnimal instanceof Penguin){
                penguinNumber = penguinNumber+1;
            }else{
                dauphinNumber = dauphinNumber+1 ;
            }
        }
        System.out.println("nombre de dauphin est " + dauphinNumber +" nombre de penguin est " + penguinNumber);
    }
}
