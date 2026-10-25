package com.example.group1.data.model

data class RoomType(
    val id: String,
    val name: String,
    val priceModifier: Double = 0.0,
    val capacity: String,
    val description: String,
    val features: List<String>
)
