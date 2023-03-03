package ParallelAndConcurrentProgramming;

public class FindNumbers {
    public void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        } ;

        Thread firstThread = new Thread(runnable1);
        /*{
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        });

         */

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 14300; i < 17800; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
            }
        }

        });
        firstThread.start();
        secondThread.start();
    }
}




     /*   @Override
    public void run(){

        for (int i = 1000; i < 2000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
        thread1.start();

  */
