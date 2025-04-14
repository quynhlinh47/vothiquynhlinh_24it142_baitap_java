import java.io.*;

public class Example {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeInt(100);
            dos.writeDouble(9.5);
            dos.writeBoolean(true);
            System.out.println("Ghi dữ liệu thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println("Số nguyên: " + dis.readInt());
            System.out.println("Số thực: " + dis.readDouble());
            System.out.println("Boolean: " + dis.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
