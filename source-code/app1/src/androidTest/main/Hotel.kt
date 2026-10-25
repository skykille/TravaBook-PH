package com.example.group1.data.model

data class Hotel(
    val id: String,
    val name: String,
    val location: String,
    val region: String,
    val rating: Double,
    val reviewCount: Int,
    val ratingText: String = "Exceptional",
    val pricePerNight: Double,
    val originalPricePerNight: Double? = null,
    val tag: String = "Luxury Resort",
    val imageUrl: String,
    val galleryUrls: List<String> = emptyList(),
    val description: String,
    val amenities: List<String>,
    val roomTypes: List<RoomType>
)
