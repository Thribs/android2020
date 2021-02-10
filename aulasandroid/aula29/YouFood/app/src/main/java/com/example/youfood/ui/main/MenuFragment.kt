package com.example.youfood.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.youfood.Item
import com.example.youfood.R

class MenuFragment : Fragment() {

    companion object {

        const val FRAGMENT_NAME = "fragment_name"
        const val BACKGROUND_COLOR = "background_color"
        const val ITEMS_LIST = "items_list"

        @JvmStatic
        fun newInstance(name: String, backgroundColor: Int, itemsList: List<Item>): MenuFragment {
            val fragment = MenuFragment()
            val bundle = Bundle()
            bundle.putString(FRAGMENT_NAME, name)
            bundle.putInt(BACKGROUND_COLOR, backgroundColor)
            for (item in itemsList) {
                bundle.putSerializable(item.id.toString(),item)
            }
            fragment.arguments = bundle
            return fragment
            // Clean code
//            return MenuFragment().apply {
//                arguments = Bundle().apply {
//                    putString(FRAGMENT_NAME, name)
//                    putInt(BACKGROUND_COLOR, backgroundColor)
//                    for (item in itemsList) {
//                        putSerializable(item.name,item)
//                    }
//                }
//            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        arguments?.let {

            val fragment = view.findViewById<LinearLayout>(R.id.fragment)
            val fragmentName = view.findViewById<TextView>(R.id.fragment_name)

            val item1 = it.getSerializable("1") as Item
            val item2 = it.getSerializable("2") as Item
            val item3 = it.getSerializable("3") as Item
            val item4 = it.getSerializable("4") as Item
            val item5 = it.getSerializable("5") as Item

            fragmentName.text =
                it.getString(FRAGMENT_NAME, "Name")

            fragment.setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(),it.getInt(
                        BACKGROUND_COLOR, R.color.black
                    )
                )
            )
            // Muda o texto das textviews com os valores do items da lista
            view.findViewById<TextView>(R.id.tv_name_item1).text = item1.name
            view.findViewById<TextView>(R.id.tv_name_item2).text = item2.name
            view.findViewById<TextView>(R.id.tv_name_item3).text = item3.name
            view.findViewById<TextView>(R.id.tv_name_item4).text = item4.name
            view.findViewById<TextView>(R.id.tv_name_item5).text = item5.name

            view.findViewById<TextView>(R.id.tv_price_item1).text = item1.price.toString()
            view.findViewById<TextView>(R.id.tv_price_item2).text = item2.price.toString()
            view.findViewById<TextView>(R.id.tv_price_item3).text = item3.price.toString()
            view.findViewById<TextView>(R.id.tv_price_item4).text = item4.price.toString()
            view.findViewById<TextView>(R.id.tv_price_item5).text = item5.price.toString()
        }
        super.onViewCreated(view, savedInstanceState)
    }
}