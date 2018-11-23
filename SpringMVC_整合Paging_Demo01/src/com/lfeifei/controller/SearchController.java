package com.lfeifei.controller;

import com.lfeifei.pojo.Paging;
import com.lfeifei.pojo.User;
import com.lfeifei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author :feifei
 * @date 2018/11/23 19:08
 * @Deprecated
 */
@Controller
public class SearchController {
    @Autowired
    private UserService service;

    @GetMapping("/search.do")
    public ModelAndView doSearch(String name,String ttt, Integer p,HttpSession session) {
        int currPage = 1;
        int pageSize = 3;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.jsp");
        if ("yes".equals(ttt)) {
            session.setAttribute("name", name);
        } else  {
            if(p != null) {currPage =  p;}
            name = (String)session.getAttribute("name");
        }

        if(name != null) {
            Paging<User> paging = service.search(name, currPage, pageSize);
            System.out.println("分页" + paging);
            mv.addObject("paging", paging);
        }
        return mv;
    }
}
