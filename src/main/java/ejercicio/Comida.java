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
public class Comida {

    private boolean comestible;//true sí, false no
    private boolean sabor;//salado true, dulce false
    private String ingredientes;

    public Comida() {
    }

    public Comida(boolean comestible, boolean sabor, String ingredientes) {
        this.comestible = comestible;
        this.sabor = sabor;
        this.ingredientes = ingredientes;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    public boolean isSabor() {
        return sabor;
    }

    public void setSabor(boolean sabor) {
        this.sabor = sabor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.comestible ? 1 : 0);
        hash = 53 * hash + (this.sabor ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.ingredientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comida other = (Comida) obj;
        if (this.comestible != other.comestible) {
            return false;
        }
        if (this.sabor != other.sabor) {
            return false;
        }
        if (!Objects.equals(this.ingredientes, other.ingredientes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comida{" + "comestible=" + comestible + ", sabor=" + sabor + ", ingredientes=" + ingredientes + '}';
    }

    public boolean comestible() {
        boolean resultado;
        if (comestible == true) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

}
