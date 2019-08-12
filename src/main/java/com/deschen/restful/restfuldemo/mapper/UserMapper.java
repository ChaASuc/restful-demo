package com.deschen.restful.restfuldemo.mapper;

import com.deschen.restful.restfuldemo.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author deschen
 * @Create 2019/8/11
 * @Description
 * @Since 1.0.0
 */
@Repository
public interface UserMapper extends Mapper<User> {

}
