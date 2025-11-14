package com.example.demo.servicio

import com.example.demo.dto.PaisDTO
import com.example.demo.mapper.PaisMapper
import com.example.demo.repositorio.PaisRepository
import org.springframework.stereotype.Service

@Service
class PaisServiceImpl(
    private val repository: PaisRepository,
    private val mapper: PaisMapper
) : PaisService {

    override fun findAll(): List<PaisDTO> =
        repository.findAll().map { mapper.toDTO(it) }

    override fun findById(id: Long): PaisDTO =
        repository.findById(id).map { mapper.toDTO(it) }.orElseThrow()

    override fun save(dto: PaisDTO): PaisDTO {
        val entity = mapper.toEntity(dto)
        return mapper.toDTO(repository.save(entity))
    }

    override fun update(id: Long, dto: PaisDTO): PaisDTO {
        val existing = repository.findById(id).orElseThrow()
        val updated = dto.copy(id = existing.id)
        return save(updated)
    }

    override fun delete(id: Long) {
        repository.deleteById(id)
    }
}
