package tn.esprit.gestion.main;

import tn.gestion.zoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("lion_family","lion", 5,true);
        Animal animal2 = new Animal("lion_family","tigri", 5,true);
        Animal animal3 = new Animal("lion_family","tigri3", 5,true);
        Animal animal4 = new Animal("lion_family","tigri4", 5,true);
        Animal animal5 = new Animal("lion_family","tigri5", 5,true);
        Animal animal6 = new Animal("lion_family","tigri6", 5,true);
        Zoo myZoo = new Zoo("hadiket alhayawen","centre ville");
        System.out.println("=========displayZoo in 3 ways =========");
        System.out.println("______ myZoo.displayZoo(); ______");
        myZoo.displayZoo();
        System.out.println("______ System.out.println(myZoo.toString()); ______");
        System.out.println(myZoo);
        System.out.println("______ System.out.println(myZoo.toString()); ______");
        System.out.println(myZoo.toString());
        System.out.println("=========Addanimals=========");
        System.out.println(myZoo.addAnimal( animal1) ) ;
        System.out.println(myZoo.addAnimal( animal2) ) ;
        System.out.println(myZoo.addAnimal( animal3) ) ;
        System.out.println(myZoo.addAnimal( animal4) ) ;
        System.out.println(myZoo.addAnimal( animal5) ) ;
        System.out.println(myZoo.addAnimal( animal5) ) ;
        System.out.println("========= Affiche animals=========");
        myZoo.afficheAnimal();
        System.out.println("=========Search animals=========");
        System.out.println(myZoo.searchAnimal(animal1));
        System.out.println(myZoo.searchAnimal(animal2));
        System.out.println(myZoo.searchAnimal(animal6));
        System.out.println("=========Remove animals=========");
        myZoo.removeAnimal(animal4);
        myZoo.removeAnimal(animal6);
        System.out.println("=========Searching the removed animal =========");
        System.out.println(myZoo.searchAnimal(animal4));
        System.out.println("=========Afficheanimals after removing =========");
        myZoo.afficheAnimal();
        System.out.println("========= comparerZoo =========");
        Zoo myZoo1 = new Zoo("zoo2","ariana");
        System.out.println(myZoo1.addAnimal( animal1) ) ;
        System.out.println(myZoo1.addAnimal( animal2) ) ;
        System.out.println(myZoo1.addAnimal( animal3) ) ;
        System.out.println(myZoo1.addAnimal( animal4) ) ;
        System.out.println(myZoo1.addAnimal( animal5) ) ;
        System.out.println(Zoo.comparerZoo(myZoo1,myZoo));
        System.out.println("========= isZooFull =========");
        System.out.println(Zoo.isZooFull(myZoo1));
        System.out.println("========= Static =========");
        System.out.println(Zoo.getNbrTotalAnimals());
        System.out.println("======Prosit5=====");
        Penguin penguin = new Penguin("penguin","happyfeet",22,"mexico",20f ,true);
        Penguin penguin1 = new Penguin("penguin","happyfeet",22,"mexico",25f ,true);
        Penguin penguin2 = new Penguin("penguin","happyfeet2",22,"mexico",26f ,true);
        Penguin penguin3 = new Penguin("penguin","happyfeet3",22,"mexico",2f ,true);
        Dolphin dolphin = new Dolphin("dolphin","eden",22,"lambadoza",20f ,true) ;
        System.out.println("---------penguin------");
        System.out.println(penguin);
        System.out.println("-------dolphin--------");
        System.out.println(dolphin);
        System.out.println("================Prosit6===============");
        System.out.println("---------add aquatic ------");
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);
        myZoo.swim();
        System.out.println("=======instruction 29=========");
        System.out.println("le profondeur maximale de pingouins "+ myZoo.maxPenguinSwimmingDepth());
        System.out.println("=======instruction 30=========");
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("=======instruction 31=========");
        System.out.println(penguin.equals(penguin1));

        // instruction 8: je remarque qu'il affiche la reference du objet MyZoo
        // instruction 9 : after i added string toString method it worked fine
    }

}