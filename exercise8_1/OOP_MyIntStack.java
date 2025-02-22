package exercise8_1;

public class OOP_MyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        // Đẩy phần tử vào stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }

        // Xem phần tử trên cùng
        System.out.println("Top element: " + stack.peek());

        // Lấy phần tử ra khỏi stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Kiểm tra stack rỗng
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


