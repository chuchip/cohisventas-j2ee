/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.pad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;



/**
 *
 * @author chuchip
 */

@Entity
@Table(name="calendario")
@IdClass(CalendarioKey.class)
@NamedQueries({
    @NamedQuery(
        name="findAllMes",
        query="SELECT c " +
              "FROM Calendario c "
                + "where c.ano = :ano"
                + " order by c.mes"
    )   
})
@SqlResultSetMapping(name = "ventasMes",
                     classes={
       @ConstructorResult(targetClass=VentasMes.class,
columns={
@ColumnResult(name="cal_ano"),
@ColumnResult(name="cal_mes"),
@ColumnResult(name="kilosVenta"),
})
})
        

public class Calendario implements Serializable{ 
    @Column(name = "cal_fecini",nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "cal_fecfin",nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinal;
    @Transient
    private double kilosVenta;
    
    @Id
    @Column (name="cal_mes", nullable=false)    
    private int mes;
    @Id
    @Column (name="cal_ano", nullable=false)
    private int ano;
    
    public Calendario() {

    }
    public Calendario(int ano,int mes,Date fecInicio,Date fechaFinal, double kilosVenta) {
        setAno(ano);
        setMes(mes);
        setFechaInicio(fecInicio);
        setFechaFinal(fechaFinal);
        setKilosVenta(kilosVenta);
     }
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
   
 

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getKilosVenta() {
        return kilosVenta;
    }

    public void setKilosVenta(double kilosVenta) {
        this.kilosVenta = kilosVenta;
    }

}
