/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

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

        //Llamamos al método A de todos los objetos
        boolean resultado1 = cosa1.comestible();
        System.out.println("¿La comida es comestible?" + resultado1);
        boolean resultado2 = cosa2.comestible();
        System.out.println("¿La comida es comestible?" + resultado2);
        boolean resultado3 = cosa3.comestible();
        System.out.println("¿La comida es comestible?" + resultado3);
        boolean resultado4 = cosa4.comestible();
        System.out.println("¿La comida es comestible?" + resultado4);
        boolean resultado5 = cosa5.comestible();
        System.out.println("¿La comida es comestible?" + resultado5);
        boolean resultado6 = cosa6.comestible();
        System.out.println("¿La comida es comestible?" + resultado6);
        boolean resultado7 = cosa7.comestible();
        System.out.println("¿La comida es comestible?" + resultado7);
        boolean resultado8 = cosa8.comestible();
        System.out.println("¿La comida es comestible?" + resultado8);

        //Método del b
        boolean coso = cosa3.tieneChorizo();
        System.out.println("¿El potaje tiene chorizo?" + coso);

        //Método del c
        int prueba = cosa6.temperatura(300);
        System.out.println("¿Las abichuelas tienen chorizo? " + prueba);
        
        //Método del d
        int cosa= cosa7.kilosTotales(300);
        System.out.println("Kilos totales: " + cosa);

        ArrayList<Comida> array1 = new ArrayList<>();
        array1.add(cosa1);
        array1.add(cosa2);
        System.out.println(array1);
        array1.contains(cosa2);
        System.out.println(array1);
        array1.remove(cosa2);

        ArrayList<Potaje> array2 = new ArrayList<>();
        array2.add(cosa3);
        array2.add(cosa4);
        System.out.println(array2);
        array2.add(cosa4);
        System.out.println(array2);
        array2.remove(cosa3);

        ArrayList<Abichuelas> array3 = new ArrayList<>();
        array3.add(cosa5);
        array3.add(cosa6);
        System.out.println(array3);
        array3.contains(cosa6);
        System.out.println(array3);
        array3.remove(cosa6);

        ArrayList<Comida> array4 = new ArrayList<>();
        array1.add(cosa7);
        array1.add(cosa8);
        System.out.println(array4);
        array4.contains(cosa8);
        System.out.println(array4);
        array4.remove(cosa8);

    }
}
