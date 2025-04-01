public class Task3 {

    public static double calculateExpresion (double x, double y) {

        return Math.pow(x, 2) + Math.pow((((4*y)/5)-x),2);
    }
    

    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;
        System.out.println("The result of the expression is: " + calculateExpresion(x, y));
    }
}
