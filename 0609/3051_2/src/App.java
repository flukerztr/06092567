public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle("RED", 12);
        System.out.println("Color : "+circle.getColor());
        System.err.println("Radius : "+circle.getRadius());
        System.err.println("Area :"+circle.area());

        Rectangle rectangle = new Rectangle("GREY", 12, 15);
        System.out.println("Color :"+rectangle.getColor());
        System.err.println("Width :"+rectangle.getWidth());
        System.err.println("Height :"+rectangle.getHeight());
        System.err.println("Area :"+rectangle.area());
    }
}
