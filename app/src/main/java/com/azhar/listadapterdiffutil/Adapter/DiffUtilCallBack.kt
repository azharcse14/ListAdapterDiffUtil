package com.azhar.listadapterdiffutil.Adapter

import androidx.recyclerview.widget.DiffUtil
import com.azhar.listadapterdiffutil.model.LanguageItem

class DiffUtilCallBack : DiffUtil.ItemCallback<LanguageItem>(){
    override fun areItemsTheSame(oldItem: LanguageItem, newItem: LanguageItem): Boolean {

        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: LanguageItem, newItem: LanguageItem): Boolean {

        return oldItem == newItem
    }

}