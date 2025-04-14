import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("src/input.txt");
			FileOutputStream fos = new FileOutputStream("src/output.txt")){
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("Ghi file thành công!");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
