


package e.commerce;
import java.util.ArrayList;

/**
 *
 * @author akarc
 */
public class Users 
{
     private String Name;
    private String Username;
    private String Password;
    private String email;
    private String HomeAdress;
    private String Birthday;
    private String WorkAdress;
    private ArrayList<Products> orderedProdcuts;
    private ArrayList<Products> favouriteProducts;
    private ArrayList<CreditCard> creditCard;
    private ArrayList<Orders> orderedInformation;
     public Users(){
     
     }
    public Users(String name,String userName,String password,String email,String homeAdress,String workAdress,String Birthday){
        this.Name=name;
        this.Username=userName;
        this.Password=password;
        this.email=email;
        this.HomeAdress=homeAdress;
        this.WorkAdress=workAdress;
        this.Birthday=Birthday;
        this.orderedProdcuts=new ArrayList<Products>();
        this.favouriteProducts=new ArrayList<Products>();
        this.creditCard=new ArrayList<CreditCard>();
        this.orderedInformation=new ArrayList<Orders>();
        writeAttributes();
    }
    public String getName() {
        return Name;
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getUsername() {
        return Username;
    }

    
    public void setUsername(String Username) {
        this.Username = Username;
    }

    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getHomeAdress() {
        return HomeAdress;
    }

   
    public void setHomeAdress(String HomeAdress) {
        this.HomeAdress = HomeAdress;
    }

    
    public String getWorkAdress() {
        return WorkAdress;
    }

    
    public void setWorkAdress(String WorkAdress) {
        this.WorkAdress = WorkAdress;
    }
    
     
    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday =Birthday;
    }
    
      public void writeAttributes(){
        
        System.out.println("name: " + this.Name+"\n"+"Username: " + this.Username+
        "\n"+"Email: "+this.email+"\n"+"HomeAdress: " + this.HomeAdress + "\n" + "WorkAdress: " + this.WorkAdress+ "\n" + "Birthday: " + this.Birthday);
        System.out.println("HELLO  "+this.Name+"  WELCOME TO SYSTEM");
        
      }
  

   public boolean addFavouriteProducts(Products favouriteProduct)
     {
         
         return  this.favouriteProducts.add(favouriteProduct);
        
     }
    public boolean orderedFavouriteProducts(Products orderedProdcuts)
     {
    
         return  this.orderedProdcuts.add(orderedProdcuts);
         
     }
     public boolean creditCard(CreditCard creditCard)
     {
    
         return  this.creditCard.add(creditCard);
         
     }
      public boolean orderedInformation(Orders orderedInformation)
     {
    
         return  this.orderedInformation.add(orderedInformation);
         
     }
    
  
}
