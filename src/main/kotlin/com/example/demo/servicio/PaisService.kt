package com.example.demo.servicio

import com.example.demo.dto.PaisDTO

interface PaisService {
    fun findAll(): List<PaisDTO>
    fun findById(id: Long): PaisDTO
    fun save(dto: PaisDTO): PaisDTO
    fun update(id: Long, dto: PaisDTO): PaisDTO
    fun delete(id: Long)
}