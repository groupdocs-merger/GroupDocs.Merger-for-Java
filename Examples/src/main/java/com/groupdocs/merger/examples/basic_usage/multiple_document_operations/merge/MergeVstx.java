package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSTX files into single file.
    * For more details about merging Microsoft Visio File Format (.vstx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vstx
    */

public class MergeVstx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vstx").getPath();
                // Load the source VSTX file
        Merger merger = new Merger(Constants.SAMPLE_VSTX);
        {
            // Add another VSTX file to merge
            merger.join(Constants.SAMPLE_VSTX_2);
            // Merge VSTX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSTX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            