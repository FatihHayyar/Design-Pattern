package behavioralDP.chainOfResponsibility;

public class GenelMudur extends Approver{
    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount>499){
            System.out.println("genelmudur approval");
        }

        return true;
    }
}
