package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Gryffindor harry = new Gryffindor("Harry Potter", 80, 81, 97,97,95);
        Gryffindor ron = new Gryffindor("Ron Weasley", 75, 91, 90, 99, 90);
        Gryffindor hermione = new Gryffindor("Hermione Granger",86,95,97,99, 99);

        Hufflepuff zach = new Hufflepuff("Zachariah Smith", 72, 70, 99,90,80);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 89,88,90,97,99);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 79,71,96,96,96);

        Ravenclaw zhou = new Ravenclaw("Zhou Chang", 70, 80,87,70,55,91);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 80,80,88,60,91,99);
        Ravenclaw marc = new Ravenclaw("Marcus Belby", 90,89,97,14,71,2);

        Slytherin draco = new Slytherin("Draco Malfoy", 80,87,81,99,99,75,91);
        Slytherin graham = new Slytherin("Graham Montagu", 55,99,99,12,99,99,99);
        Slytherin greg = new Slytherin("Gregory Goyle", 55,45,45,39,59,99,99);

        ServiceClass service = new ServiceClass();

        service.print(hermione);
        service.print(greg);

        service.print(harry);
        service.print(hermione);
        service.compare(harry, hermione);

        service.print(draco);
        service.compare(draco, harry);


    }
}