package xyz.lysean.gradle.deply

import org.gradle.api.Project
import org.gradle.api.Plugin


class DeplyDependencyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('deply', DeplyDependency, project)
    }
}