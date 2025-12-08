package simUnit;

import java.util.ArrayList;

public class V3Radiator {

    V3Radiator(ArrayList<SimUnit> lgList) {
        super();
        for (int g = 0; g < 10; g++) {
            lgList.add(new SimUnit("V3Radiator"));
        }
    }
}
