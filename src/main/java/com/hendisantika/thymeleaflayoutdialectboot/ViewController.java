package com.hendisantika.thymeleaflayoutdialectboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : thymeleaf-layout-dialect-boot
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/12/17
 * Time: 18.19
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class ViewController {
    @GetMapping
    public String page1() {
        return "page1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";
    }
}
