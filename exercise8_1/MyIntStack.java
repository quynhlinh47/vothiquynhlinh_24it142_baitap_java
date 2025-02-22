package exercise8_1;

public class MyIntStack {
    private int[] contents;
    private int tos; 

    // Constructor với dung lượng ban đầu
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    // Thêm phần tử vào stack
    public boolean push(int element) {
        if (isFull()) {
            expandCapacity(); // Mở rộng dung lượng nếu đầy
        }
        contents[++tos] = element;
        return true;
    }

    // Lấy phần tử trên cùng và xóa khỏi stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    // Xem phần tử trên cùng mà không xóa
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos];
    }

    // Kiểm tra stack có rỗng không
    public boolean isEmpty() {
        return tos < 0;
    }

    // Kiểm tra stack có đầy không
    public boolean isFull() {
        return tos == contents.length - 1;
    }

    // Mở rộng dung lượng của stack khi đầy
    private void expandCapacity() {
        int newCapacity = contents.length * 2; // Nhân đôi dung lượng
        int[] newContents = new int[newCapacity];
        System.arraycopy(contents, 0, newContents, 0, contents.length);
        contents = newContents;
        System.out.println("Stack capacity expanded to " + newCapacity);
    }
}


