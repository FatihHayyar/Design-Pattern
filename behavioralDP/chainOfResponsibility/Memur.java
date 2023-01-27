package behavioralDP.chainOfResponsibility;

public class Memur extends Approver{
    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("memur approval");
        }else if(chief!=null){
            System.out.println("unlimited. go to shief");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
