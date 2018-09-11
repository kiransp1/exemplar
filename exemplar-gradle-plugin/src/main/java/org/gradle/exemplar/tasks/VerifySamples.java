/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.exemplar.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

public class VerifySamples extends DefaultTask {
    private final RegularFileProperty inputFile;
    private final DirectoryProperty outputDir;

    // TODO: input min and max Gradle version

    public VerifySamples() {
        this.inputFile = newInputFile();
        this.outputDir = newOutputDirectory();
    }

    @InputFile
    public RegularFileProperty getInputFile() {
        return inputFile;
    }

    @OutputDirectory
    public DirectoryProperty getOutputDir() {
        return outputDir;
    }

    @TaskAction
    public void run() {
        // TODO: Use JUnit API to define some suite and run each sample
        // TODO: utilize AggregatingTestReport (in Gradle public API)

    }
}