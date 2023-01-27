package structuralDP.compositDP;

import java.util.Arrays;
import java.util.List;

public class Sales extends Department{
    @Override
    String getName() {
        return "sales";
    }

    @Override
    List<String> getEmplooyes() {
        return Arrays.asList("S1", "S2", "S3");
    }
}
