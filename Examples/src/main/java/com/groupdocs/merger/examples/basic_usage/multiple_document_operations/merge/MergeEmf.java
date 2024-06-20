package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
 * This example demonstrates how to merge multiple EMF files into single file.
 * For more details about merging image (.emf) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/images/
 */
public class MergeEmf
{
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: MergeEmf");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.emf").getPath();

        // Load the source EMF file
        Merger merger = new Merger(Constants.SAMPLE_EMF);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another EMF file to merge
            merger.join(Constants.SAMPLE_EMF, joinOptions);
            // Merge EMF files and save result
            merger.save(outputFile);
        }

        System.out.print("\nEMF files merge completed successfully. \nCheck output in "+outputFolder );
    }
}

