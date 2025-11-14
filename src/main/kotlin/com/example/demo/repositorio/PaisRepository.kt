package com.example.demo.repositorio

import com.example.demo.dominio.Pais
import org.springframework.data.jpa.repository.JpaRepository

interface PaisRepository : JpaRepository<Pais, Long>