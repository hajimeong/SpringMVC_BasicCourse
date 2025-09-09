package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    //컨트롤러
    //1. 폼을 보여주고 싶음 ->jsp로 가주면 됨
    //고객의 요청이 오면 service가 호출이 됨. 그 다음 service가 jsp 경로를 호출
    //서버끼리 내부에서 호출

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath="/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher=request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
