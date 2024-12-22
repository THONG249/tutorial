package com.systemadmin.cloudfun.admin.login.mapper;

import com.systemadmin.cloudfun.admin.login.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface LoginMapper {
    List<UserVO> getListUsers();
    Optional<UserVO> findByEmail(@Param("email") String email);
    UserVO saveUser(UserVO vo);
}
