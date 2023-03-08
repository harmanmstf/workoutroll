package com.example.rollworkout.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.R
import com.example.rollworkout.model.WorkoutParts
import com.example.rollworkout.ui.workout.WorkoutFragment
import com.example.rollworkout.ui.workout.WorkoutFragmentDirections


class WorkoutAdapter(
    private val contextWorkoutRoll: WorkoutFragment,
    private val datasetWorkoutRoll: List<WorkoutParts>,
) : RecyclerView.Adapter<WorkoutAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val button: CardView = view.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = datasetWorkoutRoll[position]
        holder.textView.text = contextWorkoutRoll.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceID)
        holder.button.setOnClickListener {

            val action =
                WorkoutFragmentDirections.actionWorkoutRollFragmentToTypesWorkoutFragment(item)
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = datasetWorkoutRoll.size
}
