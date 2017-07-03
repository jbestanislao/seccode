package com.asurion.seccode;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rey on 29/06/2017.
 */
public class XssController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {

        request.getSession(false);

        System.out.println("search:" + request.getParameter("search"));
        ModelAndView model = new ModelAndView("XssPage");
        model.addObject("result", request.getParameter("search"));
        Cookie cookie = new Cookie("sess","123456");
        cookie.setHttpOnly(true);

        response.addCookie(cookie);

        return model;
    }
}
