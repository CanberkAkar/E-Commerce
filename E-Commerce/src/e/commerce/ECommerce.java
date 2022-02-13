
package e.commerce;

/**
 *
 * @author akarc
 */
public class ECommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Users users= new Users("CanberkAkar","Canberk","12canberk56","akarcanberk@gmail.com",
                "5711/7 Bornova/İzmir","Kamil Tunca Caddesi 426 Sokak No:35","03.07.1998");
        CreditCard creditCard=new CreditCard("5187515123698792","Canberk AKAR"," 587","11/25");
        System.out.println("Which payment way do you prefer");
        Products products = new Products("Lenovo","GRAY","COMPUTER",5,11,"16 GB RAM NVIDIA 1650 TI 512 SSD",6000);
        Products products1 = new Products("ASUS","RED","COMPUTER",8,112,"8 GB RAM NVIDIA 1650 TI 512 SSD",8000);
        Orders orders=new Orders("Canberk","5187515123698792","installment");
        users.creditCard(creditCard);
        users.orderedInformation(orders);
        users.addFavouriteProducts(products);
        users.orderedFavouriteProducts(products);
        products.Payment("installment",11000);
    }
    
}
