class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
        }
    public double add(double n1, double n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}


public class Java_Method_Overloading {
    public static void main(String [] args){
        Calculator cals = new Calculator();
        System.out.println(cals.add(10,20));
        System.out.println(cals.add(22.3,45.7));
        System.out.println(cals.add(11,22,44));
    }
}
