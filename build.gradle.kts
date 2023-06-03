buildscript {
    dependencies {
    }
    repositories {
        maven { url = uri("https://jitpack.io") }
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "8.1.0-alpha06" apply false
    id("com.android.library") version "8.1.0-alpha06" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}