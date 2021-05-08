package threads;

class thread extends Thread{
    int factorial;
    public thread(int factorial){
        this.factorial=factorial;

    }

    @Override
    public void run() {
        int fact=1;
        for(int i=1;i<=factorial;i++){
            fact*=i;
            try{

                sleep((int)(Math.random()*1000));
            }
            catch (InterruptedException e){

                e.getStackTrace();
            }

        }
        System.out.println("factorial = "+fact);
    }
}



public class Main {

    public static void main(String[] args) {

     new thread(6).start();
     new thread(5).start();
     new thread(3).start();


    }
}
