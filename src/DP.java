import java.io.*;

/**
 * Created by lei.chen on 5/4/2015.
 */
public class DP {

    public static void main(String[] args) {
        int counter =0;
        try {
//读取本地文件
            BufferedReader bufferedReader = new BufferedReader(new FileReader("doc/aix.txt"));
//D盘创建txt文件
            File t = new File("d:\\abcd.txt");
            FileWriter fi=null;
//指定fi将数据写入t（d：\\abcd.txt）的文件
            fi = new FileWriter(t);
            String line;
            String lines[];
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
//每一行数据以空格分割，会按照数组下标依次装入数组
                lines = line.split(" ");
//打印分割后的数据，按数字下标打印不同列的数据
                System.out.println(lines[15]);
//执行写入操作
                fi.write(lines[15]+"\r\n");
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
