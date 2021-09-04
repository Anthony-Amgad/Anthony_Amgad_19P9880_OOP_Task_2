public class Main {
    public static void main(String[] args){

        Tesla tesla1 = new Tesla("X", 250, 100, 1,7);
        Tesla tesla2 = new Tesla("S", 240,110, 1, 5);

        System.out.println('\n' + tesla1.getFuel() + '\n' + tesla2.getFuel());
        System.out.println("The number of Cars created is " + Car.getCount() + ".");
        System.out.println("\n---------------------------------------------------------\n");

        Circle circle = new Circle(3);
        Square square = new Square(5);

        displayShape(circle);
        displayShape(square);
    }

    public static void displayShape(Shape shape){
        System.out.println(shape.getShapeName() + " with Area " + shape.getArea());
    }
}
