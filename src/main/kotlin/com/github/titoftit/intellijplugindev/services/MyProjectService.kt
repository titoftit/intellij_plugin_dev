package com.github.titoftit.intellijplugindev.services

import com.intellij.openapi.project.Project
import com.github.titoftit.intellijplugindev.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
