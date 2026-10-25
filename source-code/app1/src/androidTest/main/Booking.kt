package com.example.group1.data.model

enum class BookingStatus {
    CONFIRMED,   // Reserved / Awaiting Check-In
    CHECKED_IN,  // Guest Currently Checked In at Hotel
    CHECKED_OUT, // Stay Completed & Checked Out
    CANCELLED    // Booking / Reservation Cancelled
}

data class Booking(
    val id: String,
    val userId: String,
    val userName: String,
    val userEmail: String,
    val userPhone: String,
    val hotelId: String,
    val hotelName: String,
    val hotelLocation: String,
    val hotelImageUrl: String,
    val roomTypeName: String,
    val checkInDate: String,
    val checkOutDate: String,
    val nights: Int,
    val guestCount: Int,
    val totalPrice: Double,
    val paymentMethod: String,
    val bookingDate: String,
    val status: BookingStatus = BookingStatus.CONFIRMED
)
