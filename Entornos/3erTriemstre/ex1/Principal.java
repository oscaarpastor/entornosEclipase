package ex1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Profesor profe = new Profesor("Vicent", 21, "695263711", new ArrayList<>());

        profe.printInformacionPersonal();

        profe.printListaPrestamos();
    }
}

