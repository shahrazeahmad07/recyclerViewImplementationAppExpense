package com.example.expense

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ExpenseCardRV : RecyclerView.Adapter<ExpenseCardRV.ViewHolder>() {

    private val titles = arrayOf("Title 1", "Title 2", "Title 3", "Title 4", "Title 5")
    private val subtitles = arrayOf("Subtitle 1", "Subtitle 2", "Subtitle 3", "Subtitle 4", "Subtitle 5")
    private val images = arrayOf(
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseCardRV.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rv_card_expense, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivItemImage.setImageResource(images[position])
        holder.tvItemTitle.text = titles[position]
        holder.tvItemSubtitle.text = subtitles[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivItemImage: ImageView
        var tvItemTitle: TextView
        var tvItemSubtitle: TextView

        init {
            ivItemImage = itemView.findViewById(R.id.ivItemImage)
            tvItemTitle = itemView.findViewById(R.id.tvItemTitle)
            tvItemSubtitle = itemView.findViewById(R.id.tvItemSubtitle)

            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "You Clicked ${titles[adapterPosition]}",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}