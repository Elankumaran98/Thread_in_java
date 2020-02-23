package Exam.com;
//..............................Implements
public class English implements Runnable{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(+i+". English");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
//..............................Extend
//public class English extends Thread{
//    public void run(){
//        for(int i=6;i<=10;i++){
//            System.out.println(+i+". English");
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//
//            }
//        }
//    }
//}