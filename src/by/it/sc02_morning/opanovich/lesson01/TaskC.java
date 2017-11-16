package by.it.sc02_morning.opanovich.lesson01;

import java.io.*;

public class TaskC {
    public static void main(String[] args) throws IOException {

        // generate three files
        String root = System.getProperty("user.dir") + "/src/";
        root +="by/it/sc02_morning/opanovich/lesson01/";

        makeFile(root + "1KB.txt", 1<<10);
        makeFile(root + "1MB.txt", 1<<20);
        makeFile(root + "10MB.txt", 10 * 1<<20);

        // read three files
        calculateReadTime(root + "1KB.txt");
        calculateReadTime(root + "1MB.txt");
        calculateReadTime(root + "10MB.txt");
    }

    static void calculateReadTime(String fileName) throws IOException {

        FileReader file = new FileReader(fileName);
        long tBegin = System.nanoTime();	//start
        while (file.read() != -1);
        long tEnd = System.nanoTime();		//end
        file.close();
        System.out.printf("%s first time %d ns\n", fileName, tEnd - tBegin);

        file = new FileReader(fileName);
        tBegin = System.nanoTime();			//start
        while (file.read() != -1);
        tEnd = System.nanoTime();			//end
        file.close();
        System.out.printf("second time %d ns\n\n", tEnd - tBegin);
    }

    static void makeFile(String fileName, int size) throws IOException {

        FileWriter file = new FileWriter(fileName);
        byte[] data = new byte[size];
        for (byte b : data) {
            file.write(b);
        }
        file.flush();
        file.close();
    }
}