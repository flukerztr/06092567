public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car("Toyota", 2002);
        myCar.displayInfo();

        myCar.setBrand("Honda");
        myCar.setYear(1999);

        myCar.displayInfo();
    }
}
