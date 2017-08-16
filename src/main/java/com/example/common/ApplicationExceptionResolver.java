package com.example.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 * @author Chenjie
 * @Title: ApplicationExceptionResolver
 * @Package mall.shop.controller
 * @Description: 全局异常处理
 * @date 2017/8/16
 */
public class ApplicationExceptionResolver implements HandlerExceptionResolver {
    private final static Logger logger = LogManager.getLogger(ApplicationExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.error(ex.getMessage(), ex);

        return new ModelAndView("500");
    }
}
