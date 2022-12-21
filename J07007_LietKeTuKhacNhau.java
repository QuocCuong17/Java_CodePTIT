
import java.io.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
class WordSet{
    Set<String> se;
    public WordSet(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        se = new TreeSet<>();
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String s="";
        for(String x:se){
            s+=x+"\n";
        }
        return s;
    }
}
public class Test {

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main739793(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

