package service

import model.Product
import seeds.productInfo

class ProductService {

    fun showProductList() {
        println("list of products:")
        for (n in productInfo) {
            println(n)
        }
    }

    fun searchProduct(name: String) {
        val filter = productInfo.filter { product -> product.name.contains(name, true) }
        for (s in filter) {
            println(s)
        }
    }

    fun addProduct(name: String, category: String, price: Double, quantity: Int) {
        productInfo.addLast(Product(productInfo.size+1, name, category, price, quantity))
        showProductList()
    }

    fun removeProduct(id: Int) {
        productInfo.removeIf { product-> product.id==id }
        showProductList()
    }
}