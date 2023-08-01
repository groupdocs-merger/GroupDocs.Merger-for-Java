package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeZip {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.zip").getPath();

        // Load the source ZIP file
        Merger merger = new Merger(Constants.SAMPLE_ZIP);
        {
            // Add another ZIP file to merge
            merger.join(Constants.SAMPLE_ZIP);
            // Merge ZIP files and save result
            merger.save(outputFile);
        }

        System.out.print("\nZIP files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
