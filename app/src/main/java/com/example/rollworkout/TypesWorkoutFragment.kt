package com.example.rollworkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.adapter.ItemAdapter
import com.example.rollworkout.data.ChestDatasource
import com.example.rollworkout.data.Datasource
import com.example.rollworkout.databinding.FragmentTypesWorkoutBinding
import com.example.rollworkout.databinding.FragmentWorkoutRollBinding

class TypesWorkoutFragment : Fragment() {

    private var _binding: FragmentTypesWorkoutBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentTypesWorkoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = ChestDatasource().loadChest()

        val recyclerView : RecyclerView = binding.recyclerViewTypes
        //val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)




    }
}

