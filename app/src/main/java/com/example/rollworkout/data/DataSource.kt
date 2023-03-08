package com.example.rollworkout.data

import com.example.rollworkout.R
import com.example.rollworkout.model.*


class AbsDatasource {
    fun loadAbs(): List<Abs> {
        return listOf(
            Abs(R.drawable.sit_ups, R.string.abs1),
            Abs(R.drawable.reverse_crunches, R.string.abs2),
            Abs(R.drawable.bicycle_crunches, R.string.abs3),
            Abs(R.drawable.flutter_kicks, R.string.abs4),
            Abs(R.drawable.leg_raises, R.string.abs5),
            Abs(R.drawable.elbow_plank, R.string.abs6)
        )
    }
}

class QuadsDatasource {
    fun loadQuads(): List<Quads> {
        return listOf(
            Quads(R.drawable.lunges, R.string.quads1),
            Quads(R.drawable.high_knees, R.string.quads2),
            Quads(R.drawable.turning_kicks, R.string.quads3),
            Quads(R.drawable.climbers, R.string.quads4),
            Quads(R.drawable.plank_jump_ins, R.string.quads5),
            Quads(R.drawable.lunges_step_ups, R.string.quads6)
        )
    }
}

class GlutesDatasource {
    fun loadGlutes(): List<Glutes> {
        return listOf(
            Glutes(R.drawable.squats, R.string.glutes1),
            Glutes(R.drawable.donkey_kicks, R.string.glutes2),
            Glutes(R.drawable.bridges, R.string.glutes3),
            Glutes(R.drawable.jump_knee_tucks, R.string.glutes4),
            Glutes(R.drawable.fly_steps, R.string.glutes5),
            Glutes(R.drawable.side_leg_raises, R.string.glutes6)
        )
    }
}

class TricepsDatasource {
    fun loadTriceps(): List<Triceps> {
        return listOf(
            Triceps(R.drawable.close_grip_push_ups, R.string.triceps1),
            Triceps(R.drawable.triceps_dips, R.string.triceps2),
            Triceps(R.drawable.triceps_extensions, R.string.triceps3),
            Triceps(R.drawable.get_ups, R.string.triceps4),
            Triceps(R.drawable.punches, R.string.triceps5),
            Triceps(R.drawable.side_to_side_chops, R.string.triceps6)
        )
    }
}

class BicepsDatasource {
    fun loadBiceps(): List<Biceps> {
        return listOf(
            Biceps(R.drawable.leg_curls, R.string.biceps1),
            Biceps(R.drawable.chin_ups, R.string.biceps2),
            Biceps(R.drawable.door_frame_rows, R.string.biceps3),
            Biceps(R.drawable.body_rows, R.string.biceps4),
            Biceps(R.drawable.sitting_pull_ups, R.string.biceps5),
            Biceps(R.drawable.pseudo_planche, R.string.biceps6)
        )
    }
}

class BackDatasource {
    fun loadBack(): List<Back> {
        return listOf(
            Back(R.drawable.pull_ups, R.string.back1),
            Back(R.drawable.elbow_lifts, R.string.back2),
            Back(R.drawable.superman, R.string.back3),
            Back(R.drawable.star_plank, R.string.back4),
            Back(R.drawable.alt_arm_leg_plank, R.string.back5),
            Back(R.drawable.full_arch, R.string.back6)
        )
    }
}

class ChestDatasource {
    fun loadChest(): List<Chest> {
        return listOf(
            Chest(R.drawable.push_ups, R.string.chest1),
            Chest(R.drawable.plank_rotations, R.string.chest2),
            Chest(R.drawable.chest_squeezes, R.string.chest3),
            Chest(R.drawable.shoulder_press, R.string.chest4),
            Chest(R.drawable.shoulder_taps, R.string.chest5),
            Chest(R.drawable.clapping_push_ups, R.string.chest6)
        )
    }
}

class PartsDatasource {
    fun loadParts(): List<WorkoutParts> {
        return WorkoutParts.values().toList()
    }
}
