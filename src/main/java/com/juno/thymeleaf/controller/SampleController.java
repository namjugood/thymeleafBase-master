package com.juno.thymeleaf.controller;

import com.juno.thymeleaf.dto.SampleDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @GetMapping({"/ex1"})
    public void ex1(Model model) {
        log.info("ex1.................");

        // return "sample/ex1";을 없이 @GetMapping일 경우, 응답할 템플릿을 같은경로에 있는 지 체크. 시작 경로 : templates
        // -> Controller 단순화
    }

    @GetMapping({"/ex2"})
    public void exModel(Model model) {
        log.info("ex2.................");
        List<SampleDTO> list = IntStream.rangeClosed(1, 20).asLongStream().mapToObj(i -> {
            SampleDTO dto = SampleDTO.builder()
                    .sno(i)
                    .first("First.." + i)
                    .last("Last.." + i)
                    .regTime(LocalDateTime.now())
                    .build();
            return dto;
        }).collect(Collectors.toList());

        model.addAttribute("list", list);
        // return "sample/ex2";을 없이 @GetMapping일 경우, 응답할 템플릿을 같은경로에 있는 지 체크. 시작 경로 : templates
        // -> Controller 단순화
    }

    @GetMapping("/admin/{indexType}")
    public void adminIndex(@PathVariable("indexType") String indexType) {
        log.info("/admin/indexType : " + indexType);
    }

    @GetMapping("/admin/pages/{menu1}")
    public void adminPagesMenu1(@PathVariable("menu1") String menu1) {
        log.info("/admin/pages/menu1 : " + menu1);
    }

    @GetMapping("/admin/pages/{menu1}/{menu2}")
    public void adminPagesMenu2(@PathVariable("menu1") String menu1, @PathVariable("menu2") String menu2) {
        log.info("/admin/pages/menu1 : " + menu1);
        log.info("/admin/pages/" + menu1 + "/menu2 : " + menu2);
    }

    @GetMapping("/loginForm/login1")
    public void login1() {}

    @GetMapping("/loginForm/login2")
    public void login2() {}

    @GetMapping("/loginForm/login3")
    public void login3() {}

    @GetMapping("/loginForm/login4")
    public void login4() {}

    @GetMapping("/loginForm/login5")
    public void login5() {}

    @GetMapping("/loginForm/login6")
    public void login6() {}

    @GetMapping("/loginForm/login7")
    public void login7() {}

    @GetMapping("/loginForm/login8")
    public void login8() {}

}