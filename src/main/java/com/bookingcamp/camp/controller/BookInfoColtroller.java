package com.bookingcamp.camp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class BookInfoColtroller {

    private final com.bookingcamp.camp.repository.BookInfoRepository BookInfoRepository;

    @GetMapping("searchBookInfo")
    public String searchCampCalendar() {
        return BookInfoRepository.searchBookInfo().toString();
    }

}
