package com.transferapp.transferapp.Repository;

import com.transferapp.transferapp.Entity.RealMadrid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealRepository extends JpaRepository<RealMadrid,Long> {
}
