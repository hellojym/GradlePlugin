package com.bruce.demo

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloWorld implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("------------hello world!------------")
    }
}