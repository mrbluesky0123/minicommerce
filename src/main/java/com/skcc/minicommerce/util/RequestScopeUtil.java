package com.skcc.minicommerce.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RequestScopeUtil extends WebUtils {

  /**
   *
   * @author hoTire
   * RequestAttributes.SCOPE_REQUEST / SCOPE_SESSION 객체의 생명주기
   * get / set / remove
   */

  public static Object getAttribute(String name) throws Exception {
    return (Object)RequestContextHolder.getRequestAttributes().
            getAttribute(name, RequestAttributes.SCOPE_SESSION);
  }

  public static void setAttribute(String name, Object object) throws Exception {
    RequestContextHolder.getRequestAttributes().
            setAttribute(name, object, RequestAttributes.SCOPE_REQUEST);
  }

  public static void removeAttribute(String name) throws Exception {
    RequestContextHolder.getRequestAttributes().
            removeAttribute(name, RequestAttributes.SCOPE_REQUEST);
  }

  /**
   *
   * @author hoTire
   * Request 얻어오기
   */
  public static HttpServletRequest getCurrentRequest(){
    return ((ServletRequestAttributes)RequestContextHolder.
            currentRequestAttributes()).getRequest();
  }



  /**
   *
   * @author hoTire
   * 세션 얻어오기
   */
  public static HttpSession getSession(){
    return ((ServletRequestAttributes)RequestContextHolder.
            getRequestAttributes()).getRequest().getSession();
  }

}