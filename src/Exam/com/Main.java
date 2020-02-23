package Exam.com;

public class Main {
    public static void main(String[] args) {
        //Tamil tamil=new Tamil();
        //English english=new English();

        Runnable tamil=new Tamil();
        Runnable english=new English();

        Runnable obj1=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++){
                    System.out.println(+i+". Tamil");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }
            }
        };
        Runnable obj2=new Runnable() {
            @Override
            public void run() {
                for(int i=6;i<=10;i++){
                    System.out.println(+i+". English");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }
            }
        };
        //Thread t1=new Thread(tamil);
        //Thread t2=new Thread(english);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(100);
        }catch (Exception e){}
        t2.start();
    }
}
