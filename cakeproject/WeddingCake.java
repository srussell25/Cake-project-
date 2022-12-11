package cakeproject;

public class WeddingCake extends Cake {
    private String bridesName;
    private String groomsName;

    public WeddingCake(String BridesName, String GroomsName, String Flavor, int Tiers, double Price) {
        super(Flavor, Tiers, Price);
        this.bridesName = BridesName;
        this.groomsName = GroomsName;
    }
    
    @Override
   public String getCard(){ 
       return super.getCard() + "Congratulations to " + bridesName + " & " + groomsName;
   }
}
