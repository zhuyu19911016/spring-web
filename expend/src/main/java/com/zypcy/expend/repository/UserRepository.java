package com.zypcy.expend.repository;

import com.zypcy.expend.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User , Integer> {

    /**
     * 由JPA自动根据方法名生成查询sql
     * @param id
     * @return
     */
    User findById(int id);

    User findByName(String name);

    void deleteById(int id);

    /**
     * 自定义sql
     * @return
     */
    @Modifying
    @Query(value = "select * from user",nativeQuery = true)
    List<User> findAll();

}
