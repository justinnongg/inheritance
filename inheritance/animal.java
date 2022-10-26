public class animal{
    
    private String color;
    private String noLegs;
    
    public animal(){
        
    }
    public animal(String color,String noLegs){
        this.color= "";
        this.noLegs = "0";
        
    }
    public void showInfo(){
        System.out.println(getColor());
        System.out.println(getNoLegs());
    }
    public void setColor(String colors){
        color = colors;
    }
    public String getColor(){
        return color;
    }
    public void setNoLegs(String numLegs){
        noLegs = numLegs;
    }
    public String getNoLegs(){
        return noLegs;
    }
}