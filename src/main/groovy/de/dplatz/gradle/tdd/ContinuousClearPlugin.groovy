package de.dplatz.gradle.tdd

import org.gradle.BuildAdapter
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.invocation.Gradle

class ContinuousClearPlugin implements Plugin<Project> {

	@Override
	public void apply(Project project) {
		if (project.gradle.startParameter.continuous) {
			project.gradle.addListener( new BuildAdapter() {
				void projectsEvaluated(Gradle gradle) {
					if (System.getProperty("os.name").startsWith("Windows")) {
						project.exec { commandLine 'cls' }
					}
					else {
						project.exec { commandLine 'clear' }
					}
				}
			});
		}
	}
}
