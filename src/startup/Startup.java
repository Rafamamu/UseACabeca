package startup;

import java.util.ArrayList;

public class Startup {

   private ArrayList<String> locationsCells;
   private String name;


    public void setLocationsCells(ArrayList<String> loc) {
        locationsCells = loc;

    }

    public void setName(String n) {
        this.name = n;
    }

    public String checkYourself(String userImput) {

        String result = "miss";

        int index = locationsCells.indexOf(userImput);

        if (index >= 0) {
            locationsCells.remove(index);

            if (locationsCells.isEmpty()) {
                result = "KIll";
            } else {
                result = "hit";
            }

        }
        return result;

    }

}
