import com.yvkalume.buildsrc.Dependencies
import com.yvkalume.buildsrc.Dependencies.AndroidX
import com.yvkalume.buildsrc.Dependencies.Kotlin

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AndroidConfig.compileSdkVersion)
    buildToolsVersion(AndroidConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Kotlin.stdlib)
    implementation(Kotlin.coreKtx)

    implementation(Dependencies.Lifecycle.livedata)
    kapt(Dependencies.Lifecycle.annotationProcessor)

    testImplementation(AndroidX.Test.junit)
    androidTestImplementation(AndroidX.Test.ext)
    androidTestImplementation(AndroidX.Test.espressoCore)
}