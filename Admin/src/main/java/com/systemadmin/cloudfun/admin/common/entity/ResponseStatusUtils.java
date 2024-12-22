package com.systemadmin.cloudfun.admin.common.entity;

import com.systemadmin.cloudfun.admin.common.consts.CloudConts;

import java.util.Objects;

public class ResponseStatusUtils {
    public static ResponseStatus createSuccessResponse(String message, Object body) {
        return new ResponseStatus(message, CloudConts.SUCCESS_RESPONSE, body);
    }
    public static ResponseStatus createFasilureResponse(String message, Object body) {
        return new ResponseStatus(message, CloudConts.FAILURE_RESPONSE, body);
    }
}
