package task1;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
        cats.sort((cat1,cat2) -> cat1.getBreed().compareTo(cat2.getBreed()));
        Collections.sort(cats, Comparator
                .comparing(Cat::getName)
                .thenComparing(Cat::getAge));
        cats.removeIf((cat) -> cat.getColor() == Cat.Color.GINGER);
        cats.removeIf((cat -> cat.getName().length() == 5));
    }

}
