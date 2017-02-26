package com.soli;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by solitude on 2017/2/26.
 */
public interface GrilRepository extends JpaRepository<Gril,Integer> {
    //根据年龄来查询女生的列表
    public List<Gril> findByAge(Integer age);
}
