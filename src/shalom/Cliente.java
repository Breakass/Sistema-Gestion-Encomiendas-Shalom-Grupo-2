package shalom;

public class Cliente extends Persona {

    private String email;
    private String direccion;

    public Cliente(String codigo, String nombre, String DNI, String celular,
                   String email, String direccion) {
        super(codigo, nombre, DNI, celular);

        if (!validarDNI()) {
            throw new IllegalArgumentException("DNI invalido: debe tener 8 digitos");
        }

        this.email = email;
        this.direccion = direccion;
    }

    public boolean validarDNI() {
        return DNI != null && DNI.length() == 8 && DNI.matches("\\d{8}");
    }

    public boolean esMayorDeEdad() {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }
}