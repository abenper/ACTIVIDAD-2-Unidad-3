package com.example.demo.dto

data class PaisDTO(
    val id: Long? = null,
    val nombre: String,
    val codigoIso: String,
    val capital: String,
    val poblacionMillones: Double, // millones
    val superficieKm2: Double,
    val moneda: String,
    val idiomaPrincipal: String,
    val continente: String
)
