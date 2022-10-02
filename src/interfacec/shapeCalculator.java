package interfacec;

class shapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,10);

        System.out.println(circle.getData());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());

        System.out.println(StringUtils.reverseString("kajak"));
    }



}
