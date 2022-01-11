package com.azhar.listadapterdiffutil.Adapter

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.listadapterdiffutil.R
import com.azhar.listadapterdiffutil.model.LanguageItem

class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val initial: AppCompatTextView = itemView.findViewById(R.id.initial_id)
    val name: AppCompatTextView = itemView.findViewById(R.id.language_name_id)

    fun bind(item: LanguageItem){
        initial.text = item.initial
        name.text = item.name
    }
}