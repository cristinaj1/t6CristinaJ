/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Objects;

/**
 *
 * @author Cris
 */
public final class Lentejas extends Potaje {

    private String ingredientes;
    private boolean patatas;
    private int kilosLentejas;
    private double temperatura;
    private boolean chorizo;//true tiene, false no.

    public Lentejas() {
    }

    public Lentejas(String ingredientes, boolean patatas, int kilosLentejas, double temperatura) {
        this.ingredientes = ingredientes;
        this.patatas = patatas;
        this.kilosLentejas = kilosLentejas;
        this.temperatura = temperatura;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isPatatas() {
        return patatas;
    }

    public void setPatatas(boolean patatas) {
        this.patatas = patatas;
    }

    public int getKilosLentejas() {
        return kilosLentejas;
    }

    public void setKilosLentejas(int kilosLentejas) {
        this.kilosLentejas = kilosLentejas;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.ingredientes);
        hash = 43 * hash + (this.patatas ? 1 : 0);
        hash = 43 * hash + this.kilosLentejas;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.temperatura) ^ (Double.doubleToLongBits(this.temperatura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Lentejas other = (Lentejas) obj;
        if (this.patatas != other.patatas) {
            return false;
        }
        if (this.kilosLentejas != other.kilosLentejas) {
            return false;
        }
        if (Double.doubleToLongBits(this.temperatura) != Double.doubleToLongBits(other.temperatura)) {
            return false;
        }
        if (!Objects.equals(this.ingredientes, other.ingredientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Lentejas{" + "ingredientes=" + ingredientes + ", patatas=" + patatas + ", kilosLentejas=" + kilosLentejas + ", temperatura=" + temperatura + '}';
    }

    @Override
    public boolean comestible() {
        boolean resultado;
        if (patatas == true) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public boolean tieneChorizo() {
        boolean resultado;
        if (chorizo == true) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public int kilosTotales(int kilosNecesarios) {
        return kilosNecesarios += kilosLentejas;
    }
}
