package com.github.edejin.emmeteverywhere.services

import com.github.edejin.emmeteverywhere.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
