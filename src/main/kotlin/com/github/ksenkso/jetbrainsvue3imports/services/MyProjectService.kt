package com.github.ksenkso.jetbrainsvue3imports.services

import com.intellij.openapi.project.Project
import com.github.ksenkso.jetbrainsvue3imports.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
