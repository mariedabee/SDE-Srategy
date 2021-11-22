package discounts;
import com.hz.Customer;

public class NoDiscount implements Discounts{
        @Override
        public double getDiscount(Customer customer, int productIndex, int productCount) {

            return 0;
        }
    }
