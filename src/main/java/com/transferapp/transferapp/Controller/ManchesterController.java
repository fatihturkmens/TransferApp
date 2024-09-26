package com.transferapp.transferapp.Controller;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Dto.ManchesterDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.ManchesterCity;
import com.transferapp.transferapp.Service.ManchesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class ManchesterController {

    @Autowired
    private ManchesterService manchesterService;

    @PostMapping("save")
    public ResponseEntity<String> oyuncuekle(@RequestBody @Valid ManchesterDto manchesterDto){
        manchesterService.playersave(manchesterDto);
        return new ResponseEntity<>("oyuncu eklendi", HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<ManchesterCity> getbyid(@PathVariable Long id){
        ManchesterCity manchesterCity = manchesterService.getbyid(id);
        return new ResponseEntity<>(manchesterCity,HttpStatus.OK);
    }


    @GetMapping("all")
    public ResponseEntity<List<ManchesterCity>> all (){
        List<ManchesterCity> list = manchesterService.allplayers();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteplayer(@PathVariable Long id){
        manchesterService.oyuncusilme(id);
        return new ResponseEntity<>("oyuncu bilgileri silindi",HttpStatus.OK);
    }
}
