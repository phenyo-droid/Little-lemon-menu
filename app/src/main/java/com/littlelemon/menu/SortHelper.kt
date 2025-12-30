package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortedBy { it.title }
            SortType.PriceAsc -> productsList.sortedBy { it.price } // Added
            SortType.PriceDesc -> productsList.sortedByDescending { it.price } // Added
        }
    }
}