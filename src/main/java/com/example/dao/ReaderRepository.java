package com.example.dao;

import com.example.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by longkeyu on 2017/1/1.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
