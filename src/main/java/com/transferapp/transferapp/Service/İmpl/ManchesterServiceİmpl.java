package com.transferapp.transferapp.Service.İmpl;

import com.transferapp.transferapp.Dto.ManchesterDto;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Entity.ManchesterCity;
import com.transferapp.transferapp.Entity.RealMadrid;
import com.transferapp.transferapp.Repository.ManchesterRepository;
import com.transferapp.transferapp.Service.ManchesterService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManchesterServiceİmpl implements ManchesterService {

    @Autowired
    private ManchesterRepository manchesterRepository;


    private String ordto(ManchesterCity manchesterCity, ManchesterDto manchesterDto) {  // DTO YU ÇEVİRİ İŞLEMİ
        manchesterCity.setName(manchesterDto.getName());
        manchesterCity.setSurname(manchesterDto.getSurname());
        manchesterCity.setNation(manchesterDto.getNation());
        manchesterCity.setTeam(manchesterDto.getTeam());
        manchesterCity.setAge(manchesterDto.getAge());
        manchesterCity.setPosition(manchesterDto.getPosition());
        manchesterCity.setTrasfervalue(manchesterDto.getTrasfervalue());

        manchesterRepository.save(manchesterCity);
        return "Oyuncu bilgileri eklendi";
    }


    @Override
    public String playersave(ManchesterDto manchesterDto) {
        ordto(new ManchesterCity(),manchesterDto);
        return "oyuncu bilgileri kaydedildi";
    }

    @Override
    public ManchesterCity getbyid(Long id) {
        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        if (manchesterCity.isPresent()) {
            return manchesterCity.get();
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }

    @Override
    public List<ManchesterCity> allplayers() {
        return manchesterRepository.findAll();
    }

    @Override
    public String updateplayer(Long id, ManchesterDto manchesterDto) {

        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        if (manchesterCity.isPresent()) {
            return ordto(manchesterCity.get(), manchesterDto);
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }

    @Override
    public String oyuncusilme(Long id) {
        Optional<ManchesterCity> manchesterCity = manchesterRepository.findById(id);
        if (manchesterCity.isPresent()) {
            manchesterRepository.deleteById(id);
            return "Oyuncu silindi";
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }
}

