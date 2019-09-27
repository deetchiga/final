package Example.Controller;
import Example.Model.mammoModel;
import Example.Repository.mammoRepository;
import Example.Config.mammoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/app")
public class mammoController{

    @Autowired
    mammoRepository mammorepository;

    @Autowired
    @Qualifier("mariaJdbcTemplate")
    private JdbcTemplate mariaJdbcTemplate;

    public List<Map<String, Object>> getdata() {
        try {
            List<Map<String, Object>> data;
            String query = mammoRepository.details;
            data = mariaJdbcTemplate.queryForList(query);
            System.out.println(data);
            return data;
        } catch (Exception e) {
            System.out.println("Exception");
            throw e;
        }
    }

    @GetMapping("/get_data")
    public List<Map<String, Object>> getdata1(){
        try{
            List<Map<String, Object>> data;
            data = getdata();
            System.out.println(data);
            return data;
        }catch(Exception e){
            System.out.println("Exception");
            throw e;
        }
    }


    @PostMapping("/sample")
    public ResponseEntity<mammoModel> updatepatient(@RequestBody mammoModel cancerDetails) {

        cancerDetails.setFirstName(cancerDetails.getFirstName());
        cancerDetails.setLastName(cancerDetails.getLastName());
        cancerDetails.setPhoneNo(cancerDetails.getPhoneNo());
        cancerDetails.setDoctor(cancerDetails.getDoctor());
        cancerDetails.setRegion(cancerDetails.getRegion());
        cancerDetails.setNOC(cancerDetails.getNOC());
        cancerDetails.setNOPREG(cancerDetails.getNOPREG());
        cancerDetails.setAgeFP(cancerDetails.getAgeFP());
        cancerDetails.setAYPREG(cancerDetails.getAYPREG());
        cancerDetails.setLPeriodDate(cancerDetails.getLPeriodDate());
        cancerDetails.setBC(cancerDetails.getBC());
        cancerDetails.setBirthCtrlD(cancerDetails.getBirthCtrlD());
        cancerDetails.setHRep(cancerDetails.getHRep());
        cancerDetails.setBS(cancerDetails.getBS());
        cancerDetails.setBSDate(cancerDetails.getBSDate());
        cancerDetails.setleftbs(cancerDetails.getleftbs());
        cancerDetails.setrightbs(cancerDetails.getrightbs());
        cancerDetails.setbothbs(cancerDetails.getbothbs());
        cancerDetails.setBSRad(cancerDetails.getBSRad());
        cancerDetails.setBSRadDate(cancerDetails.getBSRadDate());
        cancerDetails.setleftbrs(cancerDetails.getleftbrs());
        cancerDetails.setrightbrs(cancerDetails.getrightbrs());
        cancerDetails.setbothbrs(cancerDetails.getbothbrs());
        cancerDetails.setChemo(cancerDetails.getChemo());
        cancerDetails.setChemoS(cancerDetails.getChemoS());
        cancerDetails.setRC(cancerDetails.getRC());
        cancerDetails.setBSComplaint(cancerDetails.getBSComplaint());
        cancerDetails.setSkinDimp(cancerDetails.getSkinDimp());
        cancerDetails.setNR(cancerDetails.getNR());
        cancerDetails.setDischarge(cancerDetails.getDischarge());
        cancerDetails.setCDischarge(cancerDetails.getCDischarge());
        cancerDetails.setHistory(cancerDetails.getHistory());
        cancerDetails.setmother(cancerDetails.getmother());
        cancerDetails.setFatherside(cancerDetails.getfatherside());
        cancerDetails.setdaughter(cancerDetails.getdaughter());
        cancerDetails.setsister(cancerDetails.getsister());
        cancerDetails.setmside(cancerDetails.getmside());
        cancerDetails.setgm(cancerDetails.getgm());
        cancerDetails.setaunt(cancerDetails.getaunt());

        final mammoModel cancerdetails= mammorepository.save(cancerDetails);
        return ResponseEntity.ok(cancerDetails);


    }
}
