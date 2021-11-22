package discounts;
import com.hz.SalesAction;

public class DiscountCounter{

    public static Discounts getDefaultDiscount() {

        return new NoDiscount();
    }

    public static Discounts getDiscountBySalesAction(SalesAction action) {

        if (action == SalesAction.NoAction) return new NoSale();

        if (action == SalesAction.BlackFriday) return new BlackFriday();

        if (action == SalesAction.ChristmasEve) return new ChristmasEve();

        throw new IllegalArgumentException("Enum value: " + action + " is not supported.");
    }
}