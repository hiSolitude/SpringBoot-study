package com.soli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by solitude on 2017/2/23.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(name = "girl" ,method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize()+"----------"+girlProperties.getAge();
    }

}
