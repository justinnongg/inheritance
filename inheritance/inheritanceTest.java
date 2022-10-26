public class inheritanceTest{
    public static void main(String[] args){
        animal Animal1 = new animal();
        dog dog1 = new dog();
        dog1.setDogName("Tyrone");
        Animal1.setColor("Blue"); 
        Animal1.setNoLegs("4");
        Animal1.showInfo();
        dog1.show();
    }
}