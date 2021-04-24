package com.example.youfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.youfood.ui.main.MenuAdapter
import com.example.youfood.ui.main.MenuFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    // Declaração lazy do ViewPager
    val viewPager by lazy { findViewById<ViewPager2>(R.id.viewpager) }
    val tabLayout by lazy { findViewById<TabLayout>(R.id.layout_tab) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instancia a variável fragment, que contém a lista de Fragments
        val fragments = getFragments()

        val menuAdapter = MenuAdapter(fragments,this)

        viewPager.adapter = menuAdapter
        viewPager.offscreenPageLimit = 1

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = fragments[position].arguments?.getString(
                MenuFragment.FRAGMENT_NAME, "Tab"
            )
        }.attach()
    }

    // Retorna uma lista de fragments
    private fun getFragments(): List<Fragment> {
        return listOf(
            MenuFragment.newInstance(
                name = "Salgados",
                backgroundColor = R.color.salgados,
                itemsList = getSalgados()
            ),
            MenuFragment.newInstance(
                name = "Lanches",
                backgroundColor = R.color.lanches,
                itemsList = getLanches()
            ),
                    MenuFragment.newInstance(
                    name = "Salgados",
            backgroundColor = R.color.bebidas,
            itemsList = getBebidas()
        )
        )
    }
    // Retorna uma lista de objetos do tipo Item
    private fun getSalgados(): List<Item> {
        return listOf(
            Item(1, "Coxinha",2.5),
            Item(2, "Risole",2.0),
            Item(3, "Folheado",2.0),
            Item(4, "Empada",4.0),
            Item(5, "Hamburgão",3.0))
    }
    private fun getLanches(): List<Item> {
        return listOf(
            Item(1, "Misto",5.0),
            Item(2, "Bauru",6.0),
            Item(3, "X-Egg",7.0),
            Item(4, "X-Bacon",8.0),
            Item(5, "X-Tudo",10.0))
    }
    private fun getBebidas(): List<Item> {
        return listOf(
            Item(1, "Refrigerante",4.0),
            Item(2, "Cerveja",8.0),
            Item(3, "Suco",5.0),
            Item(4, "Batida",8.0),
            Item(5, "Vinho",2.0))
    }
}