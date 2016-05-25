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
public class clsProducto {
    private int _id;
    private String _nombre;
    private String _descripcion;
    private int _stock;
    private float _pvp; //precio de venta al publico
    private float _pcp; //precio de compra al proveedor
    private boolean  _sinviva;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, String _descripcion, int _stock, float _pvp, float _pcp, boolean _sinviva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._sinviva = _sinviva;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float _pvp) {
        this._pvp = _pvp;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float _pcp) {
        this._pcp = _pcp;
    }

    public boolean isSinviva() {
        return _sinviva;
    }

    public void Sinviva(boolean _sinviva) {
        this._sinviva = _sinviva;
    }
    
}




