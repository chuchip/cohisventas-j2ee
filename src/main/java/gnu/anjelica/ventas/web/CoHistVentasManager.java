/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.ventas.web;

import gnu.anjelica.pad.entity.Calendario;
import gnu.anjelica.pad.entity.VentasMes;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author chuchip
 */

@ManagedBean
@SessionScoped

public class CoHistVentasManager {
     @EJB
    private gnu.anjelica.ventas.ejb.CoHistVentasBean request;  
    private boolean consultar=false;

    private Date fechaInicio=  java.sql.Date.valueOf(LocalDate.of( LocalDate.now().getYear(),1,2));            
    private Date fechaFinal=  java.sql.Date.valueOf(LocalDate.of( LocalDate.now().getYear(),12,31));
    
    public void setConsultar(boolean consultar) {
        this.consultar = consultar;
    }
    
 
    public boolean getConsultar()
    {
        return fechaInicio!=null && fechaFinal!=null && consultar;
    }
    public Date getFechaInicio()
    {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInic)
    {
         fechaInicio=fechaInic;
    }
    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public int getPrimerMes()
    {         
        SimpleDateFormat sd = new SimpleDateFormat();
        sd.applyPattern("yyyy");
        List<Calendario> meses= getMesesdeAno (Integer.parseInt(sd.format(fechaInicio)));        
        if (meses.isEmpty())
            return 0;
        else
            return meses.get(0).getMes();
    }
    public List<Calendario> getMeses()
    {              
        SimpleDateFormat sd = new SimpleDateFormat();
        sd.applyPattern("yyyy");
        List<Calendario> meses= getMesesdeAno (Integer.parseInt(sd.format(fechaInicio)));        
        return meses;
    }
    public List<VentasMes> getKilosPorMes()
    {              
        SimpleDateFormat sd = new SimpleDateFormat();
        sd.applyPattern("yyyy");
        List<VentasMes> meses= getKilosPorMes(Integer.parseInt(sd.format(fechaInicio)));        
        return meses;
    }
    public void setMeses(List<Calendario> cal)
    {              
    }
    public List<Calendario> getMesesdeAno(int ano)
    {         
         return request.locateMesesdeAno(ano);
    }
    public List<VentasMes> getKilosPorMes(int ano)
    {         
         return request.getKilosPorMes(ano);
    }
}
