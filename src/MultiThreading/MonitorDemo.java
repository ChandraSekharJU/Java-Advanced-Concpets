package MultiThreading;

public class MonitorDemo {
    public synchronized void printNumbers(){
        for(int i = 0; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }
    }

    public void printNumbersWithoutThreading(){
        for(int i = 0; i < 6; i ++){
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try{
                Thread.sleep(500);
            } catch (Exception e){}        }
    }


    public static void main(String[] args) {
        MonitorDemo obj = new MonitorDemo();
        /*Thread t1 = new Thread(obj::printNumbers);
        System.out.println("T1 is created and is in new state");
        Thread t2 = new Thread(obj::printNumbers);
        System.out.println("T2 is created and is in new state");*/
        Thread t1 = new Thread(obj::printNumbersWithoutThreading);
        System.out.println("T1 is created and is in new state");
        Thread t2 = new Thread(obj::printNumbersWithoutThreading);
        System.out.println("T2 is created and is in new state");
        t1.start();
        System.out.println("T1 is now in Runnable State");
        t2.start();
        System.out.println("T2 is now in Runnable State");
    }
}
