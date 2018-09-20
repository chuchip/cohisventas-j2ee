/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.pad.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chuchip
 */
@Entity
@Table(name = "v_albavec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VAlbavec.findAll", query = "SELECT v FROM VAlbavec v")
    , @NamedQuery(name = "VAlbavec.findByAvcAno", query = "SELECT v FROM VAlbavec v WHERE v.vAlbavecPK.avcAno = :avcAno")
    , @NamedQuery(name = "VAlbavec.findByEmpCodi", query = "SELECT v FROM VAlbavec v WHERE v.vAlbavecPK.empCodi = :empCodi")
    , @NamedQuery(name = "VAlbavec.findByAvcSerie", query = "SELECT v FROM VAlbavec v WHERE v.vAlbavecPK.avcSerie = :avcSerie")
    , @NamedQuery(name = "VAlbavec.findByAvcNume", query = "SELECT v FROM VAlbavec v WHERE v.vAlbavecPK.avcNume = :avcNume")
    , @NamedQuery(name = "VAlbavec.findByAvcClinom", query = "SELECT v FROM VAlbavec v WHERE v.avcClinom = :avcClinom")
    , @NamedQuery(name = "VAlbavec.findByAvcCofra", query = "SELECT v FROM VAlbavec v WHERE v.avcCofra = :avcCofra")
    , @NamedQuery(name = "VAlbavec.findByAvcFecalb", query = "SELECT v FROM VAlbavec v WHERE v.avcFecalb = :avcFecalb")
    , @NamedQuery(name = "VAlbavec.findByUsuNomb", query = "SELECT v FROM VAlbavec v WHERE v.usuNomb = :usuNomb")
    , @NamedQuery(name = "VAlbavec.findByAvcTipfac", query = "SELECT v FROM VAlbavec v WHERE v.avcTipfac = :avcTipfac")
    , @NamedQuery(name = "VAlbavec.findByCliRuta", query = "SELECT v FROM VAlbavec v WHERE v.cliRuta = :cliRuta")
    , @NamedQuery(name = "VAlbavec.findByCliCodfa", query = "SELECT v FROM VAlbavec v WHERE v.cliCodfa = :cliCodfa")
    , @NamedQuery(name = "VAlbavec.findByFvcAno", query = "SELECT v FROM VAlbavec v WHERE v.fvcAno = :fvcAno")
    , @NamedQuery(name = "VAlbavec.findByFvcNume", query = "SELECT v FROM VAlbavec v WHERE v.fvcNume = :fvcNume")
    , @NamedQuery(name = "VAlbavec.findByAvcCerra", query = "SELECT v FROM VAlbavec v WHERE v.avcCerra = :avcCerra")
    , @NamedQuery(name = "VAlbavec.findByAvcImpres", query = "SELECT v FROM VAlbavec v WHERE v.avcImpres = :avcImpres")
    , @NamedQuery(name = "VAlbavec.findByFvcTrasp", query = "SELECT v FROM VAlbavec v WHERE v.fvcTrasp = :fvcTrasp")
    , @NamedQuery(name = "VAlbavec.findByAvcFecemi", query = "SELECT v FROM VAlbavec v WHERE v.avcFecemi = :avcFecemi")
    , @NamedQuery(name = "VAlbavec.findBySbeCodi", query = "SELECT v FROM VAlbavec v WHERE v.sbeCodi = :sbeCodi")
    , @NamedQuery(name = "VAlbavec.findByAvcDesrec", query = "SELECT v FROM VAlbavec v WHERE v.avcDesrec = :avcDesrec")
    , @NamedQuery(name = "VAlbavec.findByAlmCodori", query = "SELECT v FROM VAlbavec v WHERE v.almCodori = :almCodori")
    , @NamedQuery(name = "VAlbavec.findByAlmCoddes", query = "SELECT v FROM VAlbavec v WHERE v.almCoddes = :almCoddes")
    , @NamedQuery(name = "VAlbavec.findByAvcConfo", query = "SELECT v FROM VAlbavec v WHERE v.avcConfo = :avcConfo")
    , @NamedQuery(name = "VAlbavec.findByAvcPreiva", query = "SELECT v FROM VAlbavec v WHERE v.avcPreiva = :avcPreiva")
    , @NamedQuery(name = "VAlbavec.findByAvcCobrad", query = "SELECT v FROM VAlbavec v WHERE v.avcCobrad = :avcCobrad")
    , @NamedQuery(name = "VAlbavec.findByAvcObser", query = "SELECT v FROM VAlbavec v WHERE v.avcObser = :avcObser")
    , @NamedQuery(name = "VAlbavec.findByAvcFecrca", query = "SELECT v FROM VAlbavec v WHERE v.avcFecrca = :avcFecrca")
    , @NamedQuery(name = "VAlbavec.findByAvcAlmori", query = "SELECT v FROM VAlbavec v WHERE v.avcAlmori = :avcAlmori")
    , @NamedQuery(name = "VAlbavec.findByAvcTarimp", query = "SELECT v FROM VAlbavec v WHERE v.avcTarimp = :avcTarimp")
    , @NamedQuery(name = "VAlbavec.findByAvcAux1", query = "SELECT v FROM VAlbavec v WHERE v.avcAux1 = :avcAux1")
    , @NamedQuery(name = "VAlbavec.findByAvcAux2", query = "SELECT v FROM VAlbavec v WHERE v.avcAux2 = :avcAux2")
    , @NamedQuery(name = "VAlbavec.findByAvcAux3", query = "SELECT v FROM VAlbavec v WHERE v.avcAux3 = :avcAux3")
    , @NamedQuery(name = "VAlbavec.findByAvcImpre2", query = "SELECT v FROM VAlbavec v WHERE v.avcImpre2 = :avcImpre2")
    , @NamedQuery(name = "VAlbavec.findByAvcBasimp", query = "SELECT v FROM VAlbavec v WHERE v.avcBasimp = :avcBasimp")
    , @NamedQuery(name = "VAlbavec.findByAvcImcob2", query = "SELECT v FROM VAlbavec v WHERE v.avcImcob2 = :avcImcob2")
    , @NamedQuery(name = "VAlbavec.findByAvcKilos", query = "SELECT v FROM VAlbavec v WHERE v.avcKilos = :avcKilos")
    , @NamedQuery(name = "VAlbavec.findByDivCodi", query = "SELECT v FROM VAlbavec v WHERE v.divCodi = :divCodi")
    , @NamedQuery(name = "VAlbavec.findByAvcUnid", query = "SELECT v FROM VAlbavec v WHERE v.avcUnid = :avcUnid")
    , @NamedQuery(name = "VAlbavec.findByAvcTottas", query = "SELECT v FROM VAlbavec v WHERE v.avcTottas = :avcTottas")
    , @NamedQuery(name = "VAlbavec.findByAvcTotta2", query = "SELECT v FROM VAlbavec v WHERE v.avcTotta2 = :avcTotta2")
    , @NamedQuery(name = "VAlbavec.findByAvcApltas", query = "SELECT v FROM VAlbavec v WHERE v.avcApltas = :avcApltas")
    , @NamedQuery(name = "VAlbavec.findByAvcRevpre", query = "SELECT v FROM VAlbavec v WHERE v.avcRevpre = :avcRevpre")
    , @NamedQuery(name = "VAlbavec.findByAvcRecarg", query = "SELECT v FROM VAlbavec v WHERE v.avcRecarg = :avcRecarg")
    , @NamedQuery(name = "VAlbavec.findByAvcImprec", query = "SELECT v FROM VAlbavec v WHERE v.avcImprec = :avcImprec")
    , @NamedQuery(name = "VAlbavec.findByAvcImpalb", query = "SELECT v FROM VAlbavec v WHERE v.avcImpalb = :avcImpalb")
    , @NamedQuery(name = "VAlbavec.findByAvcImpcob", query = "SELECT v FROM VAlbavec v WHERE v.avcImpcob = :avcImpcob")
    , @NamedQuery(name = "VAlbavec.findByAvcImpuv", query = "SELECT v FROM VAlbavec v WHERE v.avcImpuv = :avcImpuv")
    , @NamedQuery(name = "VAlbavec.findByAvcCucomi", query = "SELECT v FROM VAlbavec v WHERE v.avcCucomi = :avcCucomi")
    , @NamedQuery(name = "VAlbavec.findByAvcValora", query = "SELECT v FROM VAlbavec v WHERE v.avcValora = :avcValora")
    , @NamedQuery(name = "VAlbavec.findByAvcDtopp", query = "SELECT v FROM VAlbavec v WHERE v.avcDtopp = :avcDtopp")
    , @NamedQuery(name = "VAlbavec.findByAvcDtocom", query = "SELECT v FROM VAlbavec v WHERE v.avcDtocom = :avcDtocom")
    , @NamedQuery(name = "VAlbavec.findByAvcDtootr", query = "SELECT v FROM VAlbavec v WHERE v.avcDtootr = :avcDtootr")
    , @NamedQuery(name = "VAlbavec.findByAvcRecfin", query = "SELECT v FROM VAlbavec v WHERE v.avcRecfin = :avcRecfin")
    , @NamedQuery(name = "VAlbavec.findByAvcTipalb", query = "SELECT v FROM VAlbavec v WHERE v.avcTipalb = :avcTipalb")
    , @NamedQuery(name = "VAlbavec.findByAvcRepres", query = "SELECT v FROM VAlbavec v WHERE v.avcRepres = :avcRepres")
    , @NamedQuery(name = "VAlbavec.findByAvcNalsab", query = "SELECT v FROM VAlbavec v WHERE v.avcNalsab = :avcNalsab")
    , @NamedQuery(name = "VAlbavec.findByAvcNcarg", query = "SELECT v FROM VAlbavec v WHERE v.avcNcarg = :avcNcarg")
    , @NamedQuery(name = "VAlbavec.findByAvcNrelen", query = "SELECT v FROM VAlbavec v WHERE v.avcNrelen = :avcNrelen")
    , @NamedQuery(name = "VAlbavec.findByFvcSerie", query = "SELECT v FROM VAlbavec v WHERE v.fvcSerie = :fvcSerie")
    , @NamedQuery(name = "VAlbavec.findByAvcTainpr", query = "SELECT v FROM VAlbavec v WHERE v.avcTainpr = :avcTainpr")
    , @NamedQuery(name = "VAlbavec.findByAvcDepos", query = "SELECT v FROM VAlbavec v WHERE v.avcDepos = :avcDepos")
    , @NamedQuery(name = "VAlbavec.findByAvcId", query = "SELECT v FROM VAlbavec v WHERE v.avcId = :avcId")
    , @NamedQuery(name = "VAlbavec.findByDivCodi2", query = "SELECT v FROM VAlbavec v WHERE v.divCodi2 = :divCodi2")
    , @NamedQuery(name = "VAlbavec.findByAvcRcaedi", query = "SELECT v FROM VAlbavec v WHERE v.avcRcaedi = :avcRcaedi")})
public class VAlbavec implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VAlbavecPK vAlbavecPK;
    @Size(max = 40)
    @Column(name = "avc_clinom")
    private String avcClinom;
    @Column(name = "avc_cofra")
    private Integer avcCofra;
    @Column(name = "avc_fecalb")
    @Temporal(TemporalType.DATE)
    private Date avcFecalb;
    @Size(max = 20)
    @Column(name = "usu_nomb")
    private String usuNomb;
    @Size(max = 1)
    @Column(name = "avc_tipfac")
    private String avcTipfac;
    @Size(max = 2)
    @Column(name = "cli_ruta")
    private String cliRuta;
    @Column(name = "cli_codfa")
    private Integer cliCodfa;
    @Column(name = "fvc_ano")
    private Integer fvcAno;
    @Column(name = "fvc_nume")
    private Integer fvcNume;
    @Column(name = "avc_cerra")
    private Short avcCerra;
    @Column(name = "avc_impres")
    private Short avcImpres;
    @Column(name = "fvc_trasp")
    private Short fvcTrasp;
    @Column(name = "avc_fecemi")
    @Temporal(TemporalType.DATE)
    private Date avcFecemi;
    @Column(name = "sbe_codi")
    private Short sbeCodi;
    @Size(max = 15)
    @Column(name = "avc_desrec")
    private String avcDesrec;
    @Column(name = "alm_codori")
    private Integer almCodori;
    @Column(name = "alm_coddes")
    private Integer almCoddes;
    @Column(name = "avc_confo")
    private Short avcConfo;
    @Column(name = "avc_preiva")
    private Short avcPreiva;
    @Column(name = "avc_cobrad")
    private Short avcCobrad;
    @Size(max = 255)
    @Column(name = "avc_obser")
    private String avcObser;
    @Column(name = "avc_fecrca")
    @Temporal(TemporalType.DATE)
    private Date avcFecrca;
    @Column(name = "avc_almori")
    private Integer avcAlmori;
    @Column(name = "avc_tarimp")
    private Character avcTarimp;
    @Size(max = 50)
    @Column(name = "avc_aux1")
    private String avcAux1;
    @Size(max = 50)
    @Column(name = "avc_aux2")
    private String avcAux2;
    @Size(max = 50)
    @Column(name = "avc_aux3")
    private String avcAux3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avc_impre2")
    private Double avcImpre2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_basimp")
    private double avcBasimp;
    @Column(name = "avc_imcob2")
    private Double avcImcob2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_kilos")
    private double avcKilos;
    @Column(name = "div_codi")
    private Integer divCodi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_unid")
    private int avcUnid;
    @Column(name = "avc_tottas")
    private Double avcTottas;
    @Column(name = "avc_totta2")
    private Double avcTotta2;
    @Column(name = "avc_apltas")
    private Short avcApltas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_revpre")
    private short avcRevpre;
    @Column(name = "avc_recarg")
    private Double avcRecarg;
    @Column(name = "avc_imprec")
    private Double avcImprec;
    @Column(name = "avc_impalb")
    private Double avcImpalb;
    @Column(name = "avc_impcob")
    private Double avcImpcob;
    @Column(name = "avc_impuv")
    private Double avcImpuv;
    @Column(name = "avc_cucomi")
    private Integer avcCucomi;
    @Column(name = "avc_valora")
    private Integer avcValora;
    @Column(name = "avc_dtopp")
    private BigDecimal avcDtopp;
    @Column(name = "avc_dtocom")
    private BigDecimal avcDtocom;
    @Column(name = "avc_dtootr")
    private BigDecimal avcDtootr;
    @Column(name = "avc_recfin")
    private BigDecimal avcRecfin;
    @Size(max = 1)
    @Column(name = "avc_tipalb")
    private String avcTipalb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "avc_repres")
    private String avcRepres;
    @Size(max = 15)
    @Column(name = "avc_nalsab")
    private String avcNalsab;
    @Size(max = 17)
    @Column(name = "avc_ncarg")
    private String avcNcarg;
    @Size(max = 17)
    @Column(name = "avc_nrelen")
    private String avcNrelen;
    @Column(name = "fvc_serie")
    private Character fvcSerie;
    @Column(name = "avc_tainpr")
    private Short avcTainpr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_depos")
    private Character avcDepos;
    @Basic(optional = false)
    @Column(name = "avc_id")
    private int avcId;
    @Column(name = "div_codi2")
    private Short divCodi2;
    @Size(max = 2)
    @Column(name = "avc_rcaedi")
    private String avcRcaedi;
    @JoinColumn(name = "cli_codi", referencedColumnName = "cli_codi")
    @ManyToOne
    private Clientes cliCodi;

    public VAlbavec() {
    }

    public VAlbavec(VAlbavecPK vAlbavecPK) {
        this.vAlbavecPK = vAlbavecPK;
    }

    public VAlbavec(VAlbavecPK vAlbavecPK, double avcBasimp, double avcKilos, int avcUnid, short avcRevpre, String avcRepres, Character avcDepos, int avcId) {
        this.vAlbavecPK = vAlbavecPK;
        this.avcBasimp = avcBasimp;
        this.avcKilos = avcKilos;
        this.avcUnid = avcUnid;
        this.avcRevpre = avcRevpre;
        this.avcRepres = avcRepres;
        this.avcDepos = avcDepos;
        this.avcId = avcId;
    }

    public VAlbavec(int avcAno, int empCodi, Character avcSerie, int avcNume) {
        this.vAlbavecPK = new VAlbavecPK(avcAno, empCodi, avcSerie, avcNume);
    }

    public VAlbavecPK getVAlbavecPK() {
        return vAlbavecPK;
    }

    public void setVAlbavecPK(VAlbavecPK vAlbavecPK) {
        this.vAlbavecPK = vAlbavecPK;
    }

    public String getAvcClinom() {
        return avcClinom;
    }

    public void setAvcClinom(String avcClinom) {
        this.avcClinom = avcClinom;
    }

    public Integer getAvcCofra() {
        return avcCofra;
    }

    public void setAvcCofra(Integer avcCofra) {
        this.avcCofra = avcCofra;
    }

    public Date getAvcFecalb() {
        return avcFecalb;
    }

    public void setAvcFecalb(Date avcFecalb) {
        this.avcFecalb = avcFecalb;
    }

    public String getUsuNomb() {
        return usuNomb;
    }

    public void setUsuNomb(String usuNomb) {
        this.usuNomb = usuNomb;
    }

    public String getAvcTipfac() {
        return avcTipfac;
    }

    public void setAvcTipfac(String avcTipfac) {
        this.avcTipfac = avcTipfac;
    }

    public String getCliRuta() {
        return cliRuta;
    }

    public void setCliRuta(String cliRuta) {
        this.cliRuta = cliRuta;
    }

    public Integer getCliCodfa() {
        return cliCodfa;
    }

    public void setCliCodfa(Integer cliCodfa) {
        this.cliCodfa = cliCodfa;
    }

    public Integer getFvcAno() {
        return fvcAno;
    }

    public void setFvcAno(Integer fvcAno) {
        this.fvcAno = fvcAno;
    }

    public Integer getFvcNume() {
        return fvcNume;
    }

    public void setFvcNume(Integer fvcNume) {
        this.fvcNume = fvcNume;
    }

    public Short getAvcCerra() {
        return avcCerra;
    }

    public void setAvcCerra(Short avcCerra) {
        this.avcCerra = avcCerra;
    }

    public Short getAvcImpres() {
        return avcImpres;
    }

    public void setAvcImpres(Short avcImpres) {
        this.avcImpres = avcImpres;
    }

    public Short getFvcTrasp() {
        return fvcTrasp;
    }

    public void setFvcTrasp(Short fvcTrasp) {
        this.fvcTrasp = fvcTrasp;
    }

    public Date getAvcFecemi() {
        return avcFecemi;
    }

    public void setAvcFecemi(Date avcFecemi) {
        this.avcFecemi = avcFecemi;
    }

    public Short getSbeCodi() {
        return sbeCodi;
    }

    public void setSbeCodi(Short sbeCodi) {
        this.sbeCodi = sbeCodi;
    }

    public String getAvcDesrec() {
        return avcDesrec;
    }

    public void setAvcDesrec(String avcDesrec) {
        this.avcDesrec = avcDesrec;
    }

    public Integer getAlmCodori() {
        return almCodori;
    }

    public void setAlmCodori(Integer almCodori) {
        this.almCodori = almCodori;
    }

    public Integer getAlmCoddes() {
        return almCoddes;
    }

    public void setAlmCoddes(Integer almCoddes) {
        this.almCoddes = almCoddes;
    }

    public Short getAvcConfo() {
        return avcConfo;
    }

    public void setAvcConfo(Short avcConfo) {
        this.avcConfo = avcConfo;
    }

    public Short getAvcPreiva() {
        return avcPreiva;
    }

    public void setAvcPreiva(Short avcPreiva) {
        this.avcPreiva = avcPreiva;
    }

    public Short getAvcCobrad() {
        return avcCobrad;
    }

    public void setAvcCobrad(Short avcCobrad) {
        this.avcCobrad = avcCobrad;
    }

    public String getAvcObser() {
        return avcObser;
    }

    public void setAvcObser(String avcObser) {
        this.avcObser = avcObser;
    }

    public Date getAvcFecrca() {
        return avcFecrca;
    }

    public void setAvcFecrca(Date avcFecrca) {
        this.avcFecrca = avcFecrca;
    }

    public Integer getAvcAlmori() {
        return avcAlmori;
    }

    public void setAvcAlmori(Integer avcAlmori) {
        this.avcAlmori = avcAlmori;
    }

    public Character getAvcTarimp() {
        return avcTarimp;
    }

    public void setAvcTarimp(Character avcTarimp) {
        this.avcTarimp = avcTarimp;
    }

    public String getAvcAux1() {
        return avcAux1;
    }

    public void setAvcAux1(String avcAux1) {
        this.avcAux1 = avcAux1;
    }

    public String getAvcAux2() {
        return avcAux2;
    }

    public void setAvcAux2(String avcAux2) {
        this.avcAux2 = avcAux2;
    }

    public String getAvcAux3() {
        return avcAux3;
    }

    public void setAvcAux3(String avcAux3) {
        this.avcAux3 = avcAux3;
    }

    public Double getAvcImpre2() {
        return avcImpre2;
    }

    public void setAvcImpre2(Double avcImpre2) {
        this.avcImpre2 = avcImpre2;
    }

    public double getAvcBasimp() {
        return avcBasimp;
    }

    public void setAvcBasimp(double avcBasimp) {
        this.avcBasimp = avcBasimp;
    }

    public Double getAvcImcob2() {
        return avcImcob2;
    }

    public void setAvcImcob2(Double avcImcob2) {
        this.avcImcob2 = avcImcob2;
    }

    public double getAvcKilos() {
        return avcKilos;
    }

    public void setAvcKilos(double avcKilos) {
        this.avcKilos = avcKilos;
    }

    public Integer getDivCodi() {
        return divCodi;
    }

    public void setDivCodi(Integer divCodi) {
        this.divCodi = divCodi;
    }

    public int getAvcUnid() {
        return avcUnid;
    }

    public void setAvcUnid(int avcUnid) {
        this.avcUnid = avcUnid;
    }

    public Double getAvcTottas() {
        return avcTottas;
    }

    public void setAvcTottas(Double avcTottas) {
        this.avcTottas = avcTottas;
    }

    public Double getAvcTotta2() {
        return avcTotta2;
    }

    public void setAvcTotta2(Double avcTotta2) {
        this.avcTotta2 = avcTotta2;
    }

    public Short getAvcApltas() {
        return avcApltas;
    }

    public void setAvcApltas(Short avcApltas) {
        this.avcApltas = avcApltas;
    }

    public short getAvcRevpre() {
        return avcRevpre;
    }

    public void setAvcRevpre(short avcRevpre) {
        this.avcRevpre = avcRevpre;
    }

    public Double getAvcRecarg() {
        return avcRecarg;
    }

    public void setAvcRecarg(Double avcRecarg) {
        this.avcRecarg = avcRecarg;
    }

    public Double getAvcImprec() {
        return avcImprec;
    }

    public void setAvcImprec(Double avcImprec) {
        this.avcImprec = avcImprec;
    }

    public Double getAvcImpalb() {
        return avcImpalb;
    }

    public void setAvcImpalb(Double avcImpalb) {
        this.avcImpalb = avcImpalb;
    }

    public Double getAvcImpcob() {
        return avcImpcob;
    }

    public void setAvcImpcob(Double avcImpcob) {
        this.avcImpcob = avcImpcob;
    }

    public Double getAvcImpuv() {
        return avcImpuv;
    }

    public void setAvcImpuv(Double avcImpuv) {
        this.avcImpuv = avcImpuv;
    }

    public Integer getAvcCucomi() {
        return avcCucomi;
    }

    public void setAvcCucomi(Integer avcCucomi) {
        this.avcCucomi = avcCucomi;
    }

    public Integer getAvcValora() {
        return avcValora;
    }

    public void setAvcValora(Integer avcValora) {
        this.avcValora = avcValora;
    }

    public BigDecimal getAvcDtopp() {
        return avcDtopp;
    }

    public void setAvcDtopp(BigDecimal avcDtopp) {
        this.avcDtopp = avcDtopp;
    }

    public BigDecimal getAvcDtocom() {
        return avcDtocom;
    }

    public void setAvcDtocom(BigDecimal avcDtocom) {
        this.avcDtocom = avcDtocom;
    }

    public BigDecimal getAvcDtootr() {
        return avcDtootr;
    }

    public void setAvcDtootr(BigDecimal avcDtootr) {
        this.avcDtootr = avcDtootr;
    }

    public BigDecimal getAvcRecfin() {
        return avcRecfin;
    }

    public void setAvcRecfin(BigDecimal avcRecfin) {
        this.avcRecfin = avcRecfin;
    }

    public String getAvcTipalb() {
        return avcTipalb;
    }

    public void setAvcTipalb(String avcTipalb) {
        this.avcTipalb = avcTipalb;
    }

    public String getAvcRepres() {
        return avcRepres;
    }

    public void setAvcRepres(String avcRepres) {
        this.avcRepres = avcRepres;
    }

    public String getAvcNalsab() {
        return avcNalsab;
    }

    public void setAvcNalsab(String avcNalsab) {
        this.avcNalsab = avcNalsab;
    }

    public String getAvcNcarg() {
        return avcNcarg;
    }

    public void setAvcNcarg(String avcNcarg) {
        this.avcNcarg = avcNcarg;
    }

    public String getAvcNrelen() {
        return avcNrelen;
    }

    public void setAvcNrelen(String avcNrelen) {
        this.avcNrelen = avcNrelen;
    }

    public Character getFvcSerie() {
        return fvcSerie;
    }

    public void setFvcSerie(Character fvcSerie) {
        this.fvcSerie = fvcSerie;
    }

    public Short getAvcTainpr() {
        return avcTainpr;
    }

    public void setAvcTainpr(Short avcTainpr) {
        this.avcTainpr = avcTainpr;
    }

    public Character getAvcDepos() {
        return avcDepos;
    }

    public void setAvcDepos(Character avcDepos) {
        this.avcDepos = avcDepos;
    }

    public int getAvcId() {
        return avcId;
    }

    public void setAvcId(int avcId) {
        this.avcId = avcId;
    }

    public Short getDivCodi2() {
        return divCodi2;
    }

    public void setDivCodi2(Short divCodi2) {
        this.divCodi2 = divCodi2;
    }

    public String getAvcRcaedi() {
        return avcRcaedi;
    }

    public void setAvcRcaedi(String avcRcaedi) {
        this.avcRcaedi = avcRcaedi;
    }

    public Clientes getCliCodi() {
        return cliCodi;
    }

    public void setCliCodi(Clientes cliCodi) {
        this.cliCodi = cliCodi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vAlbavecPK != null ? vAlbavecPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VAlbavec)) {
            return false;
        }
        VAlbavec other = (VAlbavec) object;
        if ((this.vAlbavecPK == null && other.vAlbavecPK != null) || (this.vAlbavecPK != null && !this.vAlbavecPK.equals(other.vAlbavecPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gnu.anjelica.pad.entity.VAlbavec[ vAlbavecPK=" + vAlbavecPK + " ]";
    }
    
}
