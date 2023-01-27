package behavioralDP.chainOfResponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        ChainOfResponsibility responsibility=new ChainOfResponsibility();
        responsibility.chain();

    }
    void  chain(){
        Approver gMudur=new GenelMudur();
        Approver mudur=new Mudur(gMudur);
        Approver memur=new Memur(mudur);

        memur.approveLoan(50);
        System.out.println("-----------");
        memur.approveLoan(450);
        System.out.println("-----------");
        memur.approveLoan(700);
    }

}
