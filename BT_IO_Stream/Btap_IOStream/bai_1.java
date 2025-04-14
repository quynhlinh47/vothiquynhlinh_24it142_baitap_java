package Btap_IOStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//Viết chương trình sử dụng FileInputStream và FileOutPutStream để đọc nội dung từ 1 file văn bản và ghi nó vào 1 file khác
public class bai_1 {
	public static void main(String[] args) {
	
	try(FileInputStream fi = new FileInputStream("src/input.txt");
		FileOutputStream fo = new FileOutputStream("src/output.txt")){
	
		int data;
		while((data = fi.read()) != -1) {
			fo.write(data);
		}
		System.out.println("File được ghi thành công!!!");
	} catch(IOException e) {
		e.printStackTrace();
	}
  }
}
