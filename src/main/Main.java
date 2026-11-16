package main;

import utils.Input;

public class Main {
    static void main(String[] args) {

        //serie 1
        Series s1 = new Series(Input.stGui("informe o nome da serie: "), Input.stGui("informe a plataforma: "));
        if (!s1.setNota(Input.dbGui("avalie a serie: "))) {
            System.out.println("nota invalida!");
        }

        //serie 2
        Series s2 = new Series(Input.stGui("nome da serie: "));

        if (!s2.setNota(Input.dbGui("avalie a serie: "))) {
            System.out.println("nota invalida!");
        }

        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }
}
