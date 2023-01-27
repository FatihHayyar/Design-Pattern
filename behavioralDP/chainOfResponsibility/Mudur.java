package behavioralDP.chainOfResponsibility;

public class Mudur extends Approver{
    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<500&&amount>99){
            System.out.println("mudur approval");
        }else if(chief!=null){
            System.out.println("unlimited. go to shief");
            return chief.approveLoan(amount);
        }
     return  false;
    }
}
