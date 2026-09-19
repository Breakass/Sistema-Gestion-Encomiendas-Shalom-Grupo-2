/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shalom;

import java.util.ArrayList;
import java.util.List;

public class AgenciaShalom {
    private String codigo;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String telefono;
    private List<Envio> enviosOrigen;
    private List<Envio> enviosDestino;
    private List<Empleado> empleados;

    public AgenciaShalom(String codigo, String nombre, String ciudad,
            String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.enviosOrigen = new ArrayList<>();
        this.enviosDestino = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void registrarEnvioOrigen(Envio envio) {
        if (envio != null) {
            enviosOrigen.add(envio);
        }
    }

    public void registrarEnvioDestino(Envio envio) {
        if (envio != null) {
            enviosDestino.add(envio);
        }
    }

    public Envio buscarEnvioPorGuia(String guia) {
        for (Envio e : enviosOrigen) {
            if (e.getNumeroGuia().equals(guia))
                return e;
        }
        for (Envio e : enviosDestino) {
            if (e.getNumeroGuia().equals(guia))
                return e;
        }
        return null;
    }

    public void agregarEmpleado(Empleado emp) {
        if (emp != null) {
            empleados.add(emp);
            emp.setAgenciaAsignada(this);
        }
    }

    public java.util.List<Envio> listarEnviosPendientes() {
        java.util.List<Envio> pendientes = new ArrayList<>();
        for (Envio e : enviosDestino) {
            if (e.consultarEstado() == EstadoEnvio.LISTO_PARA_RECOJO) {
                pendientes.add(e);
            }
        }
        return pendientes;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
