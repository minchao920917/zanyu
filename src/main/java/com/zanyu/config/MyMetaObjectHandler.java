package com.zanyu.config;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final String CREATE_TIME = "createTime";
    private static final String UPDATE_TIME = "updateTime";

    @Override
    public void insertFill(MetaObject metaObject) {
        // 自动填入创建时间
        if (metaObject.hasGetter(CREATE_TIME)) {
            this.setFieldValByName(CREATE_TIME, LocalDateTime.now(),metaObject);
        }

        // 自动填入更新时间
        if (metaObject.hasGetter(UPDATE_TIME)) {
            this.setFieldValByName(UPDATE_TIME, LocalDateTime.now(),metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 自动填入更新时间
        if (metaObject.hasGetter(UPDATE_TIME)) {
            this.setFieldValByName(UPDATE_TIME, LocalDateTime.now(),metaObject);
        }
    }
}