/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.pad.entity;

import java.io.Serializable;

/**
 *
 * @author chuchip
 */

public class CalendarioKey implements Serializable {
     int ano;
     int mes;

    
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
    public CalendarioKey() {}
    
 public CalendarioKey(int ano, Integer mes) {
        this.setAno(ano);
        this.setMes(mes);
    }
  @Override
    public int hashCode() {
        return (this.getAno()
                ^  this.getMes());
    }

    @Override
    public boolean equals(Object otherOb) {

        if (this == otherOb) {
            return true;
        }
        if (!(otherOb instanceof CalendarioKey)) {
            return false;
        }
        CalendarioKey other = (CalendarioKey) otherOb;
        return this.getAno()==other.getAno()   && this.getMes() == other.getMes();
    }

    @Override
    public String toString() {
        return "" + getAno() + "-" + getMes();
    }

         
     
}
