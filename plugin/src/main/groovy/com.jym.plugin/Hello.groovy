package com.jym.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class Hello implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("--------------   hello,Plugin!   -----------------")
    }
}