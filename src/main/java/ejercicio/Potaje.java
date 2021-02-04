/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Cris
 */
public class Potaje extends Comida {

    private String ingredientes;
    private boolean chorizo;//true tiene, false no.
    private boolean morcilla;//True tiene, false no.
    private int platos;
    private double litrosDePotaje;
    ArrayList<Potaje> potaje;

    public Potaje() {
    }

    public Potaje(String ingredientes, boolean chorizo, boolean morcilla, int platos, double litrosDePotaje) {
        this.ingredientes = ingredientes;
        this.chorizo = chorizo;
        this.morcilla = morcilla;
        this.platos = platos;
        this.litrosDePotaje = litrosDePotaje;
        potaje = new ArrayList();
    }

    public boolean isChorizo() {
        return chorizo;
    }

    public void setChorizo(boolean chorizo) {
        this.chorizo = chorizo;
    }

    public boolean isMorcilla() {
        return morcilla;
    }

    public void setMorcilla(boolean morcilla) {
        this.morcilla = morcilla;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public double getLitrosDePotaje() {
        return litrosDePotaje;
    }

    public void setLitrosDePotaje(double litrosDePotaje) {
        this.litrosDePotaje = litrosDePotaje;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ingredientes);
        hash = 53 * hash + (this.chorizo ? 1 : 0);
        hash = 53 * hash + (this.morcilla ? 1 : 0);
        hash = 53 * hash + this.platos;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.litrosDePotaje) ^ (Double.doubleToLongBits(this.litrosDePotaje) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Potaje other = (Potaje) obj;
        if (this.chorizo != other.chorizo) {
            return false;
        }
        if (this.morcilla != other.morcilla) {
            return false;
        }
        if (this.platos != other.platos) {
            return false;
        }
        if (Double.doubleToLongBits(this.litrosDePotaje) != Double.doubleToLongBits(other.litrosDePotaje)) {
            return false;
        }
        if (!Objects.equals(this.ingredientes, other.ingredientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return super.toString() + "Potaje{" + "ingredientes=" + ingredientes + ", chorizo=" + chorizo + ", morcilla=" + morcilla + ", platos=" + platos + ", litrosDePotaje=" + litrosDePotaje + '}';
    }

    @Override
    public boolean comestible() {
        boolean resultado;
        if (morcilla == true) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public void anadirPotaje(Potaje a) {
        potaje.add(a);
    }

    public boolean tieneChorizo() {
        boolean resultado;
        if (chorizo == true) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public int platosTotales(int total) {
        return total += platos;
    }

}
