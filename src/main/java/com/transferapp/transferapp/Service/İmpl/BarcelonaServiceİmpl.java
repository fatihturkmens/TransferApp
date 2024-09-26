package com.transferapp.transferapp.Service.İmpl;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Repository.BarcelonaRepository;
import com.transferapp.transferapp.Service.BarcelonaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarcelonaServiceİmpl implements BarcelonaService {

    @Autowired
    private BarcelonaRepository barcelonaRepository;


    private String ordto(Barcelona barcelona,BarcelonaDto barcelonaDto){  // DTO YU ÇEVİRİ İŞLEMİ
        barcelona.setName(barcelonaDto.getName());
        barcelona.setSurname(barcelonaDto.getSurname());
        barcelona.setNation(barcelonaDto.getNation());
        barcelona.setTeam(barcelonaDto.getTeam());
        barcelona.setAge(barcelonaDto.getAge());
        barcelona.setPosition(barcelonaDto.getPosition());
        barcelona.setTrasfervalue(barcelonaDto.getTrasfervalue());

        barcelonaRepository.save(barcelona);
        return "Oyuncu bilgileri eklendi";

    }

    public String playersave(BarcelonaDto barcelonaDto){     // yeni oyuncu ekleme

        ordto(new Barcelona(),barcelonaDto);
        return "Oyuncu bilgileri eklendi";
    }

    public Barcelona getbyid(Long id){        // id ile oyuncu bulma
       Optional<Barcelona> barcelonaplayer = barcelonaRepository.findById(id);
       if (barcelonaplayer.isPresent()){
           return barcelonaplayer.get();
       }else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
       }

    }

     public List<Barcelona> allplayers(){         // tüm oyuncular
       return barcelonaRepository.findAll();
     }

     public String updateplayer(Long id ,BarcelonaDto barcelonaDto){      // oyuncu güncelleme
       Optional<Barcelona> barcelona =  barcelonaRepository.findById(id);
        if (barcelona.isPresent()){
            return ordto(barcelona.get(),barcelonaDto);
        }
        else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }

     }


      public String oyuncusilme(Long id){          // oyuncu silme
        Optional<Barcelona> barcelona=barcelonaRepository.findById(id);
        if (barcelona.isPresent()){
             barcelonaRepository.deleteById(id);
             return "Oyuncu silindi";
        }
        else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
      }

}
