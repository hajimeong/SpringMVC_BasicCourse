package hello.servlet.web.frontcontroller.v1;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//다형성을 사용할 것임 -> interface
public interface ControllerV1 {
    //회원 폼 컨트롤러
    //회원 저장 컨트롤러
    //회원 리스트 컨트롤러
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
