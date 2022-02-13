
package e.commerce;
import java.util.ArrayList;
/**
 *
 * @author akarc
 */
public class Orders {
    private String orderingUser;
    private String cardNumber;
    private String payment;
    
    public Orders(String orderingUser,String cardNumber,String payment)
    {
        this.orderingUser=orderingUser;
        this.cardNumber=cardNumber;
        this.payment=payment;
    }

  
    public String getOrderingUser() {
        return orderingUser;
    }

    
    public void setOrderingUser(String orderingUser) {
        this.orderingUser = orderingUser;
    }

    
    public String getCardNumber() {
        return cardNumber;
    }

    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

   
    public String getPayment() {
        return payment;
    }

    
    public void setPayment(String payment) {
        this.payment = payment;
    }

}
