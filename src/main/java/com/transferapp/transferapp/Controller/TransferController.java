package com.transferapp.transferapp.Controller;


import com.transferapp.transferapp.Entity.Barcelona;
import com.transferapp.transferapp.Entity.BayernMunich;
import com.transferapp.transferapp.Service.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;
    @Autowired
    private BarcelonaService barcelonaService;

    @Autowired
    private RealService realService;

    @Autowired
    private ManchesterService manchesterService;

    @Autowired
    private BayernService bayernService;


    @PostMapping("/barcelonabayern/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> barcelonaBayern(@PathVariable Long id){
     String transfer  =   transferService.transferBarcelonaBayern(id);
     return new ResponseEntity<>(transfer, HttpStatus.OK);

    }

    @PostMapping("/barcelonareal/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> barcelonaReal(@PathVariable Long id){
        String transfer  =   transferService.transferBarcelonaReal(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);

}

    @PostMapping("/barcelonacity/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> barcelonaCity(@PathVariable Long id){
        String transfer  =   transferService.transferBarcelonaCity(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
}
    @PostMapping("/bayernbarcelona/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> bayernBarcelona(@PathVariable Long id){
        String transfer  =   transferService.transferBayernBarcelona(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }

    @PostMapping("/bayerncity/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> bayernCity(@PathVariable Long id){
        String transfer  =   transferService.transferBayernManchester(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
    @PostMapping("/bayernreal/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> bayernReal(@PathVariable Long id){
        String transfer  =   transferService.transferBayernReal(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
    @PostMapping("/realbarcelona/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> realBarcelona(@PathVariable Long id){
        String transfer  =   transferService.transferRealBarcelona(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
    @PostMapping("/realcity/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> realCity(@PathVariable Long id){
        String transfer  =   transferService.transferRealManchester(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
    @PostMapping("/realbayern/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> realBayern(@PathVariable Long id){
        String transfer  =   transferService.transferRealBayern(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
    @PostMapping("/citybarcelona/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> cityBarcelona(@PathVariable Long id){
        String transfer  =   transferService.transferManchesterBarcelona(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }

    @PostMapping("/citybayern/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> cityBayern(@PathVariable Long id){
        String transfer  =   transferService.transferManchesterBayern(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }

    @PostMapping("/cityreal/{id}")            /// SEÇİLEN İD Lİ OYUNCUYU BARCELONADAN  SİLER ,BAYERNE TRANSFER EDİP EKLER.
    public ResponseEntity<String> cityReal(@PathVariable Long id){
        String transfer  =   transferService.transferManhesterReal(id);
        return new ResponseEntity<>(transfer, HttpStatus.OK);
    }
}
