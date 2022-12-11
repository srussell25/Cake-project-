package cakeproject;

import java.util.ArrayList;

public class CakeProject {
    
    public static void main(String[] args) {
        
      ArrayList<Cake> myCakeShop = new ArrayList<>();
      
        
        myCakeShop.add(new BirthdayCake("Sarah", 16, "Chocolate", 2, 66));
        myCakeShop.add(new BirthdayCake("John", 25,"Chocolate", 3, 75));
        myCakeShop.add(new WeddingCake("Lauren", "John", "Carrot", 6, 400.99)); 
        myCakeShop.add(new WeddingCake("Amanda", "Paul", "Streberry", 4, 233.99)); 
        myCakeShop.add(new Cake("Blueberry", 1, 2.99)); 
        
        for(Cake c: myCakeShop)
        {
            System.out.println(c.getCard());
            System.out.println("------------------------");
        
        }
        

    }
    
}