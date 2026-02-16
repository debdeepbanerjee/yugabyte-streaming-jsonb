rootProject.name = "yugabyte-file-processor"

pluginManagement {
    // In general, you should make every effort to avoid using `apply` and use `plugins {}` instead
    // in this case, it allows us to DRY our repositories setup and avoid a "bootstrap" problem.
    // if we can figure out a way to avoid `apply` here while DRY, we should do it
    apply(from = "build-logic/settings/repositories/src/main/kotlin/aexp/repositories.settings.gradle.kts")
    includeBuild("build-logic/settings/develocity")
    includeBuild("build-logic/settings")
    includeBuild("build-logic")
}

plugins {
    id("aexp.develocity")
}