/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shalom;

public class Paquete {
    private String codigo;
    private String descripcion;
    private double peso;
    private double largo;
    private double ancho;
    private double alto;
    private boolean empaqueValidado;

    private static final double PESO_MAXIMO = 50.0;

    public Paquete(String codigo, String descripcion, double peso,
                   double largo, double ancho, double alto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.empaqueValidado = false;
    }

    public double calcularVolumen() {
        return largo * ancho * alto;
    }

    public double calcularPesoVolumetrico() {
        return calcularVolumen() / 5000.0;
    }

    public boolean validarEmpaque() {
        return empaqueValidado;
    }

    public boolean validarPeso() {
        return peso > 0 && peso <= PESO_MAXIMO;
    }

    public void marcarEmpaqueValidado() {
        this.empaqueValidado = true;
        System.out.println("✓ Empaque validado para paquete " + codigo);
    }

    public double getPeso() { return peso; }
    public String getCodigo() { return codigo; }
    public boolean isEmpaqueValidado() { return empaqueValidado; }
}
