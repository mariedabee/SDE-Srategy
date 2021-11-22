package com.hz;

import discounts.DiscountCounter;
import discounts.Discounts;
import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        /*
        // There is a shop with a checkout
        Checkout kassa5 = new Checkout(SalesAction.ChristmasEve);

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");

        // buying stuff
        piet.buys(new CuteTeddyBear());
        anne.buys(new CuteTeddyBear());

        // and proceed to checkout
        kassa5.nextInLine(piet);
        kassa5.nextInLine(anne);

*/



        // an object to checkout
        Checkout kassa2 = new Checkout();

        Discounts discount = DiscountCounter.getDiscountBySalesAction(SalesAction.NoAction);
        kassa2.setDiscountStrategy(discount);

        //customers
        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");

        // buying stuff
        piet.buys(new CuteTeddyBear());
        piet.buys(new CuteTeddyBear());

        anne.buys(new CuteTeddyBear());
        anne.buys(new CuteTeddyBear());

        // and proceed to checkout with the correct discounts 
        kassa2.nextInLine(piet);
        kassa2.nextInLine(anne);
    }
}
