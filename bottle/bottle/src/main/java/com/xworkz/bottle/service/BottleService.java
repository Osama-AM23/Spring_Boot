package com.xworkz.bottle.service;

import com.xworkz.bottle.dto.BottleDto;
import com.xworkz.bottle.entity.BottleEntity;

import java.util.List;

public interface BottleService {

    BottleEntity save(BottleDto bottleDto);

    List<BottleEntity> getAll();

    BottleEntity getById(Integer id);

    BottleEntity update(BottleDto bottleDto);

    void deleteById(Integer id);
}
