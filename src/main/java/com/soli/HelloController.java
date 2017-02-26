package com.soli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by solitude on 2017/2/17.
 */
//@RestController
@Controller
public class HelloController {
    //使用注解@value 将yml文件中的cupSize、age、context注入到属性中
    //在yml文件中无需书写该属性的类型，只需要在创建该属性时，书写是什么类型即可
   /* @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${context}")
    private String context;*/

    //helloSpringBoot
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hello SpringBoot";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "test";
    }
   /* //打印yml文件中的cupSize
    @RequestMapping(value = "/cupSize",method = RequestMethod.GET)
    public String cupSize(){
        return cupSize;
    }


    //打印yml文件中的age
    @RequestMapping(value = "/age",method = RequestMethod.GET)
    public Integer age(){
        return age;
    }

    //打印yml文件中的context
    @RequestMapping(value = "/context",method = RequestMethod.GET)
    public String context(){
        return context;
    }*/
}
