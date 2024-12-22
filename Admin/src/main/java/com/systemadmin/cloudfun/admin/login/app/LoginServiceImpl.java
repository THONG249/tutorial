package com.systemadmin.cloudfun.admin.login.app;

import com.systemadmin.cloudfun.admin.common.consts.CloudConts;
import com.systemadmin.cloudfun.admin.common.entity.ResponseStatus;
import com.systemadmin.cloudfun.admin.common.entity.ResponseStatusUtils;
import com.systemadmin.cloudfun.admin.login.entity.UserVO;
import com.systemadmin.cloudfun.admin.login.mapper.LoginMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{
    private LoginMapper loginMapper;
    @Override
    public List<UserVO> getAllUsers() {
        return loginMapper.getListUsers();
    }

    @Override
    public Optional<UserVO> findByEmail(String email) {
        return loginMapper.findByEmail(email);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseStatus addUser(UserVO user) {
        if (Objects.isNull(user)) {
            return ResponseStatusUtils.createFasilureResponse(CloudConts.REGISTER_FAILURE,null);
        } else {
            final String userId = CloudConts.PROJECT_ID_PREFIX + RandomGenerator.getDefault().toString().toLowerCase();
            if (user.getId() == null) {
                /*1. Nếu id không truyền nên từ front end => insert*/
                user.setId(userId);
                UserVO vo = loginMapper.saveUser(user);
                return ResponseStatusUtils.createSuccessResponse(CloudConts.CREATE, vo);
            } else
            {
                /*1. Nếu id tồn tại truyền nên từ front end => update*/
                UserVO vo = loginMapper.saveUser(user);
                return ResponseStatusUtils.createSuccessResponse(CloudConts.CREATE, vo);
            }

        }

    }
}
