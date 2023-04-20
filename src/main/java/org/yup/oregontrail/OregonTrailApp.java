package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main (String[] args){

        Traveler dwene = new Traveler("dwene", 100, 100);

        System.out.println("before hunting food: " + dwene.getFood());

        System.out.println(dwene.hunt());

        System.out.println("After hunting " + dwene.getFood());
        System.out.println(dwene.hunt());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.eat());
        System.out.println(dwene.getFood());
    }

}
