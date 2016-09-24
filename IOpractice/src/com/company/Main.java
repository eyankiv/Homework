package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Main {

    static final String path = "C:\\Users\\eyankiv\\Desktop\\javaWeirdFile.txt";

    public static void main(String[] args) {

      /*  OutputStream outputStream =
                null;
        try {
            outputStream = new FileOutputStream(path);
            String s = "Hello World";
            outputStream.write(s.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }*/


    }

    static void createFile(){
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(path);
            byte[] bytes = new byte[4];
            for (int i = 0; i < 10; i++) {
                ByteBuffer.wrap(bytes).putInt(i*2);
                outputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("file created");

    }
}
