package Example.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patientdetails")
public class mammoModel {

    @Id
    @GeneratedValue(generator = "id_generator")
    @SequenceGenerator(
            name = "id_generator",
            sequenceName = "id_sequence",
            initialValue = 1
    )
    private Long id;


    private String FirstName;

    private String LastName;

    private Long PhoneNo;

    private String Doctor;

    private String Region;

    private Long NOC;

    private Long NOPREG;

    private Long AgeFP;

    private Boolean AYPREG;

    private Date LPeriodDate;

    private Boolean BC;

    private Long BirthCtrlD;

    private Boolean HRep;

    private Boolean BS;

    private Date BSDate;

    private Boolean leftbs;

    private Boolean rightbs;

    private Boolean bothbs;

    private Boolean BSRad;

    private Date BSRadDate;

    private Boolean leftbrs;

    private Boolean rightbrs;

    private Boolean bothbrs;

    private Boolean Chemo;

    private String ChemoS;

    private Boolean RC;

    private String BSComplaint;

    private Boolean SkinDimp;

    private Boolean NR;

    private Boolean Discharge;

    private String CDischarge;

    private Boolean History;

    private Boolean mother;

    private Boolean fatherside;

    private Boolean daughter;

    private Boolean sister;

    private Boolean gm;

    private Boolean mside;

    private Boolean aunt;

    @OnDelete(action = OnDeleteAction.CASCADE)

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDoctor() {
        return Doctor;
    }
    public void setDoctor(String Doctor) { this.Doctor = Doctor; }

    public Long getPhoneNo(){return PhoneNo;}
    public void setPhoneNo(Long PhoneNo){ this.PhoneNo=PhoneNo; }

    public String getRegion(){ return Region; }
    public void setRegion(String Region){ this.Region=Region; }

    public Long getNOC(){ return NOC; }
    public void setNOC(Long NOC){ this.NOC=NOC; }

    public Long getNOPREG(){ return NOPREG; }
    public void setNOPREG(Long NOPREG){ this.NOPREG=NOPREG; }

    public Long getAgeFP(){ return AgeFP; }
    public void setAgeFP(Long AgeFP){this.AgeFP=AgeFP; }

    public Boolean getAYPREG(){ return AYPREG; }
    public void setAYPREG (Boolean AYPREG){ this.AYPREG = AYPREG; }

    public Date getLPeriodDate(){ return LPeriodDate; }
    public void setLPeriodDate(Date LPeriodDate){ this.LPeriodDate=LPeriodDate; }

    public Boolean getBC(){ return BC; }
    public void setBC(Boolean BC){ this.BC=BC; }

    public Long getBirthCtrlD(){ return BirthCtrlD; }
    public void setBirthCtrlD(Long BirthCtrlD){ this.BirthCtrlD=BirthCtrlD; }

    public Boolean getHRep(){ return HRep; }
    public void setHRep(Boolean HRep){ this.HRep=HRep; }

    public Boolean getBS(){ return BS; }
    public void setBS(Boolean BS){ this.BS=BS; }

    public Date getBSDate(){ return BSDate; }
    public void setBSDate(Date BSDate){ this.BSDate=BSDate; }

    public Boolean getleftbs(){ return leftbs; }
    public void setleftbs(Boolean leftbs){ this.leftbs=leftbs; }

    public Boolean getrightbs(){ return rightbs; }
    public void setrightbs(Boolean rightbs){ this.rightbs=rightbs; }

    public Boolean getbothbs(){ return bothbs; }
    public void setbothbs(Boolean bothbs){ this.bothbs=bothbs; }

    public Boolean getBSRad(){ return BSRad; }
    public void setBSRad(Boolean BSRad){ this.BSRad=BSRad; }

    public Date getBSRadDate(){ return BSRadDate; }
    public void setBSRadDate(Date BSRadDate){ this.BSRadDate=BSRadDate; }

    public Boolean getleftbrs(){ return leftbrs; }
    public void setleftbrs(Boolean leftbrs){ this.leftbrs=leftbrs; }

    public Boolean getrightbrs(){ return rightbrs; }
    public void setrightbrs(Boolean rightbrs){ this.rightbrs=rightbrs; }

    public Boolean getbothbrs(){ return bothbrs; }
    public void setbothbrs(Boolean bothbrs){ this.bothbrs=bothbrs; }

    public Boolean getChemo(){ return Chemo; }
    public void setChemo(Boolean Chemo){ this.Chemo=Chemo; }

    public String getChemoS(){ return ChemoS; }
    public void setChemoS(String ChemoS){ this.ChemoS=ChemoS; }

    public Boolean getRC(){ return RC; }
    public void setRC(Boolean RC){ this.RC=RC; }

    public String getBSComplaint(){ return BSComplaint; }
    public void setBSComplaint(String BSComplaint){ this.BSComplaint=BSComplaint; }

    public Boolean getSkinDimp(){ return SkinDimp; }
    public void setSkinDimp(Boolean SkinDimp){ this.SkinDimp=SkinDimp;}

    public Boolean getNR(){ return NR; }
    public void setNR(Boolean NR){ this.NR=NR; }

    public Boolean getDischarge(){ return Discharge; }
    public void setDischarge(Boolean Discharge){ this.Discharge=Discharge; }

    public String getCDischarge(){ return CDischarge; }
    public void setCDischarge(String CDischarge){ this.CDischarge=CDischarge; }

    public Boolean getHistory(){ return History; }
    public void setHistory(Boolean History){ this.History=History; }

    public Boolean getmother(){ return mother; }
    public void setmother(Boolean mother){ this.mother=mother; }

    public Boolean getfatherside(){ return fatherside; }
    public void setFatherside(Boolean fatherside){ this.fatherside=fatherside; }

    public Boolean getdaughter(){ return daughter; }
    public void setdaughter(Boolean daughter){ this.daughter=daughter; }

    public Boolean getsister(){ return sister; }
    public void setsister(Boolean sister){ this.sister=sister; }

    public Boolean getmside(){ return mside; }
    public void setmside(Boolean mside){ this.mside=mside; }

    public Boolean getgm(){ return gm; }
    public void setgm(Boolean gm){ this.gm=gm; }

    public Boolean getaunt(){ return aunt; }
    public void setaunt(Boolean aunt){ this.aunt=aunt; }


}


