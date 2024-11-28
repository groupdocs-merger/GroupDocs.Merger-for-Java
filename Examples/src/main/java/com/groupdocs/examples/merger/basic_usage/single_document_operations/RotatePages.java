package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.RotateMode;
import com.groupdocs.merger.domain.options.RotateOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to rotate document pages.
 */
public class RotatePages {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("RotatePages.pdf");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                RotateOptions rotateOptions = new RotateOptions(RotateMode.Rotate180, new int[]{2});

                merger.rotatePages(rotateOptions);

                merger.save(outputPath.toString());

                System.out.println("..sample finished successfully.");
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }

        return outputPath;
    }
}