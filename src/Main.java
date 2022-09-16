public class Main {

    public static void main(String[] args) {

        AnimalThread thread1 = new AnimalThread("Черепаха");
        AnimalThread thread2 = new AnimalThread("Зайчик");

        thread1.start();
        thread2.start();

    }
}
class AnimalThread extends Thread {

    AnimalThread(String name){
        super(name);
    }

    public void run(){

        try {

        for(int i=0;i<1100;i = i + 100){
            System.out.println(Thread.currentThread().getName()+": "+i + " метров");
            if(Thread.currentThread().getName().equalsIgnoreCase("Черепаха") && i == 0){
                Thread.sleep(1000);
            }
            if(Thread.currentThread().getName().equalsIgnoreCase("Зайчик") && i == 600){
                Thread.sleep(1000);
            }
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}