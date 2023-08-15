package view;

import controller.FatorialDuploController;

public class Main {
    public static void main(String[] args) {

        FatorialDuploController fd = new FatorialDuploController();

        int resultado = fd.fatorialDuplo(5);

        System.out.println(resultado);
    }
}