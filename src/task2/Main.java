package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var cats = new ArrayList<ActiveCat>();
        Actionable action1 = () -> "я прыгаю!";
        Actionable action2 = () -> "я сплю!";
        Actionable action3 = () -> "я кушаю!";
        Actionable action4 = () -> "я бегаю!";
        Actionable action5 = () -> "я в туалете!";


        cats.add(new ActiveCat(action1));
        cats.add(new ActiveCat(action2));
        cats.add(new ActiveCat(action3));
        cats.add(new ActiveCat(action4));
        cats.add(new ActiveCat(action5));

        cats.forEach(ActiveCat::doAction);
    }

}
