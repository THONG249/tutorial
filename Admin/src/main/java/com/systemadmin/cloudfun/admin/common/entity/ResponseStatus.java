package com.systemadmin.cloudfun.admin.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStatus<T> {
    private String message;
    private String status;
    private T body;
}
