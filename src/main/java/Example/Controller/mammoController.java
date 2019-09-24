package Example.Controller;
import Example.Model.mammoModel;
import Example.Repository.mammoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")

public class mammoController{

    @Autowired
    mammoRepository mammorepository;
    @PutMapping("/d")
    public ResponseEntity<mammoModel> updatepatient(@RequestBody mammoModel cancerDetails) {

        cancerDetails.setFirstName(cancerDetails.getFirstName());
        cancerDetails.setLastName(cancerDetails.getLastName());
        cancerDetails.setDoctor(cancerDetails.getDoctor());
        cancerDetails.setRegion(cancerDetails.getRegion());
        cancerDetails.setNOC(cancerDetails.getNOC());
        cancerDetails.setNOPREG(cancerDetails.getNOPREG());
        cancerDetails.setAgeFP(cancerDetails.getAgeFP());
        cancerDetails.setAYPreg(cancerDetails.getAYPreg());
        cancerDetails.setLPeriodDate(cancerDetails.getLPeriodDate());
        cancerDetails.setBC(cancerDetails.getBC());
        cancerDetails.setBirthCtrlD(cancerDetails.getBirthCtrlD());
        cancerDetails.setHRep(cancerDetails.getHRep());
        cancerDetails.setBS(cancerDetails.getBS());
        cancerDetails.setBSDate(cancerDetails.getBSDate());
        cancerDetails.setBrs(cancerDetails.getBrs());
        cancerDetails.setBSRad(cancerDetails.getBSRad());
        cancerDetails.setBSRadDate(cancerDetails.getBSRadDate());
        cancerDetails.setBrsRad(cancerDetails.getBrsRad());
        cancerDetails.setChemo(cancerDetails.getChemo());
        cancerDetails.setChemoS(cancerDetails.getChemoS());
        cancerDetails.setRC(cancerDetails.getRC());
        cancerDetails.setBSComplaint(cancerDetails.getBSComplaint());
        cancerDetails.setSkinDimp(cancerDetails.getSkinDimp());
        cancerDetails.setNR(cancerDetails.getNR());
        cancerDetails.setDischarge(cancerDetails.getDischarge());
        cancerDetails.setCDischarge(cancerDetails.getCDischarge());
        cancerDetails.setHistory(cancerDetails.getHistory());
        cancerDetails.setHisBC(cancerDetails.getHisBC());

        final mammoModel cancerdetails= mammorepository.save(cancerDetails);
        return ResponseEntity.ok(cancerDetails);


    }
}
