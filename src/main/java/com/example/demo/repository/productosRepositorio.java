package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Productos;


@RepositoryRestResource
public interface productosRepositorio extends JpaRepository<Productos,Long>{

}

