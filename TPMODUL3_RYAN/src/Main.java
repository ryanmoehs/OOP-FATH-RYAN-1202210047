import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int custID, orderQty;

        try {
            System.out.print("Enter Costumer ID : ");
            custID = input.nextInt();
            System.out.print("Enter how much food to made : ");
            orderQty = input.nextInt();
            input.close();
            
            Thread t1 = new Thread(resto);
            Waiters waiter = new Waiters(orderQty, custID);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Input must be integer"); 
        }
    }
}
