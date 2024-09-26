package com.transferapp.transferapp.Controller;

import com.transferapp.transferapp.Dto.BarcelonaDto;
import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Service.BarcelonaService;
import com.transferapp.transferapp.Service.ManchesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barcelona")
public class BarcelonaController {

    @Autowired
    private BarcelonaService barcelonaService;

    @PostMapping("save")
    public ResponseEntity<String> oyuncuekle(@RequestBody @Valid BarcelonaDto barcelonaDto){
        barcelonaService.playersave(barcelonaDto);
        return new ResponseEntity<>("oyuncu eklendi", HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Barcelona> getbyid(@PathVariable Long id){
        Barcelona barcelona = barcelonaService.getbyid(id);
        return new ResponseEntity<>(barcelona,HttpStatus.OK);
    }


    @GetMapping("all")
    public ResponseEntity<List<Barcelona>> all (){
       List<Barcelona> list = barcelonaService.allplayers();
       return new ResponseEntity<>(list,HttpStatus.OK);
    }

     @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteplayer(@PathVariable Long id){
        barcelonaService.oyuncusilme(id);
        return new ResponseEntity<>("oyuncu bilgileri silindi",HttpStatus.OK);
     }


}
