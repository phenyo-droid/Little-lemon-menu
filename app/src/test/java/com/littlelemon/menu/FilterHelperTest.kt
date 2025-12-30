package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        // 1. Create sample list
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )

        // 2. Execute FilterHelper
        val result = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        // 3. Assert result (Expect only 1 item, which is Croissant)
        assertEquals(1, result.size)
        assertEquals("Croissant", result[0].title)
    }
}