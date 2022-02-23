//4. Use Runnable interface to start a new thread and print numbers from 10 to 100
package lambdaExpression;

public class RunnableInter {
    public static void main(String[] args) {

        System.out.println("Without using lambda expression");
        Runnable r=new myRunnable();
        Thread t=new Thread(r);
        t.start();

        System.out.println("\nUsing lambda expression");
        Runnable r1 = ()-> {
            for(int i=10;i<=100;i++){
                System.out.println(i);
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}

class myRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=10;i<=100;i++){
            System.out.println(i);
        }
    }
}