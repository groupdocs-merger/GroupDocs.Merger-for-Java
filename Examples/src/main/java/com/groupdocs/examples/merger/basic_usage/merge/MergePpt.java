package com.groupdocs.examples.merger.basic_usage.merge;


import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to merge multiple PPT files into single file.
 * For more details about merging PowerPoint Presentation (.ppt) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/ppt
 */

public class MergePpt {
    public static Path run(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("merged.ppt");
        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                merger.join(inputFile2.toString());

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


            
            