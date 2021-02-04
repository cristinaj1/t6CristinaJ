/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Cris
 */
public class Prueba {

    public static void main(String[] args) {
        Comida cosa1 = new Comida(true, true, "patata, pimiento, cebolla, etc");
        Comida cosa2 = new Comida(false, false, "patata, pimiento, cebolla, etc");
        Potaje cosa3 = new Potaje("patata, pimiento, cebolla, etc", true, true, 3, 3.0);
        Potaje cosa4 = new Potaje("patata, pimiento, cebolla, etc", false, true, 10, 5);
        Abichuelas cosa5 = new Abichuelas("patata, pimiento, cebolla, etc", 40, 5, true, 7);
        Abichuelas cosa6 = new Abichuelas("patata, pimiento, cebolla, etc", 40, 3, true, 5);
        Lentejas cosa7 = new Lentejas("patata, pimiento, cebolla, etc", true, 1, 43);
        Lentejas cosa8 = new Lentejas("patata, pimiento, cebolla, etc", false, 2, 56);
    }
}
