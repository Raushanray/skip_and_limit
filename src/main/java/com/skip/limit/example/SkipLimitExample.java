package com.skip.limit.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().skip(1).limit(7).forEach(System.out::print);

        System.out.println("\n" + "=====================================================");

//this is a first way
        List<String> fileData = Files.readAllLines(Paths.get("data.txt"));
        //here print all the header and footer
        fileData.forEach(System.out::println);

        System.out.println("\n" + "=====================================================");


        //now apply the skip and limit methods
        //here the limit is fixed because we have a small amount of data
        fileData.stream().skip(1).limit(4).forEach(System.out::println);

        System.out.println("======================================================");

        //here limit value is using the size of the data.
//        System.out.println(fileData.size());
        fileData.stream().skip(1).limit(fileData.size() - 2).forEach(System.out::println);


//this is the 2nd way
//        Path filePath = Paths.get("data.txt");
//
//        if (Files.exists(filePath)) {
//            try {
//                List<String> fileData = Files.readAllLines(filePath, StandardCharsets.UTF_8);
//                for (String line : fileData) {
//                    System.out.println(line);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("The file data.txt does not exist.");
//        }

    }
}
