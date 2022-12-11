package cakeproject;

public class BirthdayCake extends Cake{
    private String name;
    private int age;

    public BirthdayCake(String Name, int Age, String Flavor, int Tiers, double Price) {
        super(Flavor, Tiers, Price);
        this.name = name;
        this.age = age;
        
    
        }
    public String getCard(){
        return super.getCard()+ "Happy birthday to " + name + " you are finally " + age;
    }
}
