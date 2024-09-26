package com.transferapp.transferapp.Service;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.BayernMunich;

import java.util.List;

public interface BarcelonaService {
    public String playersave(BarcelonaDto barcelonaDto);
    public Barcelona getbyid(Long id);
    public List<Barcelona> allplayers();
    public String updateplayer(Long id ,BarcelonaDto barcelonaDto);
    public String oyuncusilme(Long id);

}
