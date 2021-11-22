package com.hz;
import discounts.Discounts;
import discounts.DiscountCounter;
import discounts.NoDiscount;
import discounts.NoSale;

public class Checkout {

    private SalesAction salesAction;
    private Discounts discountStrategy;

    public void nextInLine(Customer customer) {

        // init checkout
        DiscountCalculator discountCalculator = new DiscountCalculator(customer);
        if(salesAction == SalesAction.ChristmasEve) {
            discountCalculator.setChristmasEve(true);
        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountCalculator);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }

    public void setDiscountStrategy(Discounts discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
