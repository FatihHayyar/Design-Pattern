package structuralDP.decoratorDP;

public class IPhone11 extends PhoneDecorator{
    public IPhone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" 11";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1500;
    }
}
