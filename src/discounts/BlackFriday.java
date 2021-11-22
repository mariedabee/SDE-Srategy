package discounts;
 import com.hz.Customer;
 import products.Product;

public class BlackFriday implements Discounts{

    private int maxValue = 80;

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        double discount = productCount < maxValue
                ? productCount : maxValue;

        return discount / 100;
    }
}