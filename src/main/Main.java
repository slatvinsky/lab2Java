package main;

import lab2.Car;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Car[] cars = fillCatsArray();
        System.out.println("---------------------");
        printCars(cars);
        System.out.println("---------------------");
        printMCars(cars);
    }

    private void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice().equals("Mersedes")) {
                System.out.println(cars[i]);
            }
        }
    }

    private void printMCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    private Car[] fillCatsArray() {
        return new Car[]{
                new Car(1,"Skoda Octavia A5", "8 800 $", "xxxx", 2010),
                new Car(2, "Dodge Durango", "33 000 $ ", "xxxx", 2017),
                new Car(3, "BMW X5", "22 100 $", "xxxx", 2011),
                new Car(4, "Porsche Boxster", "21 000 $", "xxxx", 2006)
        };
    }

}
