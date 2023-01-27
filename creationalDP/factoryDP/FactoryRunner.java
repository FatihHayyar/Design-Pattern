package creationalDP.factoryDP;

public class FactoryRunner {
    public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    shapeFactory.getShape("Square").draw();
    shapeFactory.getShape("Triangle").draw();
    shapeFactory.getShape("Circle").draw();
    }
}
