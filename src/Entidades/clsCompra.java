/*
 * UNIANDES
 * Ingenieria en Sistemas 
 * Jonsthan Salguero
 * 9no Semestre 
*/

package Entidades;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class clsCompra {
    private int _id;
    private Date _fecha;
    private float _subtotal;
    private float _iva;
    private float _total;
    private String _proveedor;

    public clsCompra() {
    }

    public clsCompra(int _id, Date _fecha, float _subtotal, float _iva, float _total, String _proveedor) {
        this._id = _id;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
        this._proveedor = _proveedor;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public Date Fecha() {
        return _fecha;
    }

    public void Fecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public float Subtotal() {
        return _subtotal;
    }

    public void Subtotal(float _subtotal) {
        this._subtotal = _subtotal;
    }

    public float Iva() {
        return _iva;
    }

    public void Iva(float _iva) {
        this._iva = _iva;
    }

    public float Total() {
        return _total;
    }

    public void Total(float _total) {
        this._total = _total;
    }

    public String Proveedor() {
        return _proveedor;
    }

    public void Proveedor(String _proveedor) {
        this._proveedor = _proveedor;
    }
       
}
