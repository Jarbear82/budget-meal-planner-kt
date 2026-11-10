package io.github.jarbear82.MealPlanning

import io.github.jarbear82.Shared.MealCategory
import kotlinx.datetime.DateTimePeriod

// tag::scm-1[]
class ScheduledMeal {
    val dateTime: DateTimePeriod,
    val mealType: MealType,
    val mealCategory: MealCategory,
    val numberOfServings: Float,
    val notes?: String
    // end::scm-1[]

    // tag::scm-2

}
