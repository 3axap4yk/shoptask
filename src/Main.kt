import service.ProductService

fun main() {
    while (true){
        choice()
    }
}

fun choice() {
    val service = ProductService()
    println(
        "Select an action:\n" +
                "1 - Show\n" +
                "2 - Search\n" +
                "3 - Add\n" +
                "4 - Remove"
    )
    println("Enter a number: ")
    val choiceNum = readln()

    println("------------------------------------")

    when (choiceNum.toInt()) {
        1 -> service.showProductList()
        2 ->{
            println("name of product: ")
            service.searchProduct(readln())
        }
        3 -> {
            println("Enter the name of the product: ")
            val nameAdd = readln()


            println("Enter the product category: ")
            val categoryAdd = readln()


            println("Enter the product price: ")
            val priceAdd = readln().toDouble()


            println("Enter the product quantity: ")
            val quantityAdd = readln().toInt()

            service.addProduct(name= nameAdd, category=categoryAdd, price=priceAdd, quantity = quantityAdd)
        }
        4 -> {
            println("Enter the id of the product: ")
            val idRemove = readln().toInt()
            service.removeProduct(idRemove)
        }
        else -> println("You entered an incorrect value")
    }
    println("------------------------------------")

}