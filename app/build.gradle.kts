plugins {
    // Apply the Android application plugin for building Android apps.
    id("com.android.application")

    // Apply the Kotlin Android plugin for Kotlin support in Android development.
    id("org.jetbrains.kotlin.android")
}

android {
    // Set the namespace for the application.
    namespace = "com.bank"

    // Set the Android SDK version to compile against.
    compileSdk = 34

    defaultConfig {
        // Set basic application configurations.
        applicationId = "com.bank"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // Configure test-related settings.
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        // Configure release build type.
        release {
            isMinifyEnabled = false
            // Define ProGuard rules for release builds.
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // Configure Java compatibility options.
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Configure Kotlin compatibility options.
    kotlinOptions {
        jvmTarget = "1.8"
    }

    // Enable Compose features in the build.
    buildFeatures {
        compose = true
    }

    // Configure Compose options.
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    // Configure packaging options to exclude specific resources.
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Add dependencies for the application.

    // AndroidX Core KTX library.
    implementation("androidx.core:core-ktx:1.13.1")

    // AndroidX Lifecycle library.
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")

    // AndroidX Activity Compose library.
    implementation("androidx.activity:activity-compose:1.9.0")

    // Compose BOM (Bill of Materials) for version management.
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))

    // Compose UI libraries.
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")

    // Compose Material3 library.
    implementation("androidx.compose.material3:material3")

    // JUnit for unit testing.
    testImplementation("junit:junit:4.13.2")

    // AndroidX Test libraries.
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Compose BOM for testing.
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.05.00"))

    // Compose UI testing library.
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")

    // Compose UI tooling for debugging.
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Compose UI testing manifest.
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}