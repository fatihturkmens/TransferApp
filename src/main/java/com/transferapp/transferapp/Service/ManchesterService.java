package com.transferapp.transferapp.Service;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Dto.ManchesterDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Entity.ManchesterCity;

import java.util.List;

public interface ManchesterService {
    public String playersave(ManchesterDto manchesterDto);
    public ManchesterCity getbyid(Long id);
    public List<ManchesterCity> allplayers();
    public String updateplayer(Long id ,ManchesterDto manchesterDto);
    public String oyuncusilme(Long id);
}
