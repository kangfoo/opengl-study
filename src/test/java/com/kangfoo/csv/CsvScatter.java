package com.kangfoo.csv;

import org.jzy3d.maths.Coord3d;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangfoo on 2016/8/15.
 */
public class CsvScatter {

    public static List<Coord3d> getScatter(String filePath){
        List<Coord3d> list = new ArrayList<Coord3d>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = null;

            while((line=reader.readLine())!=null){
                String item[] = line.split(",");
                Coord3d coord3d = new Coord3d(Float.valueOf(item[0]), Float.valueOf(item[1]), Float.valueOf(item[2]));
//                System.out.println(coord3d);
                list.add(coord3d);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }

    public static void main(String[] args) {
        extract();
//        CsvScatter.getScatter("E:\\work\\study\\opengl-study\\src\\test\\resources\\data\\insert_2.csv");
    }

    private static void extract() {
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter(new File("E:\\work\\study\\opengl-study\\src\\test\\resources\\data\\insert_2.csv")));
            BufferedReader reader = new BufferedReader(new FileReader("E:\\work\\study\\opengl-study\\src\\test\\resources\\data\\INSERET.csv"));//换成你的文件名
            String line = null;

            int x=0, y ;
            while((line=reader.readLine())!=null){
                String item[] = line.split("\t");//CSV格式文件为逗号分隔符文件，这里根据逗号切分

                for (y=0 ; y<item.length; y++){
                    String s = new String("%s,%s,%s");
                    s = String.format(s, y +"", x+"", item[y]);
                    System.out.println(s);

                    writer.write(s);
                    writer.newLine();
                }
                x ++;
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
