//package com.example.projectmcs
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.EditText
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class CartAdapter(private val cartItems: List<CartItem>) :
//    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
//
//    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val name : TextView = view.findViewById(R.id.NamaDoll)
//        val img : ImageView = view.findViewById(R.id.GambarDoll)
//        val price : TextView = view.findViewById(R.id.HargaDoll)
//        val quantity : EditText = view.findViewById(R.id.Quantity)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_cart, parent, false)
//        return CartViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
//        val item = cartItems[position]
//        holder.itemName.text = item.name
//        holder.itemQuantity.text = item.quantity.toString()
//        holder.itemPrice.text = String.format("$%.2f", item.price)
//    }
//
//    override fun getItemCount(): Int {
//        return cartItems.size
//    }
//}
