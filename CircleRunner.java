public class CircleRunner {
    public static void main(String[] args){
        Circle circle = new Circle(1.0);
        System.out.println(circle.getInfo());
        circle.setRadius(10.0);
        System.out.println((circle.getInfo()));
    }
}
