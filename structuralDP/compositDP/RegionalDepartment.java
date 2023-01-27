package structuralDP.compositDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    List<Department> departments;

    public RegionalDepartment(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    String getName() {
        return departments.stream().map(Department::getName).collect(Collectors.joining(","));
    }

    @Override
    List<String> getEmplooyes() {
        return departments.stream().flatMap(t->t.getEmplooyes().stream()).collect(Collectors.toList());
    }
}
