package mountain;

import java.util.ArrayList;
import java.util.List;


public class SortMountains {
    public static void main(String[] args) {

        new SortMountains().go();


    }

    public void go() {
List<Mountain> mountains = List.of(
                new Mountain("Longs", 14255),
                new Mountain("Elbert", 14433),
                new Mountain("Maroon", 14156),
                new Mountain("Castle", 14262));


        System.out.println("as entered:\n" + mountains);

        mountains.sort((mount1, mount2) -> mount1.name.compareTo(mount2.name));
        System.out.println("by name:\n " + mountains);

        mountains.sort((mount1, mount2) -> mount2.height - mount1.height);
        System.out.println("by height:\n " + mountains);
    }
}

class Mountain {

    String name;
    int height;


    public Mountain(String name, int height) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", heigth: " + height + ".";
    }

}














