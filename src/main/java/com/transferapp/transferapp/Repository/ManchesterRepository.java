package com.transferapp.transferapp.Repository;

import com.transferapp.transferapp.Entity.ManchesterCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManchesterRepository extends JpaRepository<ManchesterCity,Long> {
}
