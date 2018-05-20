package com.common;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
public class DatabasesContextHolder {
    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DatabaseType type) {
        contextHolder.set(type);
    }

    public static DatabaseType getDatabaseType() {
        return contextHolder.get();
    }
}
