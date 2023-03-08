package com.example.rollworkout.ui.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.adapter.WorkoutAdapter
import com.example.rollworkout.data.PartsDatasource
import com.example.rollworkout.data.WorkoutRoll
import com.example.rollworkout.databinding.FragmentWorkoutBinding


class WorkoutFragment : Fragment() {

    private var _binding: FragmentWorkoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentWorkoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workout = WorkoutRoll()
        var rollResult = ""

        binding.RollButton.setOnClickListener {
            rollResult = workout.roll()
            binding.textViewExercise.text = rollResult
        }

        binding.imageViewHelp.setOnClickListener {
            val action =
                WorkoutFragmentDirections.actionWorkoutRollFragmentToHelpFragment(rollResult)
            findNavController().navigate(action)
        }

        val myDataset = PartsDatasource().loadParts()
        val recyclerView: RecyclerView = binding.recyclerViewWorkoutRoll
        recyclerView.adapter = WorkoutAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}
