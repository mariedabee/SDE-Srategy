package discounts;
import com.hz.Customer;

public class NoSale implements Discounts {

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        double discount ;

        if (customer.isRegular()) {
            discount = .15;
        }
        else {
            discount = 0.0;
        }
        return discount;
    }
}
