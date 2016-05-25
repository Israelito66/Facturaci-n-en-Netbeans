/*
 * UNIANDES
 * Ingenieria en Sistemas 
 * Jonsthan Salguero
 * 9no Semestre 
*/

package Entidades;

/**
 *
 * @author Usuario
 */
public class clsCliente {
    private String ruc;
    private String _nombre;
    private String _direccion;
    private String _telefono;

    public clsCliente() {
    }

    public clsCliente(String ruc, String _nombre, String _direccion, String _telefono) {
        this.ruc = ruc;
        this._nombre = _nombre;
        this._direccion = _direccion;
        this._telefono = _telefono;
    }

    public String Ruc() {
        return ruc;
    }

    public void Ruc(String ruc) {
        this.ruc = ruc;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Direccion() {
        return _direccion;
    }

    public void Direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String Telefono() {
        return _telefono;
    }

    public void Telefono(String _telefono) {
        this._telefono = _telefono;
    }
    
}
