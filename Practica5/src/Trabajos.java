package Practicas3erTri.Practica5.Practica5.src;

import java.util.Scanner;

public class Trabajos {
    private int idTrabajo;
    private String descripcion;
    private int nHoras = 0;
    private boolean finalizado;
    private int tipoTrabajo;
    private double costePiezas;

    public Trabajos(int idTrabajo, int tipoTrabajo, String descripcion, int nHoras, boolean finalizado) {
        this.idTrabajo = idTrabajo;
        this.tipoTrabajo = tipoTrabajo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
        this.finalizado = false;
    }

    public int getTipoTrabajo() {
        return tipoTrabajo;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public double getCostePiezas() {
        return costePiezas;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public void setTipoTrabajo(int tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setnHoras(int nHoras) {
        this.nHoras += nHoras;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public void setCostePiezas(Double costePiezas) {
        this.costePiezas += costePiezas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id: " + idTrabajo + ", Tipo de trabajo: " + tipoTrabajo + ", Descripcion: " + descripcion
                + ", Num horas: " + nHoras + ", Finalizado: " + finalizado+", Coste trabajo: "+calculoTrabajo();
    }

    public double calculoTrabajo() {
        switch (tipoTrabajo) {
            case 1:
                return nHoras * 30 + costePiezas * 1.1;
            case 2:
                return nHoras * 30 + costePiezas * 1.3;
            
            case 3:
                return nHoras * 30 + 20;

            default:
                return 0;
        }
    }

}
