/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;

/**
 *
 * @author Alumne
 */
public class Opus {
    String registre;
    String titol;
    String any;
    String format;
    String autor;
    String imatge;
    String pathAbsolute;

    public Opus() {}
    public Opus(String registre, String titol, String any, String format, String autor, String imatge) {
        this.registre = registre;
        this.titol = titol;
        this.any = any;
        this.format = format;
        this.autor = autor;
        this.imatge = imatge;
    }

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }
    
    public String getPathAbsolute() {
        return pathAbsolute;
    }

    public void setPathAbsolute(String pathAbsolute) {
        this.pathAbsolute = pathAbsolute;
    }

    @Override
    public String toString() {
        return "Opus{" + "registre=" + registre + ", titol=" + titol + ", any=" + any + ", format=" + format + ", autor=" + autor + ", imatge=" + imatge + '}';
    }

}
