// Configure plugin repositories for pluginManagement.
pluginManagement {
    // Include repositories from which Gradle can resolve plugins.
    repositories {
        // Google's plugin repository.
        google()
        // Maven Central repository.
        mavenCentral()
        // Gradle Plugin Portal repository.
        gradlePluginPortal()
    }
}

// Configure dependency resolution management for repositories.
dependencyResolutionManagement {
    // Set the repositories mode to fail if project repositories are encountered.
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    // Include repositories for resolving dependencies.
    repositories {
        // Google's Maven repository.
        google()
        // Maven Central repository.
        mavenCentral()
    }
}

// Set the name of the root project to "Bank".
rootProject.name = "Bank"

// Include the ":app" module in the build.
include(":app")