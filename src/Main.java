import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Triangle triangle= new Triangle();
        triangle.area(6,8,7);
        System.out.println("a: "+triangle.a+"\n"+ "b: "+triangle.b+"\n"+"c: "+triangle.c);
        System.out.println("Area: "+(triangle.a* triangle.b)/2);
    }
}