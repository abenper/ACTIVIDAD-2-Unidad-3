package com.example.demo.dominio

import jakarta.persistence.*

@Entity
@Table(name = "paises")
data class Pais(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val nombre: String,
    val codigoIso: String,
    val capital: String,

    val poblacion: Long, // en unidades

    val superficieKm2: Double,
    val moneda: String,
    val idiomaPrincipal: String,
    val continente: String
)