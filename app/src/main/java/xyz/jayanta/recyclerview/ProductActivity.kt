package xyz.jayanta.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var list = ArrayList<Product>()
        list.add(Product("Seven Up", 2, R.drawable.sevenup))
        list.add(Product("Cocacola", 3, R.drawable.cocacola))
        list.add(Product("Mirinda", 4, R.drawable.mirinda))
        list.add(Product("Pepsi", 5, R.drawable.mirinda))
        list.add(Product("Keurig Dr Pepper", 6, R.drawable.mirinda))
        list.add(Product("Hamoud Boualem", 7, R.drawable.mirinda))
        list.add(Product("National Beverage", 8, R.drawable.mirinda))
        list.add(Product("Polar Beverages", 9, R.drawable.mirinda))
        list.add(Product("Cott", 10, R.drawable.mirinda))
        list.add(Product("Sam's Choice", 11, R.drawable.mirinda))
        list.add(Product("Buffalo Rock", 12, R.drawable.mirinda))
        list.add(Product("Cola", 13, R.drawable.mirinda))
        list.add(Product("Lemonade", 14, R.drawable.mirinda))

        var adp = ProductAdapter(this, list)
        rv_pro.layoutManager = LinearLayoutManager(this)
        rv_pro.adapter = adp
    }
}
