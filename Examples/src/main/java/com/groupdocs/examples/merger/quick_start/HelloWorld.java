package com.groupdocs.examples.merger.quick_start;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class HelloWorld {
    public static Path run(Path inputFile, Path secondFile) {
        final Path outputPath = makeOutputPath("HelloWorld.docx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {

                merger.join(secondFile.toString());
                merger.save(outputPath.toString());
            } finally {
                merger.dispose();
            }
            System.out.println("..sample finished successfully.");
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }

        return outputPath;
    }
}