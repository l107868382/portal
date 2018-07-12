package com.code.portal.app.controller.sys;

import com.code.portal.app.framework.constant.GlobalConstant;
import com.code.portal.app.pageModel.base.SessionInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class IndexController {


    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(GlobalConstant.SESSION_INFO);
        if ((sessionInfo != null) && (sessionInfo.getId() != null)) {
            return "/index";
        }
        return "/index";
    }
}
