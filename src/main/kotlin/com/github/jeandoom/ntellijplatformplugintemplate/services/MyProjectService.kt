package com.github.jeandoom.ntellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.jeandoom.ntellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
