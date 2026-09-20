/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shalom;

public abstract class Persona {
    protected String codigo;
    protected String nombre;
    protected String DNI;
    protected String celular;

    public Persona(String codigo, String nombre, String DNI, String celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.DNI = DNI;
        this.celular = celular;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCelular() {
        return celular;
    }

    public abstract String getTipo();
}
