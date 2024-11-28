package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.MoveOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to move document page to a new position.
 */
public class MovePage {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("MovePage.xlsx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                int pageNumber = 5;
                int newPageNumber = 1;
                MoveOptions moveOptions = new MoveOptions(pageNumber, newPageNumber);

                merger.movePage(moveOptions);
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