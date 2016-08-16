package com.kangfoo.csv;

import java.io.*;

/**
 * Created by kangfoo on 2016/8/15.
 */
public class TestRead {

    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter(new File("E:\\work\\study\\opengl-study\\src\\test\\resources\\data\\insert_2.csv")));

            BufferedReader reader = new BufferedReader(new FileReader("E:\\work\\study\\opengl-study\\src\\test\\resources\\data\\INSERET.csv"));//��������ļ���
            String line = null;

            int x=0, y ;

            while((line=reader.readLine())!=null){
                String item[] = line.split("\t");//CSV��ʽ�ļ�Ϊ���ŷָ����ļ���������ݶ����з�

                for (y=0 ; y<item.length; y++){
                    String s = new String("%s,%s,%s");
                    s = String.format(s, x +"", y+"", item[y]);
                    System.out.println(s);

                    writer.write(s);
                    writer.newLine();
                }
                x ++;
            }
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
