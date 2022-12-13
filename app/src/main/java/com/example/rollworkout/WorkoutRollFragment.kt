package com.example.rollworkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.adapter.ItemAdapter
import com.example.rollworkout.data.Datasource
import com.example.rollworkout.databinding.FragmentWorkoutRollBinding


class WorkoutRollFragment : Fragment() {

    private var _binding: FragmentWorkoutRollBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
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
                WorkoutRollFragmentDirections.actionWorkoutRollFragmentToHelpFragment(rollResult)
            findNavController().navigate(action)
        }

        binding.button.setOnClickListener {
            val action =
                WorkoutRollFragmentDirections.actionWorkoutRollFragmentToTypesWorkoutFragment()
            findNavController().navigate(action)

        }
    }
}