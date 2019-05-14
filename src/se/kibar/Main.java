package se.kibar;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        //main.ovning1();
        //main.ovning2();
        //main.ovning3();
        //StefanAssignments sa = new StefanAssignments();
        //sa.ovning4();

        /*
        //Ett exempel på skillnaden mellan referens och värde
        int stefan = 7;
        //stefan.MAX_VALUE;
        Integer jozef = 7;
        System.out.println(jozef.TYPE);
        */
        String sargon = "5/7";
        char stefan = sargon.charAt(1);
        System.out.println(stefan);
    }

    public void ovning1() {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.println("Vad heter du?");
        name = scanner.nextLine();
        System.out.println("Hej " + name + "!");
        /*
        declared a void method
        declared a variable
        entered input

         */
    }

    public void ovning2() {
        Scanner scanner = new Scanner(System.in);
        double speed = 0;
        double seconds = 0;
        int minutes = 0;

        System.out.print("Vänligen ange hastighet: ");
        speed = scanner.nextDouble();

        System.out.print("Hur många minuter!: ");
        minutes = scanner.nextInt();

        System.out.print("Kan du snälla ange tid i sekunder: ");
        seconds = scanner.nextDouble();

        System.out.println("Du har färdats " + calculateDistance(speed, minutes, seconds) + " meter!");
    }//ovning2

    public double calculateDistance(double speed, int minutes, double seconds) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;
        double answer = 0;

        System.out.println("Vill du ha svaret i 1:m/s eller 2:km/h?");
        input = scanner.nextInt();

        //if (input == 1 || input == 2){
        //      validInput = true;
        //}
        validInput = (input == 1 || input == 2);

        while (!validInput) {
            System.out.println("Ogiltigt val! Vänligen välj 1 eller 2!");
            input = scanner.nextInt();

            validInput = (input == 1 || input == 2);
        }

        if (input == 1) {
            answer = speed * (minutes * 60 + seconds);
        } else {
            answer = (speed * (minutes * 60 + seconds)) / 3.6;
        }

        return answer;
    }//calculateDistance

    public double ovning3() {

        double squareSideLength;
        double circleRadius;
        double triangleBase;
        double triangleHeight;
        double squareArea;
        double circleArea;
        double triangleArea;
        double maxValue;
        String maxString;

        System.out.print("Ange kvadratens sida:");
        squareSideLength = scanner.nextDouble();
        squareArea = squareSideLength*squareSideLength;

        System.out.print("Ange cirkelns radie:");
        circleRadius = scanner.nextDouble();
        circleArea = circleRadius*circleRadius*Math.PI;

        System.out.print("Ange triangelns bas:");
        triangleBase = scanner.nextDouble();

        System.out.println("Ange triangelns höjd:");
        triangleHeight = scanner.nextDouble();
        triangleArea = triangleBase*triangleHeight/2;

        //algoritmförslag 1
        maxValue = triangleArea;
        maxString = "Triangeln är störst";

        if(circleArea > maxValue) {
            maxValue = circleArea;
            maxString = "Cirkeln är störst";
        }
        if(squareArea > maxValue) {
            maxValue = squareArea;
            maxString = "Kvadraten är störst";
        }

        //algoritmförslag 2
        if(triangleArea > circleArea && triangleArea > squareArea) {
            maxValue = triangleArea;
            maxString = "Triangeln är störst";
        }

        if(circleArea > triangleArea && circleArea > squareArea) {
            maxValue = circleArea;
            maxString = "Cirkeln är störst";
        }

        maxValue = squareArea;
        maxString = "Kvadraten är störst";

        System.out.println(maxString+" : "+maxValue);

        return maxValue;
    }


}//Main

