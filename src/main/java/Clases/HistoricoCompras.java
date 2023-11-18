/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class HistoricoCompras {

    private List<Compra> compra;

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    public HistoricoCompras() {
    }

    public HistoricoCompras(List<Compra> compra) {
        this.compra = compra;
    }

}
