package creationalDP.abstractFactoryDP;

import java.awt.*;

public class runner {
    public static void main(String[] args) {
        AbstracrFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 =shapeFactory.getShape("Circle");
        shape1.draw();

        AbstracrFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Collor color1 = colorFactory.getCollor("RED");
        color1.fiel();
    }
}
