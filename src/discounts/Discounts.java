package discounts;

import com.hz.Customer;
import products.Product;

public interface Discounts {

    public double getDiscount(Customer customer, int productID, int productAmount);
}