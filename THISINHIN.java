
import java.io.BufferedWriter;
import java.io.FileWriter;

public class THISINHIN {

    public static void main(String[] args) {
        String txt = "2\n" +
"KV2A002\n" +
"Hoang Thanh Tuan\n" +
"5\n" +
"6\n" +
"5\n" +
"KV3B123\n" +
"Ly Thi Thu Ha\n" +
"8\n" +
"6.5\n" +
"7\n" +
"1";
        try {
            FileWriter fw = new FileWriter("THISINH.in");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
//2
//Nguyen  hong ngat
//22
//Kinh
//1
//  Chu thi MINh
//14
//Dao
//3
