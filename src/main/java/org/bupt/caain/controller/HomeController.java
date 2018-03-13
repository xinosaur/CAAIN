package org.bupt.caain.controller;

import org.bupt.caain.pojo.vo.HomeTreeAwardVO;
import org.bupt.caain.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "entries", method = RequestMethod.GET)
    public @ResponseBody
    List<HomeTreeAwardVO> getEntriesTree() {
        List<HomeTreeAwardVO> entriesTree = homeService.getEntriesTree();
        return entriesTree;
    }

}