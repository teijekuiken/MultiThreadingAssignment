import java.time.LocalDateTime;

public class MyRunnable implements Runnable{

    private MainCounter HoofdTeller;

    public MyRunnable(MainCounter hoofdTeller) {
        HoofdTeller = hoofdTeller;
    }

    public synchronized void run(){
        try{
            for(int i=1; i<21; i++){
                HoofdTeller.addCount();
                System.out.println(HoofdTeller.getTotal());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
