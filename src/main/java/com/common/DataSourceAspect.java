package com.common;

import com.dao.ShopDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.dao.*.*(..))")
    public void declareJointPointExpression() {
    }
    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point){
        //连接点所属的类实例是ShopDao
        if(point.getTarget() instanceof ShopDao){
            DatabasesContextHolder.setDatabaseType(DatabaseType.databases);
        }else{//连接点所属的类实例是UserDao（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
            DatabasesContextHolder.setDatabaseType(DatabaseType.databases2);
        }
    }

//    @Around("execution(* com.xxx.firstboot.dao.*.*(..))")
//    public Object setDataSourceKeyByAround(ProceedingJoinPoint point) throws Throwable{
//        if(point.getTarget() instanceof ShopDao){
//            DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb2);
//        }else{//连接点所属的类实例是UserDao（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
//            DatabaseContextHolder.setDatabaseType(DatabaseType.mytestdb);
//        }
//        return point.proceed();//执行目标方法
//    }
}
