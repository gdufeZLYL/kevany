package com.gdufeZLYL.kevany.mapper;

import com.gdufeZLYL.kevany.config.MapperModel;
import com.gdufeZLYL.kevany.entity.Autoplans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/20 17:55
 */
@Component
@Mapper
public interface AutoplansMapper extends MapperModel{

    int deleteByPrimaryKey(@Param("planId") int planId);

    int insert(@Param("autoplans") Autoplans autoplans);

    int insertSelective(@Param("autoplans") Autoplans autoplans);
}
