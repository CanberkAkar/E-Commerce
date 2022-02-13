/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

/**
 *
 * @author akarc
 */
public class Products {
       private String productName;
    private String color;
    private String category;
    private int stockNumber;
    private int weight;
    private String description;
    private int price; 
    private int budget;
    private int lastBudget;
     
     public Products(String productName,String color,String category,int stockNumber,int weight,String description,int price)
    {
       this.productName=productName;
       this.color=color;
       this.category=category;
       this.stockNumber=stockNumber;
       this.weight=weight;
       this.description=description;
       this.price=price;
       
    }
        public Products(){
        }
    
    public String getProductName() {
        return productName;
    }

   
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    
    public String getCategory() {
        return category;
    }

    
    public void setCategory(String category) {
        this.category = category;
    }

    
    public int getStockNumber() {
        return stockNumber;
    }

   
    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getWeight() {
        return weight;
    }

   
    public void setWeight(int weight) {
        this.weight = weight;
    }

  
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }

   
    public int getPrice() {
        return price;
    }

    
    public void setPrice(int price) {
        this.price = price;
    }
    
      public void Payment(String paymnet,int Budget)
    { 
       
        if(Budget>this.price)
        {
            
        if(paymnet.equals("cash")){
            System.out.println("---cash---");
            cashPayment(Budget);
           
            System.out.println("Your chooses is cash");
            
            int stock=this.stockNumber- 1;
           
            System.out.println("Number of product stock is "+stock); 
        }
        else if (paymnet.equals("installment"))
            
        {   System.out.println("---installment---");
            installmentPayment(Budget);
            System.out.println("Your chooses is installment");
           int stock=this.stockNumber- 1;
            System.out.println("Number of product stock is "+stock); 
        }
        else
         {
        System.out.println("Wrong choice"); 
         }
        }
        else
        {
           System.out.println("Your budget is  not enough");
        
        }
    }
    public void cashPayment(int budget)
    {
         
        lastBudget=budget-price;
        System.out.println("Payment completed.Your new bugdet is "+lastBudget);
        
    }
    
    public void installmentPayment(int budget){
     
        System.out.println("Your choose is 12 month installment option");
        
        lastBudget=budget-(price/12);
        System.out.println("");
        budget=lastBudget;   
        System.out.println("Payment completed.Your new bugdet is "+budget);
        
    }
}
