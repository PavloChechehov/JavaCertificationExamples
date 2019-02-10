//package quizful.javaMiddleLevel;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Test implements Runnable {
//    public static void main(String[] args) {
//        //Test.this can't be referenced from static conte
//        Thread t = new Thread(this);
//        try {
//            t.start();
//        } catch (IOException ioe) {
//            System.out.println("IOException");
//        }
//    }
//
//    public void run() throws IOException {
//        File f = new File("file.txt");
//        FileWriter fw = new FileWriter(f);
//    }
//}
