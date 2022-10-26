public class dog extends animal{
    String dogName;
    public void setDogName(String nameDog){
        dogName = nameDog;
    }
    public String getDogName(){
        return dogName; 
    }
    public dog(String noLegs, String color){
        super(noLegs, color);
        this.dogName = "Sa";
        
        
    }
    public dog(){
        
    }
    public void show(){
        System.out.println(getDogName());
    }
}