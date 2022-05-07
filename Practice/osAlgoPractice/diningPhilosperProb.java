package osAlgoPractice;

import java.util.Random;
import java.util.Scanner;

public class diningPhilosperProb {
    
    Philosopher[] philosopher;
    Fork[] forks;
    Thread[] threads;

    Scanner scan;
    int num;

    public static void main(String[] args) {
        
        diningPhilosperProb dpp = new diningPhilosperProb();
        dpp.init();
        dpp.startThinkingEating();

    }

    public void init(){

        scan = new Scanner(System.in);

        System.out.println("*** ___ Dining Philosophers Problem ___ ***");

        try {
            
            System.out.println("Enter Number of Philosophers : ");
            num = scan.nextInt();

            if(num < 2){
                System.out.println("Number must be greater than 1");
                return;
            }

        } catch (Exception e) {
            System.out.println("Enter a valid Number");
        }

        philosopher = new Philosopher[num];
        forks = new Fork[num];
        threads = new Thread[num];

        for(int i =0; i<num; i++){
            philosopher[i] = new Philosopher(i + 1);
            forks[i] = new Fork(i +1);
        }

    }

    public void startThinkingEating(){

        for (int i = 0; i < num; i++) {
            
            final int index = i;

            threads[i] = new Thread(new Runnable(){
                public void run(){

                    try {
                        
                        philosopher[index].start(forks[index], (index-1 > 0) ? forks[index-1] : forks[num-1]);

                    } catch (Exception e) {
                        //TODO: handle exception
                        e.printStackTrace();
                    }
                }
            });

            threads[i].start();
            
        }
    }

    public class Fork {
    
        private int forkId;
        private boolean status;

        Fork(int forkId){
            this.forkId = forkId;
            this.status = true;
        }

        public synchronized void free() throws InterruptedException{

            status = true;
        }

        public synchronized boolean pick(int philosopherId) throws InterruptedException{

            int counter = 0;
            int waitUntill = new Random().nextInt(10) + 5;

            while(!status){

                Thread.sleep(new Random().nextInt(100) + 50);

                counter++;

                if(counter > waitUntill){

                    return false;
                }
            }

            status = false;

            return true;
        }

    }

    public class Philosopher {
    
        private int philosopherId;
        private Fork left, right;

        public Philosopher(int philosopherId){

            this.philosopherId = philosopherId;
        }

        public void start( Fork left, Fork right) throws InterruptedException{
            
            this.left = left;
            this.right = right;

            while(true){
                if(new Random().nextBoolean()){
                    eat();
                }else{
                    think();
                }
            }
        }

        public void think() throws InterruptedException{

            System.out.println(philosopherId + " : Thinking...");
            Thread.sleep(new Random().nextInt(1000) + 100);
            System.out.println(philosopherId + " : Stopped Thinking!!!");
            
        }

        public void eat() throws InterruptedException{
            
            boolean leftPick = false;
            boolean rightPick = false;

            System.out.println(philosopherId + " : Requesting...");

            System.out.println(philosopherId + " : Picking Fork" + left.forkId);
            leftPick = left.pick(philosopherId);

            if(!leftPick){
                return;
            }

            System.out.println(philosopherId + " : Picking Fork" + right.forkId);
            rightPick = right.pick(philosopherId);

            if(!rightPick){
                left.free();
                return;
            }

            System.out.println(philosopherId + " : Eating (o_o)");

            Thread.sleep(new Random().nextInt(1000) + 100);

            left.free();
            right.free();

            System.out.println(philosopherId + " : Eating Stopped!!!");
            
        }


    }
}
