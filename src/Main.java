public class Main {

    public static void main(String[] args) {
	// write your code here
    Circle circle1 = new Circle(88);
    System.out.println("First created circle radius is: " + circle1.getRadius());

    circle1.setRadius(69);
    System.out.println("Updated circle radius is: " + circle1.getRadius());

    System.out.println("Circle area is: " + circle1.getArea());
    System.out.println("Circle circumference is: " + circle1.getCircumference());
    }
}
