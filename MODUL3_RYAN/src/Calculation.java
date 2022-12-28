public class Calculation implements Runnable{
    private double radius, side;
    private static double area;
    private static double phi = 3.14;

    public Calculation(double radius, double side, double area, double phi){
        this.radius = radius;
        this.side = side;
        Calculation.area = area;
        Calculation.phi = phi;

    }

    public void run(){
        try {
            
        } catch (Exception e) {
        }
    }

    // setter square
    public static void double setSquare(double side){
        try{
            if (side < 1){
                throw new IllegalArgumentException("java.lang.IllegalArgumentException");
            } else {
                area = side * side;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    // getter square
    public static double getSquare(){
        return area;
    }

    // setter circle
    public static void double setCircle(double radius){
        try {
            if (radius < 1){
                throw new IllegalArgumentException("java.lang.IllegalArgumentException");
            } else {
                area = phi * radius;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // getter circle
    public static double getCircle(){
        return area;
    }

    // setter trapezoid
    public static void setTrapezoid(double a, double b, double t){
        try{
            if (a < 1){
                throw new IllegalArgumentException("java.lang.IllegalArgumentException");
            } else {
                area = ((a + b) * t) / 2;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static double getTrapezoid(){
        return area;
    }
}
