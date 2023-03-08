package com.example.rollworkout.ui.workoutdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.data.*
import com.example.rollworkout.databinding.FragmentDetailWorkoutBinding
import com.example.rollworkout.model.WorkoutParts

class WorkoutDetailFragment : Fragment() {

    private var _binding: FragmentDetailWorkoutBinding? = null
    private val binding get() = _binding!!
    private val args: WorkoutDetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentDetailWorkoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = when (args.selectedWorkoutPart) {
            WorkoutParts.ABS -> AbsDatasource().loadAbs()
            WorkoutParts.QUADS -> QuadsDatasource().loadQuads()
            WorkoutParts.GLUTES -> GlutesDatasource().loadGlutes()
            WorkoutParts.TRICEPS -> TricepsDatasource().loadTriceps()
            WorkoutParts.BICEPS -> BicepsDatasource().loadBiceps()
            WorkoutParts.BACK -> BackDatasource().loadBack()
            WorkoutParts.CHEST -> ChestDatasource().loadChest()
        }

        val recyclerView: RecyclerView = binding.recyclerViewTypes
        recyclerView.adapter = WorkoutDetailAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}

