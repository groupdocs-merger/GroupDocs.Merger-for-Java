package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
 * This example demonstrates how to merge multiple EMZ files into single file.
 * For more details about merging image (.emz) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/images/
 */
public class MergeEmz
{
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: MergeEmz");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.emz").getPath();

        // Load the source EMZ file
        Merger merger = new Merger(Constants.SAMPLE_EMZ);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another EMZ file to merge
            merger.join(Constants.SAMPLE_EMZ, joinOptions);
            // Merge EMZ files and save result
            merger.save(outputFile);
        }

        System.out.print("\nEMZ files merge completed successfully. \nCheck output in "+outputFolder );
    }
}

