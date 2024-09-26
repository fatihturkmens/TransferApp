package com.transferapp.transferapp.Controller;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Dto.BayernDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Service.BayernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bayern")
public class BayernController {

    @Autowired
    private BayernService bayernService;

    @PostMapping("save")
    public ResponseEntity<String> oyuncuekle(@RequestBody @Valid BayernDto bayernDto){
        bayernService.playersave(bayernDto);
        return new ResponseEntity<>("oyuncu eklendi", HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<BayernMunich> getbyid(@PathVariable Long id){
        BayernMunich bayernMunich = bayernService.getbyid(id);
        return new ResponseEntity<>(bayernMunich,HttpStatus.OK);
    }


    @GetMapping("all")
    public ResponseEntity<List<BayernMunich>> all (){
        List<BayernMunich> list = bayernService.allplayers();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteplayer(@PathVariable Long id){
        bayernService.oyuncusilme(id);
        return new ResponseEntity<>("oyuncu bilgileri silindi",HttpStatus.OK);
    }
}
