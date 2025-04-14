package Btap_IOStream;
//Viết chương trình sử dụng BufferedReader để đọc một file văn bản và đếm số dòng trong 1 file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai_3 {
	public static void main(String[] args) {
		try(BufferedReader br  = new BufferedReader(new FileReader("src/input.txt"))){
			int count = 0;
			while(br.readLine() != null) {
				count ++;
			}
			System.out.println("Số dòng trong file: "+ count);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
