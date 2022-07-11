package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLAM files into single file.
    * For more details about merging Microsoft Excel Macro-Enabled Add-In (.xlam) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xlam
    */

public class MergeXlam
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.xlam").getPath();
        // Load the source XLAM file
        Merger merger = new Merger(Constants.SAMPLE_XLAM);
        {
            // Add another XLAM file to merge
            merger.join(Constants.SAMPLE_XLAM_2);
            // Merge XLAM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nXLAM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            