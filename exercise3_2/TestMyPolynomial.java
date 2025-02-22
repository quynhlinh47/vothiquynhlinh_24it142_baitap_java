package exercise3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println("Polynomial p1: " + p1);
        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Evaluate p1 at x = 2: " + p1.evaluate(2));

        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4);
        System.out.println("\nPolynomial p2: " + p2);
        System.out.println("Degree of p2: " + p2.getDegree());
        System.out.println("Evaluate p2 at x = 3: " + p2.evaluate(3));

        MyPolynomial p3 = p1.add(p2);
        System.out.println("\nPolynomial p1 + p2: " + p3);
        System.out.println("Degree of p1 + p2: " + p3.getDegree());
        System.out.println("Evaluate p1 + p2 at x = 1: " + p3.evaluate(1));

        MyPolynomial p4 = p1.multiply(p2);
        System.out.println("\nPolynomial p1 * p2: " + p4);
        System.out.println("Degree of p1 * p2: " + p4.getDegree());
        System.out.println("Evaluate p1 * p2 at x = 1: " + p4.evaluate(1));
    }
}

