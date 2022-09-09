/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;

/**
 *
 * @author Bhasu
 */
public class User {
    
    private String Month;
 private int Year, Amount;
 public User (String Month, int Year, int Amount )
 {
     this.Month=Month;
     this.Year=Year;
     this.Amount=Amount;
     
     
 }
    
    
    public String getMonth(){
        return Month;
    }
    
    
    
     public int getYear(){
        return Year;
    }
     public int getAmount(){
        return Amount;
    }
    
    
    
    
    
    
}
