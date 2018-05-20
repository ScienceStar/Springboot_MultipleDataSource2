package com.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatabasesContextHolder.getDatabaseType();
    }
}
