package com.maven.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	private static Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);
     
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	//logLevel Info 일때만 수행
        if (log.isInfoEnabled()) {
            log.info("======================================          START         ======================================");
            log.info(" Request URI \t:  " + request.getRequestURI());
        }
        return super.preHandle(request, response, handler);
    }
     
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception {
    	//logLevel Info 일때만 수행    	
        if (log.isInfoEnabled()) {
            log.info("======================================           END          ======================================\n");
        }
    }
}