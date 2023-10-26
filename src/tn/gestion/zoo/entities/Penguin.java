package tn.gestion.zoo.entities;

public final class Penguin extends Aquatic{
    private float swimmingDepth ;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        if(swimmingDepth > 0){
            this.swimmingDepth = swimmingDepth;

        }else{
            this.swimmingDepth = -swimmingDepth;
        }
    }

    public Penguin(String family, String name , int age,String habitat,float swimmingDepth,boolean isMammal){
        super(family,name,age,habitat,isMammal);
        setSwimmingDepth(swimmingDepth);
    }
    public void swim(){
        System.out.println("this penguin is swimming");
    }
    public String toString(){
        return super.toString() +"|Animal swimmingDepth  " + this.swimmingDepth ;
    }
}
