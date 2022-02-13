
package e.commerce;
import java.util.ArrayList;
/**
 *
 * @author akarc
 */
public class CreditCard {
      //credit card number, credit card user, security code 
//and expiration date of the credit cards.
    private String cardNumber;
    private String  creditCardUsers;
    private String securityCode;
    private String dateOfCreditCards;
   
    
    public CreditCard(String cardNumber,String creditCardUsers,String securityCode,String dateOfCreditCards){
        this.cardNumber=cardNumber;
        this.creditCardUsers=creditCardUsers;
        this.securityCode=securityCode;
        this.dateOfCreditCards=dateOfCreditCards;
        
        System.out.println(" ");
        System.out.println("Credit card ınformation has been recognized");
    }
     public CreditCard(){
     
     }
    
    public String getCardNumber() {
        return cardNumber;
    }

    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

 
    public String getCreditCardUsers() {
        return creditCardUsers;
    }

   
    public void setCreditCardUsers(String creditCardUsers) {
        this.creditCardUsers = creditCardUsers;
    }

   
    public String getSecurityCode() {
        return securityCode;
    }

   
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

   
    public String getDateOfCreditCards() {
        return dateOfCreditCards;
    }


    public void setDateOfCreditCards(String dateOfCreditCards) {
        this.dateOfCreditCards = dateOfCreditCards;
    }

}
