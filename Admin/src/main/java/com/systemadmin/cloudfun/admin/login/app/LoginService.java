package com.systemadmin.cloudfun.admin.login.app;

import com.systemadmin.cloudfun.admin.common.entity.ResponseStatus;
import com.systemadmin.cloudfun.admin.login.entity.UserVO;

import java.util.List;
import java.util.Optional;

public interface LoginService {
    List<UserVO> getAllUsers();
    Optional<UserVO> findByEmail(String email);
    ResponseStatus addUser(UserVO user);
}
