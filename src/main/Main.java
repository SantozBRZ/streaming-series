package main;

import utils.Input;

public class Main { static void main(String[] args) {

    Series s1 = new Series("Mentalista", "Netflix");
    Series s2 = new Series(Input.stGui("informe o nome da série: "));

    System.out.println(s1.toString());
    System.out.println(s2.toString());

    }
}
