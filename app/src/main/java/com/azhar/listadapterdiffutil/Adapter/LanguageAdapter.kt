package com.azhar.listadapterdiffutil.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.azhar.listadapterdiffutil.R
import com.azhar.listadapterdiffutil.model.LanguageItem

class LanguageAdapter: ListAdapter<LanguageItem, LanguageViewHolder>(DiffUtilCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_layout, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val languageItem = getItem(position)
        holder.bind(languageItem)
    }
}