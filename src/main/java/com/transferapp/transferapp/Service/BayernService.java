package com.transferapp.transferapp.Service;

import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Entity.BayernMunich;

import java.util.List;

public interface BayernService {
    public String playersave(BayernDto bayernDto);
    public BayernMunich getbyid(Long id);
    public List<BayernMunich> allplayers();
    public String updateplayer(Long id ,BayernDto bayernDto);
    public String oyuncusilme(Long id);
}
