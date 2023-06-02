package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// @Controller <- 어차피 이 방식만 쓰긴 함
@Component
// 클래스 레벨에 있으면 Spring Bean으로 들어감
@RequestMapping
public class SpringMemberFormControllerV1 {
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
