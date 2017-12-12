/**
 * 
 */
package com.silalahi.valentinus.angularspring.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author valentinusilalahi
 *
 */

@Component
public class CorsFilter extends OncePerRequestFilter {
	
	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain filterChain)
			throws ServletException, IOException {
			resp.setHeader("Access-Control-Allow-Origin", "*");
			resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "authorization, content-type, xsrf-token, Cache-Control");
			resp.addHeader("Access-Control-Expose-Headers", "xsrf-token");
			if("OPTIONS".equals(req.getMethod())){
				resp.setStatus(HttpServletResponse.SC_OK);
			} else{
				filterChain.doFilter(req, resp);
			}
	}

}
