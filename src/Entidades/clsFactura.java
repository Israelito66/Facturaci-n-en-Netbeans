/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class clsFactura {
    private int _id;
    private String _cliente;
    private Date _fecha;
    private float _subtotal;

    public clsFactura() {
    }

    public clsFactura(int _id, String _cliente, Date _fecha, float _subtotal) {
        this._id = _id;
        this._cliente = _cliente;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Cliente() {
        return _cliente;
    }

    public void Cliente(String _cliente) {
        this._cliente = _cliente;
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
    
}
