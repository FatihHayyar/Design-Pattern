package structuralDP.decoratorDP;

public class Iphone11Pro extends PhoneDecorator{
    public Iphone11Pro(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" 11 Pro";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1500;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+2;
    }
}
