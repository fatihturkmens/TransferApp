package com.transferapp.transferapp.Controller;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Dto.RealDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.RealMadrid;
import com.transferapp.transferapp.Service.RealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/real")
public class RealController {

    @Autowired
    private RealService realService;


    @PostMapping("save")
    public ResponseEntity<String> oyuncuekle(@RequestBody @Valid RealDto realDto){
        realService.playersave(realDto);
        return new ResponseEntity<>("oyuncu eklendi", HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<RealMadrid> getbyid(@PathVariable Long id){
        RealMadrid realMadrid = realService.getbyid(id);
        return new ResponseEntity<>(realMadrid,HttpStatus.OK);
    }


    @GetMapping("all")
    public ResponseEntity<List<RealMadrid>> all (){
        List<RealMadrid> list = realService.allplayers();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteplayer(@PathVariable Long id){
        realService.oyuncusilme(id);
        return new ResponseEntity<>("oyuncu bilgileri silindi",HttpStatus.OK);
    }

}
