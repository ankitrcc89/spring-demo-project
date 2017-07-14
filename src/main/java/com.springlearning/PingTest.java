package com.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingTest {

    @Autowired private TextEditor te;
    @RequestMapping(value = "ankit", method = RequestMethod.GET)
    @ResponseBody
    public String pinge() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//
//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        MyClass mc = (MyClass) context.getBean("myClass");
//        mc.print();
        te.spellCheck();
        return "ponge";
    }
//    @RequestMapping( method = RequestMethod.GET)
//    public String pinge() {
//        return "pong";
//    }

    @RequestMapping(value = "ping", method = RequestMethod.GET)
    @ResponseBody
    public String ping() {
        return "pong";
    }
}
