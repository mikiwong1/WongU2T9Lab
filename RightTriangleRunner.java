public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle triangle1 = new RightTriangle(6, 10);
        RightTriangle triangle2 = new RightTriangle(12, 20);

        double hypotenuse1 = triangle1.hypotenuse();
        double hypotenuse2 = triangle2.hypotenuse();

        System.out.println(hypotenuse1 + "\n" + hypotenuse2);
    }
}