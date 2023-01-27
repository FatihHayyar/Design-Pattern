package creationalDP.abstractFactoryDP;



public class ShapeFactory extends AbstracrFactory {
    @Override
    Collor getCollor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return  new Square();
        }else if(shapeType.equalsIgnoreCase("Triangle")){
            return  new Triangle();
        }
        else return null;
    }

}
