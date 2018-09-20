/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.pad.entity;



/**
 *
 * @author chuchip
 */
public class VentasMes {
    int ano,mes;
    double kilosVentaAct,impVentaAct,kilosVentaAnt,impVentaAnt;

     public VentasMes(int ano,int mes,double kilosVenta) {
        setAno(ano);
        setMes(mes);
        setKilosVentaAct(kilosVenta);
     }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
   
    public double getKilosVentaAct() {
        return kilosVentaAct;
    }

    public void setKilosVentaAct(double kilosVentaAct) {
        this.kilosVentaAct = kilosVentaAct;
    }

    public double getImpVentaAct() {
        return impVentaAct;
    }

    public void setImpVentaAct(double impVentaAct) {
        this.impVentaAct = impVentaAct;
    }

    public double getKilosVentaAnt() {
        return kilosVentaAnt;
    }

    public void setKilosVentaAnt(double kilosVentaAnt) {
        this.kilosVentaAnt = kilosVentaAnt;
    }

    public double getImpVentaAnt() {
        return impVentaAnt;
    }

    public void setImpVentaAnt(double impVentaAnt) {
        this.impVentaAnt = impVentaAnt;
    }
    public double getKilosDiferencia()
    {
        return kilosVentaAct-kilosVentaAnt;
    }
    public void setKilosDiferencia(boolean kg)
    {
        
    }
}
