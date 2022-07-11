package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple PPS files into single file.
    * For more details about merging Microsoft PowerPoint Slide Show (.pps) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/pps
    */

public class MergePps
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.pps").getPath();
                // Load the source PPS file
        Merger merger = new Merger(Constants.SAMPLE_PPS);
        {
            // Add another PPS file to merge
            merger.join(Constants.SAMPLE_PPS_2);
            // Merge PPS files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPPS files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            