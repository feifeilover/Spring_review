package com.lfeifei.controller;

import com.lfeifei.pojo.Page;
import com.lfeifei.pojo.User;
import com.lfeifei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/23 22:08
 * @Deprecated
 */
@Controller
public class SearchController {

    @Autowired
    private UserService service;

    @GetMapping("/search.do")
    public ModelAndView doSearch(String compo, String ttt, String inputText, Integer p, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.jsp");
        int currPage = 1;
        int pageSize = 3;

        /**说明以下是一个搜索*/
        if("yes".equals(ttt)) {
            Map<String,String> arr = new HashMap<>(2);
            arr.put("compo", compo);
            arr.put("inputText",inputText);
            System.out.println("arr" + arr);

            session.setAttribute("arr", arr);
        } else {
            if(p != null) {
                currPage = p;
                Map<String,String> m = (Map<String, String>) session.getAttribute("arr");
                compo = m.get("compo");
                inputText = m.get("inputText");
            }
        }

        Page<User> paging ;
        if(compo != null && inputText != null ) {
            paging  = service.search(compo, inputText, currPage, pageSize);

        }else{
            paging = service.search("name", "", currPage, pageSize);
        }
        mv.addObject("paging",paging);

        return mv;
    }
}
