package com.xworkz.bottle.repository;

import com.xworkz.bottle.entity.BottleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleRepository extends JpaRepository<BottleEntity, Integer> {
}
