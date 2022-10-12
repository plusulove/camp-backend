package com.bookingcamp.camp.controller;

import com.bookingcamp.camp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class UserController {
    private final UserRepository UserRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @GetMapping("search")
    public String searchAllMember() {
        return UserRepository.findAll().toString();
    }
    @GetMapping("searchUser")
    public String searchUser(@RequestParam(value = "name") String name) {
        return UserRepository.searchUser(name).toString();
    }

//    @GetMapping("update")
//    public String updateMember(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password) {
//        if(UserRepository.findById(name).isEmpty()) { // 값 존재여부 확인
//            return "입력한 " + name + "이 존재하지 않습니다";
//        } else {
//            UserRepository.save(User.builder().name(name).password(password).build());
//            return name + "의 password 변경 완료";
//        }
//    }
//
//    @GetMapping("delete")
//    public String deleteMember(@RequestParam(value = "name") String name) {
//        if(UserRepository.findById(name).isEmpty()) { // 값 존재여부 확인
//            return "입력한 " + name + "이 존재하지 않습니다";
//        } else {
//            UserRepository.delete(User entity = User.builder().name(name).build());
//            return name + " 삭제 완료";
//        }
//    }
//
//    @GetMapping("insert")
//    public String insertMember(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password) {
//        if(UserRepository.findById(name).isPresent()) {
//            return "동일한 이름이 이미 있습니다";
//        } else {
//            User entity = User.builder().name(name).password(password).build();
//            UserRepository.save(entity);
//            return "이름 : " + name + '이 추가 되었습니다";
//        }
//    }


//    @GetMapping("searchParam")
//    public String searchParamMember(@RequestParam(value = "age") int age) {
//        List resultList = entityManager.createQuery("select name from user where age > :age")
//                .setParameter("age", age)
//                .getResultList();
//        return resultList.toString();
//    }

}