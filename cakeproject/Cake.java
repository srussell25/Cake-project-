package cakeproject;

public class Cake {
    
    public String flavor; 
    public int tiers;
    public double price; 

    public Cake(String flavor, int tiers, double price) {
        this.flavor = flavor;
        this.tiers = tiers;
        this.price = price;
    }
    
    public String getCard(){
        return String.format("A %d tier %s cake\t$%.2f\n", tiers, flavor, price);
    }
}
