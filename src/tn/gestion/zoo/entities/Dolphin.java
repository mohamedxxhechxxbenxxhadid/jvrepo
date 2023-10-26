package tn.gestion.zoo.entities;

public final class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        if(swimmingSpeed > 0){
            this.swimmingSpeed = swimmingSpeed;
        }else{
            this.swimmingSpeed = -swimmingSpeed;
        }

    }

    public Dolphin(String family, String name , int age, String habitat, float swimmingSpeed, boolean isMammal){
        super(family,name,age,habitat,isMammal);
        this.setSwimmingSpeed(swimmingSpeed);
    }
    public void swim(){
        System.out.println("this dolphin is swimming");
    }
    public String toString(){
        return super.toString() +"|Animal swimmingSpeed  " + this.swimmingSpeed ;
    }
}
