package triangle;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(1,2,3,4,5);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleAArea);
        System.out.println(triangleBArea);
    }
}
