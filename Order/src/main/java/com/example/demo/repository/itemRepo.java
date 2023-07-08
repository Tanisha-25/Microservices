package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LineItems;

public interface itemRepo extends JpaRepository<LineItems,Integer> {

}
