package com.xworkz.bottle.service;

import com.xworkz.bottle.dto.BottleDto;
import com.xworkz.bottle.entity.BottleEntity;
import com.xworkz.bottle.repository.BottleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleServiceImpl implements BottleService {

    @Autowired
    private BottleRepository bottleRepository;

    @Override
    public BottleEntity save(BottleDto bottleDto) {
        BottleEntity bottleEntity = new BottleEntity();
        BeanUtils.copyProperties(bottleDto, bottleEntity);
        System.out.println("SERVICE :: " + bottleEntity);
        return bottleRepository.save(bottleEntity);
    }

    @Override
    public List<BottleEntity> getAll() {

        return bottleRepository.findAll();
    }

    @Override
    public BottleEntity getById(Integer id) {
        return bottleRepository.findById(id).orElse(null);
    }

    @Override
    public BottleEntity update(BottleDto bottleDto) {
        BottleEntity entity = bottleRepository.findById(bottleDto.getId()).orElse(null);

        entity.setBrand(bottleDto.getBrand());
        entity.setBottleQuantity(bottleDto.getBottleQuantity());
        entity.setPrice(bottleDto.getPrice());

        return bottleRepository.save(entity);

    }

    @Override
    public void deleteById(Integer id) {
        bottleRepository.deleteById(id);
    }

}
