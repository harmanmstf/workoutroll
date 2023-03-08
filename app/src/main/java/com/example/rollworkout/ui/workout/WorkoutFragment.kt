package com.example.rollworkout.ui.workout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.Workout
import com.example.rollworkout.adapter.WorkoutAdapter
import com.example.rollworkout.data.PartsDatasource
import com.example.rollworkout.databinding.FragmentWorkoutRollBinding


class WorkoutFragment : Fragment() {

    private var _binding: FragmentWorkoutRollBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentWorkoutRollBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workout = Workout()
        var rollResult = ""  //TODO lateinit yapılabilir

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

        val recyclerView : RecyclerView = binding.recyclerViewWorkoutRoll

        recyclerView.adapter = WorkoutAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)


        }
    }
