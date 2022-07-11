package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple ONE files into single file.
    * For more details about merging Microsoft OneNote File Format (.one) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/one
    */

public class MergeOne
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.one").getPath();
        // Load the source ONE file
        Merger merger = new Merger(Constants.SAMPLE_ONE);
        {
            // Add another ONE file to merge
            merger.join(Constants.SAMPLE_ONE_2);
            // Merge ONE files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nONE files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            