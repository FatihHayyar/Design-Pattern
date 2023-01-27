package structuralDP.compositDP;

import java.util.Arrays;
import java.util.List;

public class Finans extends Department{
    @Override
    String getName() {
        return "finans";
    }

    @Override
    List<String> getEmplooyes() {
        return Arrays.asList("f1", "f2", "f3");
    }
}
