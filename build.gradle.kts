// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Apply the Android application plugin with version 8.2.0, but don't activate it for this project.
plugins {
    id("com.android.application") version "8.2.0" apply false

    // Apply the Kotlin Android plugin with version 1.8.10, but don't activate it for this project.
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}