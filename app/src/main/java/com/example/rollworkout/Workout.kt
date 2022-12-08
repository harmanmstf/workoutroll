package com.example.rollworkout

class Workout() {
    private val exercise = arrayListOf("push up", "pull up", "squat")

    fun roll(): String {
        return exercise.random()
    }
}