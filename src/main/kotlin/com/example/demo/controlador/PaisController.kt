package com.example.demo.controlador

import com.example.demo.dto.PaisDTO
import com.example.demo.servicio.PaisService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/paises")
class PaisController(
    private val service: PaisService
) {

    @GetMapping
    fun getAll(): List<PaisDTO> = service.findAll()

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long): PaisDTO = service.findById(id)

    @PostMapping
    fun create(@RequestBody dto: PaisDTO): PaisDTO = service.save(dto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody dto: PaisDTO): PaisDTO =
        service.update(id, dto)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = service.delete(id)
}