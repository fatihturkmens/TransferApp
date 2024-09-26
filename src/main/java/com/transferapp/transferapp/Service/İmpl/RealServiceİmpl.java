package com.transferapp.transferapp.Service.İmpl;

import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Dto.RealDto;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Entity.RealMadrid;
import com.transferapp.transferapp.Repository.RealRepository;
import com.transferapp.transferapp.Service.RealService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RealServiceİmpl implements RealService {

    @Autowired
    private RealRepository realRepository;

    private String ordto(RealMadrid realMadrid, RealDto realDto) {  // DTO YU ÇEVİRİ İŞLEMİ
        realMadrid.setName(realDto.getName());
        realMadrid.setSurname(realDto.getSurname());
        realMadrid.setNation(realDto.getNation());
        realMadrid.setTeam(realDto.getTeam());
        realMadrid.setAge(realDto.getAge());
        realMadrid.setPosition(realDto.getPosition());
        realMadrid.setTrasfervalue(realDto.getTrasfervalue());

        realRepository.save(realMadrid);
        return "Oyuncu bilgileri eklendi";

    }

    @Override
    public String playersave(RealDto realDto) {

        ordto(new RealMadrid(),realDto);
        return "Oyuncu bilgileri eklendi";
    }

    @Override
    public RealMadrid getbyid(Long id) {
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        if (realMadrid.isPresent()) {
            return realMadrid.get();
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }    }

    @Override
    public List<RealMadrid> allplayers() {
        return realRepository.findAll();
    }

    @Override
    public String updateplayer(Long id, RealDto realDto) {
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        if (realMadrid.isPresent()) {
            return ordto(realMadrid.get(),realDto);
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }

    @Override
    public String oyuncusilme(Long id) {
        Optional<RealMadrid> realMadrid = realRepository.findById(id);
        if (realMadrid.isPresent()) {
            realRepository.deleteById(id);
            return "Oyuncu silindi";
        } else {
            throw new EntityNotFoundException("Oyuncu bulunamadı");
        }
    }    }

