import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// ghi du lieu nhap tu ban phim vao file 
public class example_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("src/output.txt");

			for(;;) {
				System.out.println("Insert line into file: ");
				String line = sc.nextLine() + "\n";
				
				byte[] bytes = line.getBytes();
				fos.write(bytes);
				
				System.out.println("Y/N: ");
				String choice = sc.nextLine();
				if(choice.equalsIgnoreCase("N")) {
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
