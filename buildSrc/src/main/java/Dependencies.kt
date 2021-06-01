object Dependencies {

    object Kotlin {
        const val core = "androidx.core:core-ktx:${Version.kotlinCoreKtx}"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    }

    object GooglePlayService {
        const val core = "com.google.android.play:core-ktx:1.8.1"
        const val auth = "com.google.android.gms:play-services-auth:19.0.0"
    }

    object Firebase {
        const val bom = "com.google.firebase:firebase-bom:${Version.firebaseBoom}"
        const val ui = "com.firebaseui:firebase-ui-auth:${Version.firebaseUi}"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val storage = "com.google.firebase:firebase-storage"
        const val auth = "com.google.firebase:firebase-auth-ktx"
        const val fcm = "com.google.firebase:firebase-messaging-ktx"
    }

    object Retrofit {
        const val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
        const val playService = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Version.coroutines}"
    }

    object Hilt {
        const val classPath = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
        const val processor = "com.google.dagger:hilt-compiler:${Version.hilt}"

    }

    object Mavericks {
        const val mvrx = "com.airbnb.android:mvrx:${Version.mvrx}"
    }

    object Epoxy {
        val epoxy = "com.airbnb.android:epoxy:${Version.epoxy}"
        val dataBinding = "com.airbnb.android:epoxy-databinding:${Version.epoxy}"
        val processor = "com.airbnb.android:epoxy-processor:${Version.epoxy}"
    }

    object Groupie {
        const val core = "com.xwray:groupie:${Version.groupie}"
        const val viewBinding = "com.xwray:groupie-viewbinding:${Version.groupie}"
    }

    object WorkManager {
        // Kotlin + coroutines
        const val kotlin = "androidx.work:work-runtime-ktx:${Version.workManager}"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val material = "com.google.android.material:material:1.3.0"
        const val viewpager = "androidx.viewpager2:viewpager2:1.0.0"
        const val startup = "androidx.startup:startup-runtime:1.0.0-beta01"

        object Navigation {
            const val fragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
            const val ui = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
            const val test = "androidx.navigation:navigation-testing:${Version.navigation}"
        }

        object Test {
            const val junit = "junit:junit:4.12"
            const val ext = "androidx.test.ext:junit:1.1.2"
            object Espresso {
                private const val version = "3.3.0"
                const val core = "androidx.test.espresso:espresso-core:$version"
            }
        }
    }

    object Other {
        const val viewBinding = "com.github.yogacp:android-viewbinding:1.0.1"
        const val roundedImageview = "com.makeramen:roundedimageview:2.3.0"
        const val dotIndicator = "com.tbuonomo.andrui:viewpagerdotsindicator:4.1.2"
        const val timber = "com.jakewharton.timber:timber:4.7.1"
        const val vValidator = "com.afollestad:vvalidator:0.5.2"
        const val glide = "com.github.bumptech.glide:glide:4.11.0"
        const val blurry = "jp.wasabeef:blurry:4.0.0"
        const val imageSlider = "com.github.smarteist:autoimageslider:1.4.0"
        const val lottie = "com.airbnb.android:lottie:3.5.0"
        const val circleImageView = "de.hdodenhof:circleimageview:3.1.0"
        const val materialDialog = "com.afollestad.material-dialogs:core:3.2.1"
    }
}