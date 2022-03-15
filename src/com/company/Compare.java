package com.company;

public class Compare {

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