package structuralDP.compositDP;

import java.util.Arrays;

public class CompozitRunner {
    public static void main(String[] args) {
   CompozitRunner runner=new CompozitRunner();
   runner.compozitedemo();


    }
    public void compozitedemo(){
        Department finanz=new Finans();
        Department sales=new Sales();
        Department arge=new Arge();
        RegionalDepartment department=new RegionalDepartment(Arrays.asList(finanz,sales,arge));
        System.out.println(department.getName());
        System.out.println(department.getEmplooyes());
    }
}
