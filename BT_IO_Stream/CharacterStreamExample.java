import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class CharacterStreamExample {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("src/input.txt");
			FileWriter fw = new FileWriter("src/output.txt")){
			
			int data;
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			System.out.println("Ghi file thành công!");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
