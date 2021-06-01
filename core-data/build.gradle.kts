import com.yvkalume.buildsrc.Dependencies
plugins {
    id("com.android.library")
    id("kotlin-android")
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
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Kotlin.coreKtx)
    testImplementation(Dependencies.AndroidX.Test.junit)
    androidTestImplementation(Dependencies.AndroidX.Test.ext)
    androidTestImplementation(Dependencies.AndroidX.Test.espressoCore)
}