package com.gdufeZLYL.kevany.test;

import com.gdufeZLYL.kevany.config.KeSqlSessionFactory;
import com.gdufeZLYL.kevany.entity.Autoplans;
import com.gdufeZLYL.kevany.mapper.AutoplansMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/20 20:35
 */
public class TestMapper {
    private static final Logger logger = LoggerFactory.getLogger(TestMapper.class);
    private static final String TEST_ENV = "TEST_ENV";

    public static void main(String[] args) {
//        AutoplansMapper autoplansMapper = MapperFactory.createMapper(AutoplansMapper.class,
//                TEST_ENV);
//        Autoplans autoplans = new Autoplans();
//        autoplans.setType(1);
//        autoplans.setName("自动化计划1");
//        autoplans.setRelateProjId(0);
//        autoplans.setDescription("描述");
//        autoplans.setContent("parall");
//        autoplans.setMailall(1);
//        autoplans.setAgentType(2);
//        autoplans.setIstmp(0);
//        int  res = autoplansMapper.insertSelective(autoplans);
//        logger.info("res = {}", res);

        SqlSessionFactory sqlSessionFactory = KeSqlSessionFactory.getSqlSessionFactory("TEST_ENV");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AutoplansMapper autoplansMapper = sqlSession.getMapper(AutoplansMapper.class);
        Autoplans autoplans = new Autoplans();
        autoplans.setType(1);
        autoplans.setName("自动化计划2");
        autoplans.setRelateProjId(0);
        autoplans.setDescription("描述");
        autoplans.setContent("parall");
        autoplans.setMailall(1);
        autoplans.setAgentType(2);
        autoplans.setIstmp(0);
        int  res = autoplansMapper.insertSelective(autoplans);
        sqlSession.commit();
        sqlSession.close();
        logger.info("res = {}", res);
    }
}
