package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "ahihi";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this page";
    }

    @GetMapping("/admin")
    public String AdminPage() {
        return "only admin can access this page";
    }
}
