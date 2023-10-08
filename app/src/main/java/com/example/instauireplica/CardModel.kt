package com.example.instauireplica

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.painter.Painter

@Immutable
data class CardModel(
    val id: String,
    val accountIcon: Painter,
    val accountName: String,
    val images: List<Painter>,
    val likes: Int,
    val comment: String
)
