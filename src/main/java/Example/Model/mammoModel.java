package Example.Model;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patientdetails")
public class mammoModel {

    @Id
    @GeneratedValue(generator = "answer_generator")
    @SequenceGenerator(
            name = "answer_generator",
            sequenceName = "answer_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "FirstName")
    private String FirstName;
    @Column(columnDefinition = "LastName")
    private String LastName;
    @Column(columnDefinition = "PhoneNo")
    private Number PhoneNo;
    @Column(columnDefinition = "Doctor")
    private String Doctor;
    @Column(columnDefinition = "Region")
    private String Region;
    @Column(columnDefinition = "NOC")
    private Number NOC;
    @Column(columnDefinition = "NOPREG")
    private Number NOPREG;
    @Column(columnDefinition = "AgeFP")
    private Number AgeFP;
    @Column(columnDefinition = "AYPreg")
    private Boolean AYPreg;
    @Column(columnDefinition = "LPeriodDate")
    private Date LPeriodDate;
    @Column(columnDefinition = "BC")
    private Boolean BC;
    @Column(columnDefinition = "BirthCtrlD")
    private Number BirthCtrlD;
    @Column(columnDefinition = "HRep")
    private Boolean HRep;
    @Column(columnDefinition = "BS")
    private Boolean BS;
    @Column(columnDefinition = "BSDate")
    private Date BSDate;
    @Column(columnDefinition = "Brs")
    private String Brs;
    @Column(columnDefinition = "BSRad")
    private Boolean BSRad;
    @Column(columnDefinition = "BSRadDate")
    private Date BSRadDate;
    @Column(columnDefinition = "BrsRad")
    private String BrsRad;
    @Column(columnDefinition = "Chemo")
    private Boolean Chemo;
    @Column(columnDefinition = "ChemoS")
    private String ChemoS;
    @Column(columnDefinition = "RC")
    private Boolean RC;
    @Column(columnDefinition = "BSComplaint")
    private String BSComplaint;
    @Column(columnDefinition = "SkinDimp")
    private Boolean SkinDimp;
    @Column(columnDefinition = "NR")
    private Boolean NR;
    @Column(columnDefinition = "Discharge")
    private Boolean Discharge;
    @Column(columnDefinition = "CDischarge")
    private String CDischarge;
    @Column(columnDefinition = "History")
    private Boolean History;
    @Column(columnDefinition = "HisBC")
    private String HisBC;


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
        return FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = FirstName;
    }

    public String getDoctor() {
        return LastName;
    }
    public void setDoctor(String Doctor) { this.Doctor = Doctor; }

    public Number getPhoneNo(){return PhoneNo;}
    public void setPhoneNo(Number PhoneNo){ this.PhoneNo=PhoneNo; }

    public String getRegion(){ return Region; }
    public void setRegion(String Region){ this.Region=Region; }

    public Number getNOC(){ return NOC; }
    public void setNOC(Number NOC){ this.NOC=NOC; }

    public Number getNOPREG(){ return NOPREG; }
    public void setNOPREG(Number NOPREG){ this.NOPREG=NOPREG; }

    public Number getAgeFP(){ return AgeFP; }
    public void setAgeFP(Number AgeFP){this.AgeFP=AgeFP; }

    public Boolean getAYPreg(){ return AYPreg; }
    public void setAYPreg(Boolean AYPreg){ this.AYPreg=AYPreg; }

    public Date getLPeriodDate(){ return LPeriodDate; }
    public void setLPeriodDate(Date LPeriodDate){ this.LPeriodDate=LPeriodDate; }

    public Boolean getBC(){ return BC; }
    public void setBC(Boolean BC){ this.BC=BC; }

    public Number getBirthCtrlD(){ return BirthCtrlD; }
    public void setBirthCtrlD(Number BirthCtrlD){ this.BirthCtrlD=BirthCtrlD; }

    public Boolean getHRep(){ return HRep; }
    public void setHRep(Boolean HRep){ this.HRep=HRep; }

    public Boolean getBS(){ return BS; }
    public void setBS(Boolean BS){ this.BS=BS; }

    public Date getBSDate(){ return BSDate; }
    public void setBSDate(Date BSDate){ this.BSDate=BSDate; }

    public String getBrs(){ return Brs; }
    public void setBrs(String Brs){ this.Brs=Brs; }

    public Boolean getBSRad(){ return BSRad; }
    public void setBSRad(Boolean BSRad){ this.BSRad=BSRad; }

    public Date getBSRadDate(){ return BSRadDate; }
    public void setBSRadDate(Date BSRadDate){ this.BSRadDate=BSRadDate; }

    public String getBrsRad(){ return  BrsRad; }
    public void setBrsRad(String BrsRad){ this.BrsRad=BrsRad; }

    public Boolean getChemo(){ return Chemo; }
    public void setChemo(Boolean Chemo){ this.Chemo=Chemo; }

    public String getChemoS(){ return ChemoS; }
    public void setChemoS(String ChemoS){ this.ChemoS=ChemoS; }

    public Boolean getRC(){ return RC; }
    public void setRC(Boolean RC){ this.RC=RC; }

    public String getBSComplaint(){ return BSComplaint; }
    public void setBSComplaint(String BSComplaint){ this.BSComplaint=BSComplaint; }

    public Boolean getSkinDimp(){ return SkinDimp; }
    public void setSkinDimp(Boolean SkinDimop){ this.SkinDimp=SkinDimp;}

    public Boolean getNR(){ return NR; }
    public void setNR(Boolean NR){ this.NR=NR; }

    public Boolean getDischarge(){ return Discharge; }
    public void setDischarge(Boolean Discharge){ this.Discharge=Discharge; }

    public String getCDischarge(){ return CDischarge; }
    public void setCDischarge(String CDischarge){ this.CDischarge=CDischarge; }

    public Boolean getHistory(){ return History; }
    public void setHistory(Boolean History){ this.History=History; }

    public String getHisBC(){ return HisBC; }
    public void setHisBC(String HisBC){ this.HisBC=HisBC; }

}


