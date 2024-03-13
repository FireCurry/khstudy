package com.khgroup.khstudy.sql.controller;

import com.khgroup.khstudy.sql.model.dto.World;
import com.khgroup.khstudy.sql.model.service.SqlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SqlController {

    private final SqlService service;

    @RequestMapping("/sqlTest")
    public String sqlPage(Model model){

        List<World> worldList = service.getAllWorld();
        System.out.println(worldList.toString());
        model.addAttribute("worldList", worldList);
        return "sql";
    }
}
