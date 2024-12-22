package com.systemadmin.cloudfun.admin.login.rest;

import com.systemadmin.cloudfun.admin.common.consts.CloudConts;
import com.systemadmin.cloudfun.admin.login.app.LoginService;
import com.systemadmin.cloudfun.admin.login.entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CloudConts.REST_URL + "/user")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/getAll")
    public ResponseEntity<UserVO> getListUsers() {
        return ResponseEntity.ok(loginService.getAllUsers().get(20));
    }
}