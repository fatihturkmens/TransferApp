package com.transferapp.transferapp.Repository;

import com.transferapp.transferapp.Entity.BayernMunich;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BayernRepository extends JpaRepository<BayernMunich,Long> {
}
