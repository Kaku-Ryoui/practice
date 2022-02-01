import java.io.FileWriter;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
    	System.out.println("テストスタート");
        // FileWriterクラスのオブジェクトを生成する
        try(FileWriter filewriter = new FileWriter("C:\\Users\\KK\\test.txt");){
        	filewriter.write("2/1test");
        }catch(IOException e){
        }
    	System.out.println("テスト終了");
    }
}