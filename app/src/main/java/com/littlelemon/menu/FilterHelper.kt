package com.littlelemon.menu

import androidx.compose.foundation.clickable
// ... other imports ...

@Composable
fun ProductsGrid(
    products: List<ProductItem>,
    startProductActivity: (ProductItem) -> Unit // Added parameter
) {
    // ... LazyVerticalGrid implementation ...

    // Inside items logic where ProductCard is called:
    ProductCard(
        productItem = product,
        modifier = Modifier.clickable {
            startProductActivity(product) // Execute function on click
        }
    )

    // ...
}