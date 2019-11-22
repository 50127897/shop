package com.shop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		HttpSession session = request.getSession();

		if(session.getAttribute("employee")==null
				&& request.getRequestURI().indexOf("/backstage/toLogin") == -1
				&& request.getRequestURI().indexOf("/backstage/login") == -1){
			// 没有登录

			response.sendRedirect(request.getContextPath()+"/backstage/toLogin");

		}else{
			// 已经登录，继续请求下一级资源（继续访问）
			chain.doFilter(req, resp);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
