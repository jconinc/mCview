package com.lsc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Optional;

@Controller
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal) {
        return "index";
    }

    @RequestMapping(value = "/cview/search", method = RequestMethod.GET)
    public String cviewSearch() {
        return "cview/search";
    }

    @RequestMapping(value = "/privacy", method = RequestMethod.GET)
    public String privacy(Principal principal) {
        return "privacy";
    }

    @CrossOrigin(origins = {"http://localhost:3001"}, allowCredentials = "true")
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String account() {
        return "account";
    }

    @RequestMapping(value = "/organizations", method = RequestMethod.GET)
    public String organizations() {
        return "organizations";
    }

    @RequestMapping(value = "/pricing", method = RequestMethod.GET)
    public String pricing() {
        return "pricing";
    }

    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String help() {
        return "help";
    }

    @CrossOrigin(origins = {"http://localhost:3001"}, allowCredentials = "true")
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, @RequestParam Optional<String> node) {
        String redirect = "";
        try {
            if (node.isPresent()) {
                redirect = "redirect:http://localhost:3001/logout";
            } else {
                redirect = "logout";
            }
            request.logout();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView(redirect);
    }

    @CrossOrigin(origins = {"http://localhost:3001"}, allowCredentials = "true")
    @RequestMapping(value = "/authenticated", method = RequestMethod.GET)
    public ModelAndView authenticated(Principal principal, @RequestParam Optional<String> node) {
        String redirect = "";
        try {
            if (node.isPresent()) {
                redirect = "redirect:http://localhost:3001/";
            } else {
                redirect = "index";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView(redirect);
    }

}
