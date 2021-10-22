import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("test");
        try {
        	File file = new File("C:\\Users\\KK\\test.txt");//これだけだとfileは作成されない
        	FileWriter filewriter = new FileWriter(file);
        	filewriter.write("Hello！Hello！Hello！Hello！Hello！Hello！Hello！Hello！");
        	
        	filewriter.close();
        }catch(IOException e){
        	System.out.println(e);
        }
        
    }
}
