package com.example.rollworkout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rollworkout.R
import com.example.rollworkout.TypesWorkoutFragment
import com.example.rollworkout.WorkoutRollFragment
import com.example.rollworkout.WorkoutRollFragmentDirections
import com.example.rollworkout.model.Chest
import com.example.rollworkout.model.WorkoutParts
import com.example.rollworkout.model.WorkoutRoll
import com.example.rollworkout.model.WorkoutType

class ItemAdapter(
    private val context: TypesWorkoutFragment,
    private val dataset: List<WorkoutType>

) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceID)
    }

    override fun getItemCount() = dataset.size
    }






class ItemAdapterWorkoutRoll(
    private val contextWorkoutRoll: WorkoutRollFragment,
    private val datasetWorkoutRoll: List<WorkoutParts>
) : RecyclerView.Adapter<ItemAdapterWorkoutRoll.ItemViewHolder>() {

    class ItemViewHolder( val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val button: CardView = view.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = datasetWorkoutRoll[position]
        holder.textView.text =  contextWorkoutRoll.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceID)
        // Assigns a [OnClickListener] to the button contained in the [ViewHolder]
        holder.button.setOnClickListener {
            // Create an action from WordList to DetailList
            // using the required arguments
            val action = WorkoutRollFragmentDirections.actionWorkoutRollFragmentToTypesWorkoutFragment(item)
            // Navigate using that action
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = datasetWorkoutRoll.size
}
