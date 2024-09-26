package com.transferapp.transferapp.Service.İmpl;

import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Entity.ManchesterCity;
import com.transferapp.transferapp.Entity.RealMadrid;
import com.transferapp.transferapp.Repository.BarcelonaRepository;
import com.transferapp.transferapp.Repository.BayernRepository;
import com.transferapp.transferapp.Repository.ManchesterRepository;
import com.transferapp.transferapp.Repository.RealRepository;
import com.transferapp.transferapp.Service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferServiceİmpl implements TransferService {

    @Autowired
    private BarcelonaRepository barcelonaRepository;

    @Autowired
    private BayernRepository bayernRepository;

    @Autowired
    private ManchesterRepository manchesterRepository;

    @Autowired
    private RealRepository realRepository;


    public String transferBarcelonaBayern(Long id) {   // BARCELONADAN BAYERNE TRANSFER
        Optional<Barcelona> barcelona = barcelonaRepository.findById(id);
        BayernMunich bayernMunich1 = new BayernMunich();

        bayernMunich1.setName(barcelona.get().getName());
        bayernMunich1.setSurname(barcelona.get().getSurname());
        bayernMunich1.setNation(barcelona.get().getNation());
        bayernMunich1.setTeam("Bayern Münich");
        bayernMunich1.setAge(barcelona.get().getAge());
        bayernMunich1.setPosition(barcelona.get().getPosition());
        bayernMunich1.setTrasfervalue(barcelona.get().getTrasfervalue());

        barcelonaRepository.deleteById(id);
        bayernRepository.save(bayernMunich1);
        return "Barcelona takımındaki " + bayernMunich1.getName() + " " + bayernMunich1.getSurname() + "Bayern Münich takımına transfer edilmiştir.";

    }

    public String transferBarcelonaReal(Long id) {        // BARCELONADAN REALE TRANSFER
        Optional<Barcelona> barcelona = barcelonaRepository.findById(id);
        RealMadrid realMadrid = new RealMadrid();

        realMadrid.setName(barcelona.get().getName());
        realMadrid.setSurname(barcelona.get().getSurname());
        realMadrid.setNation(barcelona.get().getNation());
        realMadrid.setTeam("Real Madrid");
        realMadrid.setAge(barcelona.get().getAge());
        realMadrid.setPosition(barcelona.get().getPosition());
        realMadrid.setTrasfervalue(barcelona.get().getTrasfervalue());

        barcelonaRepository.deleteById(id);
        realRepository.save(realMadrid);
        return "Barcelona takımındaki " + realMadrid.getName() + " " + realMadrid.getSurname() + "Real Madrid takımına transfer edilmiştir.";
    }
    public String transferBarcelonaCity(Long id){      // BARCELONADAN CİTYE TRANSFER
        Optional<Barcelona> barcelona = barcelonaRepository.findById(id);
        ManchesterCity manchesterCity = new ManchesterCity();

        manchesterCity.setName(barcelona.get().getName());
        manchesterCity.setSurname(barcelona.get().getSurname());
        manchesterCity.setNation(barcelona.get().getNation());
        manchesterCity.setTeam("Manchester City");
        manchesterCity.setAge(barcelona.get().getAge());
        manchesterCity.setPosition(barcelona.get().getPosition());
        manchesterCity.setTrasfervalue(barcelona.get().getTrasfervalue());

        barcelonaRepository.deleteById(id);
        manchesterRepository.save(manchesterCity);
        return "Barcelona takımındaki " + manchesterCity.getName()+ " "+manchesterCity.getSurname()+"Manchester City takımına transfer edilmiştir.";

    }
    public String transferBayernBarcelona(Long id) {  // BAYERNDEN BARCELONAYA TRANSFER
        Optional<BayernMunich> bayernMunich = bayernRepository.findById(id);
        Barcelona barcelona = new Barcelona();

        barcelona.setName(bayernMunich.get().getName());
        barcelona.setSurname(bayernMunich.get().getSurname());
        barcelona.setNation(bayernMunich.get().getNation());
        barcelona.setTeam("Barcelona");
        barcelona.setAge(bayernMunich.get().getAge());
        barcelona.setPosition(bayernMunich.get().getPosition());
        barcelona.setTrasfervalue(bayernMunich.get().getTrasfervalue());

        bayernRepository.deleteById(id);
        barcelonaRepository.save(barcelona);
        return "Bayern Münich takımındaki " + barcelona.getName() + " " + barcelona.getSurname() + "Barcelona takımına transfer edilmiştir.";

    }
    public String transferBayernManchester(Long id){  // BAYERNDEN MANCHESTERE TRANSFER
        Optional<BayernMunich> bayernMunich = bayernRepository.findById(id);
        ManchesterCity manchesterCity = new ManchesterCity();

        manchesterCity.setName(bayernMunich.get().getName());
        manchesterCity.setSurname(bayernMunich.get().getSurname());
        manchesterCity.setNation(bayernMunich.get().getNation());
        manchesterCity.setTeam("Manchester City");
        manchesterCity.setAge(bayernMunich.get().getAge());
        manchesterCity.setPosition(bayernMunich.get().getPosition());
        manchesterCity.setTrasfervalue(bayernMunich.get().getTrasfervalue());

        bayernRepository.deleteById(id);
        manchesterRepository.save(manchesterCity);
        return "Bayern Münich takımındaki " + manchesterCity.getName()+ " "+manchesterCity.getSurname()+"Manchester City takımına transfer edilmiştir.";

    }
    public String transferBayernReal(Long id){  // BAYERNDEN REALE TRANSFER
        Optional<BayernMunich> bayernMunich = bayernRepository.findById(id);
        RealMadrid realMadrid = new RealMadrid();

        realMadrid.setName(bayernMunich.get().getName());
        realMadrid.setSurname(bayernMunich.get().getSurname());
        realMadrid.setNation(bayernMunich.get().getNation());
        realMadrid.setTeam("Real Madrid");
        realMadrid.setAge(bayernMunich.get().getAge());
        realMadrid.setPosition(bayernMunich.get().getPosition());
        realMadrid.setTrasfervalue(bayernMunich.get().getTrasfervalue());

        bayernRepository.deleteById(id);
        realRepository.save(realMadrid);
        return "Bayern Münich takımındaki " + realMadrid.getName()+ " "+realMadrid.getSurname()+"Real Madrid takımına transfer edilmiştir.";

    }
    public String transferManchesterBarcelona(Long id){  // CİTYDEN BARCELONAYA TRANSFER
        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        Barcelona barcelona = new Barcelona();

        barcelona.setName(manchesterCity.get().getName());
        barcelona.setSurname(manchesterCity.get().getSurname());
        barcelona.setNation(manchesterCity.get().getNation());
        barcelona.setTeam("Barcelona");
        barcelona.setAge(manchesterCity.get().getAge());
        barcelona.setPosition(manchesterCity.get().getPosition());
        barcelona.setTrasfervalue(manchesterCity.get().getTrasfervalue());

        manchesterRepository.deleteById(id);
        barcelonaRepository.save(barcelona);
        return "Manchester City takımındaki " + barcelona.getName()+ " "+barcelona.getSurname()+"Barcelona takımına transfer edilmiştir.";

    } public String transferManchesterBayern(Long id){  // CİTYDEN BAYERNE TRANSFER
        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        BayernMunich bayernMunich = new BayernMunich();

        bayernMunich.setName(manchesterCity.get().getName());
        bayernMunich.setSurname(manchesterCity.get().getSurname());
        bayernMunich.setNation(manchesterCity.get().getNation());
        bayernMunich.setTeam("Bayern Münich");
        bayernMunich.setAge(manchesterCity.get().getAge());
        bayernMunich.setPosition(manchesterCity.get().getPosition());
        bayernMunich.setTrasfervalue(manchesterCity.get().getTrasfervalue());

        manchesterRepository.deleteById(id);
        bayernRepository.save(bayernMunich);
        return "Manchester City takımındaki " + bayernMunich.getName()+ " "+bayernMunich.getSurname()+"Bayern Münich takımına transfer edilmiştir.";

    }
    public String transferManhesterReal(Long id){  // CİTYDEN REALE TRANSFER
        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        RealMadrid realMadrid = new RealMadrid();

        realMadrid.setName(manchesterCity.get().getName());
        realMadrid.setSurname(manchesterCity.get().getSurname());
        realMadrid.setNation(manchesterCity.get().getNation());
        realMadrid.setTeam("Real Madrid");
        realMadrid.setAge(manchesterCity.get().getAge());
        realMadrid.setPosition(manchesterCity.get().getPosition());
        realMadrid.setTrasfervalue(manchesterCity.get().getTrasfervalue());

        manchesterRepository.deleteById(id);
        realRepository.save(realMadrid);
        return "Manchester City takımındaki " + realMadrid.getName()+ " "+realMadrid.getSurname()+"Real Madrid takımına transfer edilmiştir.";

    }
    public String transferRealBarcelona(Long id){  // REALDEN BARCELONAYA TRANSFER
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        Barcelona barcelona = new Barcelona();

        barcelona.setName(realMadrid.get().getName());
        barcelona.setSurname(realMadrid.get().getSurname());
        barcelona.setNation(realMadrid.get().getNation());
        barcelona.setTeam("Barcelona");
        barcelona.setAge(realMadrid.get().getAge());
        barcelona.setPosition(realMadrid.get().getPosition());
        barcelona.setTrasfervalue(realMadrid.get().getTrasfervalue());

        realRepository.deleteById(id);
        barcelonaRepository.save(barcelona);
        return "Real Madrid takımındaki " + barcelona.getName()+ " "+barcelona.getSurname()+"Barcelona takımına transfer edilmiştir.";

    }
    public String transferRealBayern(Long id){   // REALDEN BAYERNE TRANSFER
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        BayernMunich bayernMunich = new BayernMunich();

        bayernMunich.setName(realMadrid.get().getName());
        bayernMunich.setSurname(realMadrid.get().getSurname());
        bayernMunich.setNation(realMadrid.get().getNation());
        bayernMunich.setTeam("Bayern Münich");
        bayernMunich.setAge(realMadrid.get().getAge());
        bayernMunich.setPosition(realMadrid.get().getPosition());
        bayernMunich.setTrasfervalue(realMadrid.get().getTrasfervalue());

        realRepository.deleteById(id);
        bayernRepository.save(bayernMunich);
        return "Real Madrid takımındaki " + bayernMunich.getName()+ " "+bayernMunich.getSurname()+"Bayern Münich takımına transfer edilmiştir.";

    }
    public String transferRealManchester(Long id){  // REALDEN CİTYE TRANSFER
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        ManchesterCity manchesterCity = new ManchesterCity();

        manchesterCity.setName(realMadrid.get().getName());
        manchesterCity.setSurname(realMadrid.get().getSurname());
        manchesterCity.setNation(realMadrid.get().getNation());
        manchesterCity.setTeam("Manchester City");
        manchesterCity.setAge(realMadrid.get().getAge());
        manchesterCity.setPosition(realMadrid.get().getPosition());
        manchesterCity.setTrasfervalue(realMadrid.get().getTrasfervalue());

        realRepository.deleteById(id);
        manchesterRepository.save(manchesterCity);
        return "Real Madrid takımındaki " + manchesterCity.getName()+ " "+manchesterCity.getSurname()+"Manchester City takımına transfer edilmiştir.";

    }


}
