package com.transferapp.transferapp.Service.İmpl;

import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Repository.BayernRepository;
import com.transferapp.transferapp.Service.BayernService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BayernServiceİmpl implements BayernService {

    @Autowired
    private BayernRepository bayernRepository;

    private String ordto(BayernMunich bayernMunich, BayernDto bayernDto) {  // DTO YU ÇEVİRİ İŞLEMİ
        bayernMunich.setName(bayernDto.getName());
        bayernMunich.setSurname(bayernDto.getSurname());
        bayernMunich.setNation(bayernDto.getNation());
        bayernMunich.setTeam(bayernDto.getTeam());
        bayernMunich.setAge(bayernDto.getAge());
        bayernMunich.setPosition(bayernDto.getPosition());
        bayernMunich.setTrasfervalue(bayernDto.getTrasfervalue());

        bayernRepository.save(bayernMunich);
        return "Oyuncu bilgileri eklendi";

    }


    public String playersave(BayernDto bayernDto) {     // yeni oyuncu ekleme
        ordto(new BayernMunich(), bayernDto);
        return "Oyuncu bilgileri eklendi";
    }

    public BayernMunich getbyid(Long id) {        // id ile oyuncu bulma
        Optional<BayernMunich> bayernplayer = bayernRepository.findById(id);
        if (bayernplayer.isPresent()) {
            return bayernplayer.get();
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }

    }

    public List<BayernMunich> allplayers() {         // tüm oyuncular
        return bayernRepository.findAll();
    }

    public String updateplayer(Long id, BayernDto bayernDto) {      // oyuncu güncelleme
        Optional<BayernMunich> bayernMunich = bayernRepository.findById(id);
        if (bayernMunich.isPresent()) {
            return ordto(bayernMunich.get(), bayernDto);
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }

    }


    public String oyuncusilme(Long id) {          // oyuncu silme
        Optional<BayernMunich> bayernMunich = bayernRepository.findById(id);
        if (bayernMunich.isPresent()) {
            bayernRepository.deleteById(id);
            return "Oyuncu silindi";
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }
}
