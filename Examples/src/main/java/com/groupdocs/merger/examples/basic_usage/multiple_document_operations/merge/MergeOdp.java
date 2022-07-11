package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;


import java.io.File;
/**
    * This example demonstrates how to merge multiple ODP files into single file.
    * For more details about merging OpenDocument Presentation File Format (.odp) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/odp
    */

public class MergeOdp
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.odp").getPath();
                // Load the source ODP file
        Merger merger = new Merger(Constants.SAMPLE_ODP);
        {
            // Add another ODP file to merge
            merger.join(Constants.SAMPLE_ODP_2);
            // Merge ODP files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nODP files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            