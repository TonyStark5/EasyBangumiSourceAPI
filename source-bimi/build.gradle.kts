import com.heyanle.buildsrc.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.heyanle.source_bimi"
    compileSdk = com.heyanle.buildsrc.Android.compileSdk
    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }

    defaultConfig {
        minSdk = com.heyanle.buildsrc.Android.minSdk
        targetSdk = com.heyanle.buildsrc.Android.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

afterEvaluate {
    publishing {
        publications {
            create("maven_public", MavenPublication::class) {
                groupId = "com.heyanle"
                artifactId = "source-bimi"
                version = "1.0"
                from(components.getByName("release"))
            }
        }
    }
}

dependencies {
    junit()
    gson()
    okhttp3()
    coroutines()
    jsoup()
    implementation(project(":api"))
}