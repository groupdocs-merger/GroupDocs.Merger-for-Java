package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeTar {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.tar").getPath();

        // Load the source TAR file
        Merger merger = new Merger(Constants.SAMPLE_TAR);
        {
            // Add another TAR file to merge
            merger.join(Constants.SAMPLE_TAR);
            // Merge TAR files and save result
            merger.save(outputFile);
        }

        System.out.print("\nTAR files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
