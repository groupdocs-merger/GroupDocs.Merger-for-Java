package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeTif {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.tif").getPath();

        // Load the source TIF file
        Merger merger = new Merger(Constants.SAMPLE_TIF);
        {
            // Add another TIF file to merge
            merger.join(Constants.SAMPLE_TIF);
            // Merge TIF files and save result
            merger.save(outputFile);
        }

        System.out.print("\nTIF files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
