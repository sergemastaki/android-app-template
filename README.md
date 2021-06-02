# android-app-template

[![Kotlin Version](https://img.shields.io/badge/kotlin-1.5-blue.svg)](http://kotlinlang.org/)

An Android project template, written completely in Kotlin, to help you kick start your next Android project in seconds.

Just click on the  [![Use this template](https://camo.githubusercontent.com/2a7da879baa8087a1b6b8cfbf8a82c29358f7a34e890d272a3053872be6c20a7/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f2d5573652532307468697325323074656d706c6174652d627269676874677265656e)](https://github.com/YvesKalume/android-app-template/generate)  button to create a new repo starting from this template.

Once created don't forget to update the:

-   [Android Configuration](https://github.com/YvesKalume/android-app-template/blob/main/buildSrc/src/main/java/AndroidConfig.kt)  for App ID and other required Information.


## Modules 
-   **`app` —** contains all the code related to the Presentation layer and all the things from Android SDK (the activity, fragments and viewmodel, services, etc.)
-   **`core-domain` —**  contains all the application’s business logic : entities, use cases and abstract representation of repositories(interfaces). This shouldn’t depend on anything from the **_app_** or **_core-data_** module and should also be independent of any framework.
-   **`core-data` —** contains concrete implementations of repositories and other data sources like databases or network, split into corresponding packages.
-   **`buildSrc` —** contains all the objects with Gradle Kotlin DSL that allow to manage dependencies, plugins and other information of the application in order to avoid redundancy in the `build.gradle.kts` files.
### Principle
The general principle is to use a basic **3 tiers architecture** respecting the unidirectional **_Dependency Rule_.** This rule specifies that each circle can depend only on the nearest inward circle.
The `core-domain`module shouldn't now about any other module, `core-data`depends only on `core-domain` module and `app` depends on both `core-domain` and `core-data`, it uses **usecase** classes from viewmodels or presenters to perform actions.
To make it run you should use dependency injection framework.

