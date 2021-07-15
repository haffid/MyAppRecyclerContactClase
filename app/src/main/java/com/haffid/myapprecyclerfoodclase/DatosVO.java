package com.haffid.myapprecyclerfoodclase;

public class DatosVO {

    private String nombreC;
    private int numeroC;
    private int imagenC;

    public DatosVO(String heydy_) {
    }

    public DatosVO(String nombreC, int numeroC, int imagenC) {
        this.nombreC = nombreC;
        this.numeroC = numeroC;
        this.imagenC = imagenC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public int getImagenC() {
        return imagenC;
    }

    public void setImagenC(int imagenC) {
        this.imagenC = imagenC;
    }
}
