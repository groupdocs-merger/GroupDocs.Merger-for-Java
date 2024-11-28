package com.groupdocs.examples.merger.basic_usage.merge;


import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to merge multiple VSSM files into single file.
 * For more details about merging Microsoft Visio Macro Enabled File Format (.vssm) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/vssm
 */

public class MergeVssm {
    public static Path run(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("merged.vssm");
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


            
            