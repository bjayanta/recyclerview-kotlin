package xyz.jayanta.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(var c:Context, var list:ArrayList<Product>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        var my_view = LayoutInflater.from(c).inflate(R.layout.my_row, p0, false)
        return MyProduct(my_view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        (p0 as MyProduct).bind(list[p1].name, list[p1].price, list[p1].photo)
    }

    class MyProduct(view: View): RecyclerView.ViewHolder(view) {
        // code goes to here
        var food_name = view.findViewById<TextView>(R.id.pro_name)
        var food_price = view.findViewById<TextView>(R.id.pro_price)
        var food_photo = view.findViewById<ImageView>(R.id.pro_photo)

        fun bind(name:String, price:Int, photo: Int) {
            food_name.text = name
            food_price.text = price.toString()
            food_photo.setImageResource(photo)
        }
    }

}