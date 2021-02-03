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
public final class Abichuelas extends Potaje {

    private String ingredientes;
    private int temperatura;
    private int cantidadPlatos;
    private boolean calidad;//true buena calidad, false mala calidad.
    private boolean chorizo;//true tiene, false no.
    private int horasPreparo;

    public Abichuelas() {
    }

    public Abichuelas(String ingredientes, int temperatura, int cantidadPlatos, boolean calidad, int horasPreparo) {
        this.ingredientes = ingredientes;
        this.temperatura = temperatura;
        this.cantidadPlatos = cantidadPlatos;
        this.calidad = calidad;
        this.horasPreparo = horasPreparo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public void setCantidadPlatos(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }

    public int getHorasPreparo() {
        return horasPreparo;
    }

    public void setHorasPreparo(int horasPreparo) {
        this.horasPreparo = horasPreparo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.ingredientes);
        hash = 23 * hash + this.temperatura;
        hash = 23 * hash + this.cantidadPlatos;
        hash = 23 * hash + (this.calidad ? 1 : 0);
        hash = 23 * hash + this.horasPreparo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Abichuelas other = (Abichuelas) obj;
        if (this.temperatura != other.temperatura) {
            return false;
        }
        if (this.cantidadPlatos != other.cantidadPlatos) {
            return false;
        }
        if (this.calidad != other.calidad) {
            return false;
        }
        if (this.horasPreparo != other.horasPreparo) {
            return false;
        }
        if (!Objects.equals(this.ingredientes, other.ingredientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Abichuelas{" + "ingredientes=" + ingredientes + ", temperatura=" + temperatura + ", cantidadPlatos=" + cantidadPlatos + ", calidad=" + calidad + '}';
    }

    @Override
    public boolean comestible() {
        boolean resultado;
        if (calidad == true) {
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

    public int temperatura(int tiempoTotal) {
        return tiempoTotal += horasPreparo;
    }

}
