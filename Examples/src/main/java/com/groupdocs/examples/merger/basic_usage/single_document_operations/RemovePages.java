package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.RemoveOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to remove document pages.
 */
public class RemovePages {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("RemovePages.docx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                RemoveOptions removeOptions = new RemoveOptions(new int[]{3, 5});

                merger.removePages(removeOptions);

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