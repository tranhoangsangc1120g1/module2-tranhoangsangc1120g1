package Casestudy.commoms;

import Casestudy.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunReadAndWrite<T> {
    private static final String PATH = "src/Casestudy/data/";

    public void writeFile(String filename, List<T> list, boolean writeMode) {
        File file = new File(PATH + filename);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (T t : list) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    public static List<Villa> readVilla(String fileName){
//        List<Villa> list = new  ArrayList<>();
//        List<String[]> list1=readFile(fileName);
//        for (String[] strings: list1) {
//            Villa villa = new Villa(strings[0],strings[1],)
//                    list.add(villa);
//        }
//        return list;
//    }
    public static List<String[]> readFile(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

}