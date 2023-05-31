package com.example.ooad.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Principal;
import java.util.List;


import com.example.ooad.entity.AppUser;
import com.example.ooad.util.WebUtils;
import org.eclipse.birt.report.engine.api.EngineException;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;


@Controller
public class MainController {

//    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
//    public String welcomePage(Model model) {
//        model.addAttribute("title", "Welcome");
//        model.addAttribute("message", "This is welcome page!");
//        return "welcomePage";
//    }

//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public String adminPage(Model model, Principal principal) {
//
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//        String userInfo = WebUtils.toString(loginedUser);
//        model.addAttribute("userInfo", userInfo);
//
//        return "adminPage";
//    }

    @GetMapping(value="/exportFile")
    public String exportFile() throws EngineException {
//        ExecuteReport executeReport =new ExecuteReport();
//        executeReport.executeReport();
        System.out.println("howww");
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "loginPage";
    }

    @RequestMapping(value = "/vieclam", method = RequestMethod.GET)
    public String Vieclam(Model model) {

        return "vieclam";
    }


    @GetMapping(value = "/newcheck")
    public String e() {

        return "newcheck";
    }


    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public String export(Model model) {

        return "export";
    }



    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }



//        public void defaultAfterLogin(HttpServletRequest request, HttpServletResponse response)throws IOException {
//            if (request.isUserInRole("ROLE_ADMIN")) {
//                response.sendRedirect("http://localhost:5501/TopCV_Clone-main/topcv/admin.html");
//
//            }
//            response.sendRedirect("http://localhost:5501/TopCV_Clone-main/topcv/viec-lam-it.html");
//
//
//        }
    @GetMapping("/default")
    public RedirectView handleFoo(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_ADMIN")) {
            return new RedirectView("http://localhost:5501/TopCV_Clone-main/topcv/jobname.html");
//                response.sendRedirect("");

            }
        return new RedirectView("http://localhost:5501/TopCV_Clone-main/login/vieclam.html");
//            response.sendRedirect("");

    }




    @GetMapping("/example")
    public String examples(){
        return "example";
    }
//    @PostMapping("/user/registration")
//    public ModelAndView registerUserAccount(
//            @ModelAttribute("user") @Valid UserDto userDto,
//            HttpServletRequest request, Errors errors) {
//
//
//            User registered = userService.registerNewUserAccount(userDto);
//
//
//        return new ModelAndView("successRegister", "user", userDto);
//    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
//        System.out.println(userInfo);
        model.addAttribute("userInfo", userInfo);

        return "userInfoPage";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }

    @GetMapping("/dangky")
    public String showRegistrationForm(WebRequest request, Model model) {
        AppUser userDto = new AppUser();

//        model.addAttribute("user", userDto);
        return "dangky";
    }

}