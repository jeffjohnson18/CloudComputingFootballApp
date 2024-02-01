package com.football.Repository;

import org.springframework.data.repository.CrudRepository;

import com.football.entity.Quarterbacks;

public interface QuarterbackRepository extends CrudRepository<Quarterbacks, Integer>{
    
}
