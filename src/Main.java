public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        QuadraticEquation q1 = new QuadraticEquation(1.0,3,1);
        QuadraticEquation q2 = new QuadraticEquation(1,2.0,1);
        QuadraticEquation q3 = new QuadraticEquation(1,2,3);

        System.out.print("\nQE1: ");
        q1.display();
        System.out.print("\nQE2: ");
        q2.display();
        System.out.print("\nQE3: ");
        q3.display();
    }

}
