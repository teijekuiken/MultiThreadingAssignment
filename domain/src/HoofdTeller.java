public class HoofdTeller implements MainCounter {

    public int total;

    public int getTotal() {
        return total;
    }

    @Override
    public synchronized void addCount() {
        total += 1;
        System.out.println(Thread.currentThread().getName());
    }
}
