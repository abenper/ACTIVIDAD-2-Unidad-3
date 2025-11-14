package com.example.demo.mapper

import com.example.demo.dominio.Pais
import com.example.demo.dto.PaisDTO
import org.springframework.stereotype.Component

@Component
class PaisMapper {

    fun toDTO(pais: Pais): PaisDTO {
        return PaisDTO(
            id = pais.id,
            nombre = pais.nombre,
            codigoIso = pais.codigoIso,
            capital = pais.capital,
            poblacionMillones = pais.poblacion / 1_000_000.0,
            superficieKm2 = pais.superficieKm2,
            moneda = pais.moneda,
            idiomaPrincipal = pais.idiomaPrincipal,
            continente = pais.continente
        )
    }

    fun toEntity(dto: PaisDTO): Pais {
        return Pais(
            id = dto.id,
            nombre = dto.nombre,
            codigoIso = dto.codigoIso,
            capital = dto.capital,
            poblacion = (dto.poblacionMillones * 1_000_000).toLong(),
            superficieKm2 = dto.superficieKm2,
            moneda = dto.moneda,
            idiomaPrincipal = dto.idiomaPrincipal,
            continente = dto.continente
        )
    }
}