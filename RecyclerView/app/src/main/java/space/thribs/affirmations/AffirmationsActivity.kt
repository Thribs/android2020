package space.thribs.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import space.thribs.affirmations.adapter.AffirmationAdapter
import space.thribs.affirmations.data.Datasource

class AffirmationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmations)

        // Initialize data.
        val affirmationsList = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview_affirmations)
        recyclerView.adapter = AffirmationAdapter(this, affirmationsList)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}