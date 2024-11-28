package com.groupdocs.examples.merger.basic_usage.merge;


import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to merge multiple EMF files into single file.
 * For more details about merging image (.emf) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/images/
 */
public class MergeEmf {
    public static Path run(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("merged.dotx");
        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                // Define image join options with vertical join mode
                ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);

                merger.join(inputFile2.toString(), joinOptions);

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

