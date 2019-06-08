package com.neuroid.neuinterview.Utility.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neuroid.neuinterview.R
import com.neuroid.neuinterview.Utility.OnItemClickListener
import com.neuroid.neuinterview.model.Question
import kotlinx.android.synthetic.main.question.view.*

class QuestionAdapter(val items : ArrayList<Question>, val context: Context,private val listener: OnItemClickListener) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.question, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val q = "Q";
        val qN= q.plus(position+1)

        holder.QNo?.text = qN.plus(":")
        holder.tvItemQuestion?.text = items.get(position).question
        holder.bind(position,listener)
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    fun bind( position: Int,listener: OnItemClickListener){
        itemView.setOnClickListener { listener.onItemClick(position) }
    }
    // Holds the TextView that will add each animal to
    val tvItemQuestion = view.tvItemQuestion
    val QNo = view.QNo
}