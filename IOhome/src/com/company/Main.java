package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:/Users/eyankiv/Desktop");
        try (OutputStream output = new OutputStream(file) {

        }) {
        }

    }
}
