package skytech.bank.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


    @RestController
    public class CookiesController {

        @RequestMapping("/testCookie")
        public String cs(HttpServletResponse response, HttpServletRequest request){
            response.addCookie(new Cookie("userName","ammu"));
            Cookie cookie=new Cookie("test","Pravali");
            cookie.setMaxAge(40);
            response.addCookie(cookie);
            return "cookies added successfully..";
        }
        @RequestMapping("/getCookie")
        public String cs2(HttpServletRequest request,HttpServletResponse response){
            List<Cookie> cookies= Arrays.stream(request.getCookies()).filter(cookie->cookie.getName().equals("userName")).collect(Collectors.toList());
            Cookie[] cookies1=request.getCookies();
            String testCookies=null;
            if(cookies1!= null){
                for(Cookie cookie:cookies1){
                    if(cookie.getName().equals("test")){
                        testCookies=cookie.getValue();
                    }
                }
            }
            return cookies.get(0).getValue()+testCookies;

        }

    }


