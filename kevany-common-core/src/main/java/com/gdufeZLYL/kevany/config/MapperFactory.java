package com.gdufeZLYL.kevany.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/20 23:44
 * MapperFactory 创建一个Mapper实例 mapper
 */
public final class MapperFactory {
    private static final Logger logger = LoggerFactory.getLogger(MapperFactory.class);

    /**
     * 通过datasource 创建一个Mapper 的实现类 mapper
     */
    @SuppressWarnings("unchecked")
    public static <T> T createMapper(Class<? extends MapperModel> clazz, String datasource) {
        SqlSessionFactory sqlSessionFactory = KeSqlSessionFactory.getSqlSessionFactory(datasource);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MapperModel mapper = sqlSession.getMapper(clazz);
        return (T) MapperProxy.bind(mapper, sqlSession);
    }

    /**
     * Mapper代理: 执行 mapper 方法和关闭 sqlSession
     */
    private static class MapperProxy implements InvocationHandler {
        private MapperModel mapper;
        private SqlSession sqlSession;

        private MapperProxy(MapperModel mapper, SqlSession sqlSession) {
            this.mapper = mapper;
            this.sqlSession = sqlSession;
        }

        @SuppressWarnings("unchecked")
        private static MapperModel bind(MapperModel mapper, SqlSession sqlSession) {
            return (MapperModel) Proxy.newProxyInstance(mapper.getClass().getClassLoader(),
                    mapper.getClass().getInterfaces(), new MapperProxy(mapper, sqlSession));
        }

        /**
         * 执行mapper方法并最终关闭sqlSession
         */
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object object = null;
            try {
                object = method.invoke(mapper, args);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            } finally {
                sqlSession.close();
            }
            return object;
        }
    }
}