/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.ventas.ejb;

import gnu.anjelica.pad.entity.Calendario;
import gnu.anjelica.pad.entity.VentasMes;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author chuchip
 */

@Stateful
public class CoHistVentasBean  implements Serializable
{
    @PersistenceContext
    private EntityManager em;

    private static final Logger logger = Logger.getLogger("gnu.anjelica.ventas.ejb.CoHistVentasBean");
   
   
     public CoHistVentasBean() {
         System.out.println("Arrancado estado");
     }
     public List<Calendario> locateMesesdeAno(int ano) {
                
        try {
            //List<Calendario> cal =
                    
            javax.persistence.Query q = em.createNamedQuery("findAllMes");                        
            q.setParameter("ano", ano);
            List<Calendario> cal =q.getResultList();
                    
            return cal;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
    public List<VentasMes> getKilosPorMes(int ano) {
                
        try {
            //List<Calendario> cal =           
         Query q = em.createNativeQuery("SELECT c.cal_ano,c.cal_mes , sum(avc_kilos) as kilosVenta " +
                 "FROM Calendario c,  v_Albavec v "
                + " where  c.cal_ano =  "+ano
                + " and v.avc_fecalb between c.cal_fecini and c.cal_fecfin "
                + " group by cal_ano,cal_mes "
                + " order by c.cal_mes","ventasMes");                  
           List<VentasMes>  cal = q.getResultList();
           q = em.createNativeQuery("SELECT c.cal_ano,c.cal_mes , sum(avc_kilos) as kilosVenta " +
                 "FROM Calendario c,  v_Albavec v "
                + " where  c.cal_ano =  "+ (ano-1)
                + " and v.avc_fecalb between c.cal_fecini and c.cal_fecfin "
                + " group by cal_ano,cal_mes "
                + " order by c.cal_mes","ventasMes");                  
           List<VentasMes>  calAnt = q.getResultList();
           
           for (VentasMes v : cal)
           {
               for (VentasMes vAnt: calAnt)
               {
                 if (v.getMes()==vAnt.getMes())  
                  v.setKilosVentaAnt(vAnt.getKilosVentaAct());                     
               }
           }
            return cal;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
}
