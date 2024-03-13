package com.khgroup.khstudy.sql.model.mapper;

import com.khgroup.khstudy.sql.model.dto.World;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SqlMapper {

    List<World> getAllWorld();
}
