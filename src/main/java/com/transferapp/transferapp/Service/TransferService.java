package com.transferapp.transferapp.Service;

import com.transferapp.transferapp.Entity.BayernMunich;

public interface TransferService  {
    public String transferBarcelonaBayern(Long id);
    public String transferBarcelonaReal(Long id);
    public String transferBarcelonaCity(Long id);
    public String transferBayernBarcelona(Long id);
    public String transferBayernManchester(Long id);
    public String transferBayernReal(Long id);
    public String transferManchesterBarcelona(Long id);
    public String transferManchesterBayern(Long id);
    public String transferManhesterReal(Long id);
    public String transferRealBarcelona(Long id);

    public String transferRealBayern(Long id);

    public String transferRealManchester(Long id);
}
