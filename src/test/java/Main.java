public class Main {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(13, 3, 8);
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(12, 8);
        Circle circle = new Circle(4);


        String figureType = "rectangle";

        switch (figureType){
            case "triangle":
                System.out.println(triangle.Area());
                System.out.println(triangle.Perimetr());
                break;
            case "square":
                System.out.println(square.Area());
                System.out.println(square.Perimetr());
                break;
            case "rectangle":
                System.out.println(rectangle.Area());
                System.out.println(rectangle.Perimetr());
                break;
            case "circle":
                System.out.println(circle.Area());
                System.out.println(circle.Perimetr());
                break;
                default:
                    throw new Exception("Incorrect figure");
        }
    }
}
