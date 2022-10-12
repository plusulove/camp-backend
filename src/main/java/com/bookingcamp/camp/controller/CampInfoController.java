package com.bookingcamp.camp.controller;

import com.bookingcamp.camp.entity.CampInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class CampInfoController {

    private final com.bookingcamp.camp.repository.CampInfoRepository CampInfoRepository;

    @GetMapping("searchCampInfo")
    public String searchCampCalendar(@RequestParam(value = "name") String name) {
        return CampInfoRepository.searchCampInfo(name).toString();
    }

    @GetMapping("searchCampInfoAll")
    public List<CampInfoEntity> searchCampInfoAll() {
        return CampInfoRepository.searchCampInfoAll();
    }

}
