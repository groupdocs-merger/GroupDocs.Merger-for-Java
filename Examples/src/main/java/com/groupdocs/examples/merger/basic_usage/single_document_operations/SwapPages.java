package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.SwapOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to swap document pages.
 */
public class SwapPages {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("SwapPages.pptx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                SwapOptions swapOptions = new SwapOptions(3, 6);

                merger.swapPages(swapOptions);

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