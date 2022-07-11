package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple OTT files into single file.
    * For more details about merging Open Document Template (.ott) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/ott
    */

public class MergeOtt
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.ott").getPath();
        // Load the source OTT file
        Merger merger = new Merger(Constants.SAMPLE_OTT);
        {
            // Add another OTT file to merge
            merger.join(Constants.SAMPLE_OTT_2);
            // Merge OTT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nOTT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            