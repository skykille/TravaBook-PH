package com.example.group1.data.model

enum class UserRole {
    USER,
    ADMIN
}

data class User(
    val id: String,
    val name: String,
    val email: String,
    val phone: String,
    val password: String,
    val role: UserRole = UserRole.USER,
    val avatarUrl: String = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=500&auto=format&fit=crop&q=80",
    val preferredDestination: String = "Boracay"
)
