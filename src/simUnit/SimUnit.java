package simUnit;

public class SimUnit {
    String botType;
     static int unitCount = 0;
     int unitNumber;


    SimUnit(String type) {
        this();
        botType = type;
    }
    public SimUnit() {
        unitCount++;
        unitNumber = unitCount;


        System.out.println("New unit # "+ unitNumber +" created ");
    }


    int PowerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }

    }
}
