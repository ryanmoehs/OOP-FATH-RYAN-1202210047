public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static int foodNumber = 1;
    private static final Object lock = new Object();

    @Override
    public void run() {
        while (true){
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    // setter
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }

    // getter
    public static int getFoodNumber(){
        return foodNumber;
    }

    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try {
                    System.out.println("Restaurant : Waiting for the Waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant : Making food number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : Telling the Waiter to get the food\n");
        }
    }

    public static Object getLock(){
        return lock;
    }
}
