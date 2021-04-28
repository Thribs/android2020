package space.thribs.mvvmarchitectureandroidbeginners.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import space.thribs.mvvmarchitectureandroidbeginners.R
import space.thribs.mvvmarchitectureandroidbeginners.data.api.ApiHelper
import space.thribs.mvvmarchitectureandroidbeginners.data.api.ApiServiceImpl
import space.thribs.mvvmarchitectureandroidbeginners.data.model.User
import space.thribs.mvvmarchitectureandroidbeginners.databinding.ActivityMainBinding
import space.thribs.mvvmarchitectureandroidbeginners.ui.base.ViewModelFactory
import space.thribs.mvvmarchitectureandroidbeginners.ui.main.adapter.MainAdapter
import space.thribs.mvvmarchitectureandroidbeginners.ui.main.viewmodel.MainViewModel
import space.thribs.mvvmarchitectureandroidbeginners.utils.Status

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupUI()
        setupViewModel()
        setupObserver()
    }

    private fun setupUI() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        with(binding) {
//            mainRecyclerView.layoutManager = LinearLayoutManager(this.root.context)
            adapter = MainAdapter(arrayListOf())
            recyclerView.addItemDecoration(
                DividerItemDecoration(
                    recyclerView.context,
                    RecyclerView.VERTICAL
                )
            )
            recyclerView.adapter = adapter
        }
    }

    private fun setupObserver() {
        mainViewModel.getUsers().observe(this, Observer { resource ->
            with(binding) {
                when (resource.status) {
                    Status.SUCESS -> {
                        progressBar.visibility = View.GONE
                        resource.data?.let { users -> renderList(users) }
                        recyclerView.visibility = View.VISIBLE
                    }
                    Status.LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        recyclerView.visibility = View.GONE
                    }
                    Status.ERROR -> {
                        progressBar.visibility = View.GONE
                        Toast.makeText(this@MainActivity, resource.message, Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }
        })
    }

    private fun renderList(users: List<User>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }

    private fun setupViewModel() {
        mainViewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper(ApiServiceImpl()))
        ).get(MainViewModel::class.java)
    }
}