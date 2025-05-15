package com.xworkz.bottle.controller;

import com.xworkz.bottle.dto.BottleDto;
import com.xworkz.bottle.entity.BottleEntity;
import com.xworkz.bottle.service.BottleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
public class BottleController {

    @Autowired
    private BottleService bottleService;


    @GetMapping("i")
    public String getPage(Model model) {
        model.addAttribute("getPage", new BottleDto());
        System.out.println("Getting the index page");
        return "index";
    }


    @PostMapping("/saving")
    public String save(@ModelAttribute BottleDto bottleDto) {
        BottleEntity bottleEntity = bottleService.save(bottleDto);
        System.out.println("CONTROLLER ::: " + bottleDto);
        System.out.println("Saved the data");
        return "redirect:/i";
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        List<BottleEntity> bottlesEntity = bottleService.getAll();
        model.addAttribute("Bottles", bottlesEntity);
        return "view";
    }

    @GetMapping("/update")
    public String update(@RequestParam Integer id, Model model) {
        BottleEntity updateBottle = bottleService.getById(id);
        model.addAttribute("get", updateBottle);
        return "updatePage";
    }

    @PostMapping("/update")
    public String updateDetails(@ModelAttribute BottleDto bottleDto, @RequestParam Integer id) {
        bottleService.update(bottleDto);
        return "redirect:/getAll";
    }

    @GetMapping("/delete")
    public String deleteDetail(@RequestParam Integer id) {
        bottleService.deleteById(id);
        return "redirect:/getAll";
    }
}
