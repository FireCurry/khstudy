package com.khgroup.khstudy.sql.model.service;

import com.khgroup.khstudy.sql.model.dto.World;
import com.khgroup.khstudy.sql.model.mapper.SqlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SqlServiceImpl implements SqlService{

    private final SqlMapper mapper;


    @Override
    public List<World> getAllWorld() {
        return mapper.getAllWorld();
    }
}
