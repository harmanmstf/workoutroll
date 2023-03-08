package com.example.rollworkout.ui.workoutdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.data.*
import com.example.rollworkout.databinding.FragmentTypesWorkoutBinding
import com.example.rollworkout.model.WorkoutParts

class WorkoutDetailFragment : Fragment() {

    private var _binding: FragmentTypesWorkoutBinding? = null
    private val binding get() = _binding!!
    private val args: WorkoutDetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTypesWorkoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = when(args.selectedWorkoutPart){
            WorkoutParts.ABS     -> AbsDatasource().loadAbs()
            WorkoutParts.QUADS   -> QuadsDatasource().loadQuads()
            WorkoutParts.GLUTES  -> GlutesDatasource().loadGlutes()
            WorkoutParts.TRICEPS -> TricepsDatasource().loadTriceps()
            WorkoutParts.BICEPS  -> BicepsDatasource().loadBiceps()
            WorkoutParts.BACK    -> BackDatasource().loadBack()
            WorkoutParts.CHEST   -> ChestDatasource().loadChest()
        }

        val recyclerView : RecyclerView = binding.recyclerViewTypes
        //val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = WorkoutDetailAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)




    }
}

