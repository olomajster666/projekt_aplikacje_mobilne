package com.example.projekt

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projekt.databinding.ActivityMainBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var todoAdapter: ZadaniaŁącznik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        todoAdapter = ZadaniaŁącznik(loadTasks())

        binding.rvListaZadan.adapter = todoAdapter
        binding.rvListaZadan.layoutManager = LinearLayoutManager(this)

        binding.btnDodajzadanie.setOnClickListener {
            val tytulZadania = binding.etDodajzadanie.text.toString()
            if (tytulZadania.isNotEmpty()) {
                val zadania = Zadania(tytulZadania)
                todoAdapter.dodajZadanie(zadania)
                binding.etDodajzadanie.text.clear()
                saveTasks()
            }
        }

        binding.btnUsunzadanie.setOnClickListener {
            todoAdapter.usunZadanie()
            saveTasks()
        }
    }

    private fun loadTasks(): MutableList<Zadania> {
        val sharedPreferences = getSharedPreferences("tasks_prefs", Context.MODE_PRIVATE)
        val tasksJson = sharedPreferences.getString("tasks", null) ?: return mutableListOf()
        val type = object : TypeToken<MutableList<Zadania>>() {}.type
        return Gson().fromJson(tasksJson, type)
    }

    private fun saveTasks() {
        val sharedPreferences = getSharedPreferences("tasks_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val tasksJson = Gson().toJson(todoAdapter.getTasks())
        editor.putString("tasks", tasksJson)
        editor.apply()
    }
}
