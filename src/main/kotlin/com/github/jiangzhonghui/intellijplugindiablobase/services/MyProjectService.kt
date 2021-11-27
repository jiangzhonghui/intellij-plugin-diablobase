package com.github.jiangzhonghui.intellijplugindiablobase.services

import com.intellij.openapi.project.Project
import com.github.jiangzhonghui.intellijplugindiablobase.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
