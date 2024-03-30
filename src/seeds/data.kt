package seeds

import model.Product

private var id = 1
var productInfo = mutableListOf<Product>(
    Product(id++, "Computer", "appliances", 1000.00, 100),
    Product(id++, "Phone", "appliances", 1000.00, 100),
    Product(id++, "Toster", "appliances", 1000.00, 100),
)