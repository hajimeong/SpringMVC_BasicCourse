package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private String viewName;
    //model에다가 원하는 데이터를 넣어두면 나중에 꺼내서 jsp에서 쓸 수 있도록
    private Map<String, Object> model=new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    public String getViewName() {
        return viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
