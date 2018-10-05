public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
    }

    public void display(){
        if(this.getDiscriminant()<0){
            System.out.printf("The equation has no real roots");
        }else if(this.getDiscriminant()==0){
            System.out.printf("The equation has one root %f",(-this.getB()/2*this.getA()));
        }else if(this.getDiscriminant()>0){
            System.out.printf("The equation has two roots %f and %f", this.getRoot1(),this.getRoot2());
        }
    }


}
