package com.soli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by solitude on 2017/2/26.
 *
 * 获取数据库中的数据
 */
@RestController
public class GirlController1 {

    @Autowired
    private GrilRepository grilRepository;

    /**
     * 获取数据库中全部的gril
     * */
    @GetMapping("/grilS")
    public List<Gril> getList(){
        return grilRepository.findAll();
    }

    @PostMapping("/grils")
    public Gril getGril(@RequestParam("id") Integer id){
        return grilRepository.findOne(id);
    }

   /* @PostMapping("/grils/{id}")
    public Gril getGril(@PathVariable("id") Integer id){
        return grilRepository.findOne(id);
    }*/

    @PostMapping("/grils")
    public Gril grilAdd(@RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age,
                         @RequestParam("name") String name){
        Gril gril = new Gril();
        gril.setName(name);
        gril.setAge(age);
        gril.setCupSize(cupSize);
        return grilRepository.save(gril);
    }

    //更新
    @PutMapping("/grils")
    public Gril updateGril(@RequestParam("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age,
                           @RequestParam("name") String name){
        Gril gril = new Gril();
        gril.setId(id);
        gril.setAge(age);
        gril.setCupSize(cupSize);
        gril.setName(name);

        return grilRepository.save(gril);
    }


    @DeleteMapping("/grils/{id}")
    public void deleteGril(@RequestParam("id") Integer id){
        grilRepository.delete(id);
    }

    //根据年龄查询
    @GetMapping("/grils/age/{age}")
    public List<Gril> findByAge(@RequestParam("age") Integer age){
        return grilRepository.findByAge(age);
    }
}
