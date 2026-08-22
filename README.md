# Little-lemon-menu

## Little Lemon Menu(Android)

A Jetpack Compose Android app for the Little Lemon restaurant experience. It includes a home screen to browse the digital menu with dynamic sorting and category filters, and a dedicated product details screen.

Features

-Menu browsing: View menu items in a two-column grid layout. 
-Category filtering: Filter the catalog by categories such as All, Drinks, Food, and Dessert.  
-Dynamic sorting: Organize menu items alphabetically, by price ascending, or by price descending. 
-Detailed Views: View expanded product details including a large image, title, price, and category.  

User flow

Launch: You are taken directly to the Home screen (MainActivity). 
Home: Browse, filter, and sort menu items using the top app bar options. Tap on any item in the grid to open its details.  
Product Details: View the specific item's details (ProductActivity). Press the system back button to return to Home.  

Tech stack

Language: Kotlin 
UI: Jetpack Compose (for the grid and detail screens) + Standard Android XML Menus (for the top bar filtering/sorting) 
State Management: Kotlin MutableStateFlow 
Navigation: Standard Android Intent with explicit extras 
Data Source: Local mock data object (ProductWarehouse)  

Project structure

This repo uses a standard Android package structure tailored for Compose hybrid apps:
app/src/main/java/com/littlelemon.menu/MainActivity.kt / ProductActivity.kt // Activity entry points and Intent handling  ProductsGrid.kt / ProductDetails.kt // Stateless Compose UI components  FilterHelper.kt / SortHelper.kt // Domain logic for organizing data  ProductItem.kt / ProductWarehouse.kt // Data models and local mock database  

Architecture overview

UI (Compose) follows state-driven updates: The MainActivity collects state from a MutableStateFlow and passes it down to the stateless ProductsGrid.  
Navigation uses Intents: Instead of Navigation Compose, tapping an item fires a standard Android Intent containing primitive extras (KEY_TITLE, KEY_PRICE, etc.) to launch the ProductActivity. 
Data flow: UI reads menu items from a hardcoded ProductWarehouse list. Sorting and filtering create new lists that update the state flow. 

Setup Prerequisites

Android Studio (latest stable recommended)JDK 11 or higherAndroid SDK installed for the project’s configured SDK level

Run in Android Studio

Clone the repository: git clone [https://github.com/phenyo-droid/LittleLemonMenu.git](https://github.com/phenyo-droid/LittleLemonMenu.git)Open this project in Android Studio.Let Gradle sync finish.Run the app configuration on an emulator or device.

Build from the command line

Build the debug APK: ./gradlew :app:assembleDebugInstall on a connected device/emulator: ./gradlew :app:installDebug

Testing & Quality Checks (Placeholders for Future Implementation

Unit tests: ./gradlew :app:testDebugUnitTest
Instrumentation tests: ./gradlew :app:connectedDebugAndroidTest
Code formatting: ./gradlew spotlessApply

Troubleshooting

Missing Imports: Ensure your Jetpack Compose and Kotlin Coroutines dependencies are properly synced in your build.gradle files.
