package Exam.com;
//..............................Implements
public class Tamil implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(+i+". Tamil");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
//..............................Extend
//public class Tamil extends Thread {
//    public void run(){
//        for(int i=1;i<=5;i++){
//            System.out.println(+i+". Tamil");
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//
//            }
//        }
//    }
//}
