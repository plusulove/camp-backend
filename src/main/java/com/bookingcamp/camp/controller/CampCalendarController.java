package com.bookingcamp.camp.controller;

import com.bookingcamp.camp.entity.CampCalendarEntity;
import com.bookingcamp.camp.repository.CampCalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class CampCalendarController {

    private final CampCalendarRepository CampCalendarRepository;

    @GetMapping("searchCampCalendar")
    public String searchCampCalendar(@RequestParam(value = "name") String name) {
        return CampCalendarRepository.searchCampCalendar(name).toString();
    }

    @GetMapping("searchCampCalendarAll")
    public List<CampCalendarEntity> searchCampCalendarAll() {
        return CampCalendarRepository.searchCampCalendarAll();
    }

}
