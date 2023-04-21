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

        Traveler eric = new Traveler("eric", 55, 145);


        Wagon ourWagon = new Wagon(5);
        //asking the wagon to give us the passenger list and we are checking the size (number of passengers)
        System.out.println( "Number of people on the wagon: " + ourWagon.getPassengers().size());

        //this line attempts to put dwene (or any traveler we want) into the wagon if there is room
        System.out.println(ourWagon.join(dwene));

        //asking the wagon to give us the passenger list and we are checking the size (number of passengers)
        System.out.println( "Number of people on the wagon: " + ourWagon.getPassengers().size());
//
        System.out.println(ourWagon.join(eric));

        System.out.println(ourWagon.getTotalFood());

    }

}
