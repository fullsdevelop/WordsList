package ca.qc.mtl.mohaila.wordslist

import android.app.ListActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : ListActivity() {

    val selection by lazy {
        findViewById<TextView>(R.id.selection)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
    }

    companion object {
        val items = arrayOf("I am", "You are", "He is", "We are", "You are", "They are")
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        selection.text = items[position]
    }
}
