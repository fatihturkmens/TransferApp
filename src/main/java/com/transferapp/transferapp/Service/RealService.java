package com.transferapp.transferapp.Service;

import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Dto.RealDto;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Entity.RealMadrid;

import java.util.List;

public interface RealService {
    public String playersave(RealDto realDto);
    public RealMadrid getbyid(Long id);
    public List<RealMadrid> allplayers();
    public String updateplayer(Long id ,RealDto realDto);
    public String oyuncusilme(Long id);
}
