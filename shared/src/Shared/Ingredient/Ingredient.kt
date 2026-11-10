package io.github.jarbear82.Shared.Ingredient

import kotlin.uuid.Uuid


/**
 *
 *
 */
data class Ingredient {
    val id: Uuid = Uuid.generateV7(),
    val name: String
}