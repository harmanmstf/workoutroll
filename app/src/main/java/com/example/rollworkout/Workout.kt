package com.example.rollworkout

class Workout {
    private val exercise = arrayListOf(
        "sit-ups",
        "reverse crunches",
        "bcycle crunches",
        "flutter kicks",
        "leg raises",
        "elbow plank",
        "lunges",
        "high knees",
        "turning kicks",
        "climbers",
        "plank jump-ins",
        "lunges step-ups",
        "squats",
        "donkey kicks",
        "bridges",
        "hump knee tucks",
        "fly steps",
        "side leg raises",
        "close grip push-ups",
        "tricep dips",
        "tricep extensions",
        "get ups",
        "punches",
        "side-to-sides chops",
        "leg curls",
        "chin-ups",
        "door frame rows",
        "body rows",
        "sitting pull-ups",
        "pseudo planche",
        "pull-ups",
        "elbow lifts",
        "superman",
        "star plank",
        "alt arm/leg plank",
        "full arch",
        "push-ups",
        "plank rotations",
        "chest squeezes",
        "shoulder press",
        "shoulder taps",
        "clapping push-ups"
    )

    fun roll(): String {
        return exercise.random()
    }
}

