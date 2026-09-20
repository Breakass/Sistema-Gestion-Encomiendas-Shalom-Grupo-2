/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shalom;

import java.util.Date;

public class ConstanciaEntrega {
    private String numero;
    private Date fecha;
    private boolean firmado;
    private String nombreReceptor;
    private String dniReceptor;

    public ConstanciaEntrega(String numero) {
        this.numero = numero;
        this.fecha = new Date();
        this.firmado = false;
    }

    public void firmar(String nombreReceptor, String dniReceptor) {
        if (nombreReceptor == null || dniReceptor == null) {
            throw new IllegalArgumentException("Nombre y DNI del receptor son obligatorios");
        }
        this.nombreReceptor = nombreReceptor;
        this.dniReceptor = dniReceptor;
        this.firmado = true;
        System.out.println("✓ Constancia " + numero + " firmada por " + nombreReceptor);
    }

    public boolean estaFirmada() { return firmado; }
    public String getNumero() { return numero; }
}