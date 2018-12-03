package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor , Long>{
	Visitor findByIp(String ip);
}
