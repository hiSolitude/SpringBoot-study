package com.soli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by solitude on 2017/2/26.
 */
@Service
public class GrilService {
    @Autowired
    private GrilRepository grilRepository;

    //Transactional为开启事务，如grilA成功插入，但是grilB不成功，则两个都不成功
    //在两条数据都成功插入的情况下，查看数据库是否有相应的限制条件
    @Transactional
    public void insertTwo(){
        Gril grilA = new Gril();
        grilA.setName("q");
        grilA.setCupSize("B");
        grilA.setAge(19);
        grilRepository.save(grilA);

        Gril grilB = new Gril();
        grilB.setAge(20);
        grilB.setCupSize("CCC");
        grilB.setName("w");
        grilRepository.save(grilB);
    }
}
