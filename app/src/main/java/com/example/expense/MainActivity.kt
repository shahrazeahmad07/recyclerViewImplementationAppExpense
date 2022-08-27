package com.example.expense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var recycleAdapter: RecyclerView.Adapter<ExpenseCardRV.ViewHolder>? = null
    private var rvExpenditures: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        rvExpenditures = findViewById(R.id.rvExpenditures)
        rvExpenditures?.layoutManager = layoutManager

        recycleAdapter = ExpenseCardRV()
        rvExpenditures?.adapter = recycleAdapter

    }
}