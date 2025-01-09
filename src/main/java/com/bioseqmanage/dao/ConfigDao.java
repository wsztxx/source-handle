package com.bioseqmanage.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bioseqmanage.entity.Config;

@Repository
public interface ConfigDao extends JpaRepository<Config, Integer> {

    Optional<Config> findById(int configId);

}
