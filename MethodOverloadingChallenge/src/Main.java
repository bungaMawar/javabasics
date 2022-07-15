public class Main {
    public static void main(String[] args) {
        System.out.println("5ft 3in = " + calcFeetAndInchesToCentimeters(5d,3d) + " cm");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0){
            return -1;
        }
        if(inches < 0 || inches > 12){
            return -1;
        }
        double centimeters = 0;
        inches = inches + (feet * 12);
        centimeters = inches * 2.54;

        return centimeters;
    }
}