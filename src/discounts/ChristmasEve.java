package discounts;
import com.hz.Customer;

public class ChristmasEve implements Discounts {

    @Override
    public double getDiscount(Customer customer, int productID, int productAmount) {

        double discount = 0.0;

        boolean isFirstProduct = productID == 0;

        if (isFirstProduct == true){
            discount = .20;}
        else {
            discount = .125;
        }
        return discount;
    }
}