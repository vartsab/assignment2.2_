package com.company;

public class ServiceClass {

    public void print(Gryffindor student) {
        System.out.println(
                student.getFullName() +
                        "\n\tpower:\t" + student.getPower() +
                        "\n\ttransgression distance:\t" + student.getTransgressionDistance() +

                        "\n\tnobility:\t" + student.getNobility() +
                        "\n\thonour:\t" + student.getHonour() +
                        "\n\tbravery:\t" + student.getBravery()
        );
        System.out.println();
    }

    public void print(Hufflepuff student) {
        System.out.println(
                student.getFullName() +
                        "\n\tpower:\t" + student.getPower() +
                        "\n\ttransgression distance:\t" + student.getTransgressionDistance() +

                        "\n\tdiligence\t" + student.getDiligence() +
                        "\n\tloyalty\t" + student.getLoyalty() +
                        "\n\thonesty\t" + student.getHonesty()
        );
        System.out.println();
    }

    public void print(Ravenclaw student) {
        System.out.println(
                student.getFullName() +
                        "\n\tpower:\t" + student.getPower() +
                        "\n\ttransgression distance:\t" + student.getTransgressionDistance() +

                        "\n\tintelligence\t" + student.getIntelligence() +
                        "\n\twisdom\t" + student.getWisdom() +
                        "\n\twit\t" + student.getWit() +
                        "\n\tcreativity\t" + student.getCreativity()
        );
        System.out.println();
    }

    public void print(Slytherin student) {
        System.out.println(
                student.getFullName() +
                        "\n\tpower:\t" + student.getPower() +
                        "\n\ttransgression distance:\t" + student.getTransgressionDistance() +

                        "\n\tcunning:\t" + student.getCunning() +
                        "\n\tdetermined:\t" + student.getDetermined() +
                        "\n\tambition:\t" + student.getAmbition() +
                        "\n\tresourceful:\t" + student.getResourceful() +
                        "\n\tthirst for power:\t" + student.getThirstRorPower()
        );
        System.out.println();
    }

    public void compare (Gryffindor leftStudent, Gryffindor rightStudent) {
        System.out.println(
                leftStudent.getFullName() + " vs " + rightStudent.getFullName() + ":" +
                        "\n\tpower: "         + ( leftStudent.getPower() > rightStudent.getPower() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\ttransgression distance: " + ( leftStudent.getTransgressionDistance() > rightStudent.getTransgressionDistance() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +

                        "\n\tnobility: "      + ( leftStudent.getNobility() > rightStudent.getNobility() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\thonour: "        + ( leftStudent.getHonour() > rightStudent.getHonour() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tbravery: "       + ( leftStudent.getBravery() > rightStudent.getBravery() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better"
        );
        System.out.println();
    }

    public void compare (Hufflepuff leftStudent, Hufflepuff rightStudent) {
        System.out.println(
                leftStudent.getFullName() + " vs " + rightStudent.getFullName() + ":" +
                        "\n\tpower: "         + ( leftStudent.getPower() > rightStudent.getPower() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\ttransgression distance: " + ( leftStudent.getTransgressionDistance() > rightStudent.getTransgressionDistance() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +

                        "\n\tdiligence: "      + ( leftStudent.getDiligence() > rightStudent.getDiligence() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tloyalty: "        + ( leftStudent.getLoyalty() > rightStudent.getLoyalty() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\thonesty: "       + ( leftStudent.getHonesty() > rightStudent.getHonesty() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better"
        );
        System.out.println();
    }

    public void compare (Ravenclaw leftStudent, Ravenclaw rightStudent) {
        System.out.println(
                leftStudent.getFullName() + " vs " + rightStudent.getFullName() + ":" +
                        "\n\tpower: "         + ( leftStudent.getPower() > rightStudent.getPower() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\ttransgression distance: " + ( leftStudent.getTransgressionDistance() > rightStudent.getTransgressionDistance() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +

                        "\n\tintelligence: "      + ( leftStudent.getIntelligence() > rightStudent.getIntelligence() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\twisdom: "        + ( leftStudent.getWisdom() > rightStudent.getWisdom() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\twit: "       + ( leftStudent.getWit() > rightStudent.getWit() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tcreativity: "       + ( leftStudent.getCreativity() > rightStudent.getCreativity() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better"
        );
        System.out.println();
    }

    public void compare (Slytherin leftStudent, Slytherin rightStudent) {
        System.out.println(
                leftStudent.getFullName() + " vs " + rightStudent.getFullName() + ":" +
                        "\n\tpower: "         + ( leftStudent.getPower() > rightStudent.getPower() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\ttransgression distance: " + ( leftStudent.getTransgressionDistance() > rightStudent.getTransgressionDistance() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +

                        "\n\tcunning: "      + ( leftStudent.getCunning() > rightStudent.getCunning() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tdetermination: "        + ( leftStudent.getDetermined() > rightStudent.getDetermined() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tambition: "       + ( leftStudent.getAmbition() > rightStudent.getAmbition() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tresourceful: "       + ( leftStudent.getResourceful() > rightStudent.getResourceful() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better" +
                        "\n\tthirst for power: "       + ( leftStudent.getThirstRorPower() > rightStudent.getThirstRorPower() ? leftStudent.getFullName() : rightStudent.getFullName() ) + " is better"
        );
        System.out.println();
    }

    public void compare (Hogwarts leftStudent, Hogwarts rightStudent) {
        System.out.println(
                leftStudent.getFullName() + " vs " + rightStudent.getFullName() + ":" +
                        "\n\tpower: " + (leftStudent.getPower() > rightStudent.getPower() ? leftStudent.getFullName() : rightStudent.getFullName()) + " is better" +
                        "\n\ttransgression distance: " + (leftStudent.getTransgressionDistance() > rightStudent.getTransgressionDistance() ? leftStudent.getFullName() : rightStudent.getFullName()) + " is better"
        );
        System.out.println();
    }
}