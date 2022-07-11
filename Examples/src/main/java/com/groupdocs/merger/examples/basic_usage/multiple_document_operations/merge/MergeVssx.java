package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSSX files into single file.
    * For more details about merging Visio Stencil File Format (.vssx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vssx
    */

public class MergeVssx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vssx").getPath();
        // Load the source VSSX file
        Merger merger = new Merger(Constants.SAMPLE_VSSX);
        {
            // Add another VSSX file to merge
            merger.join(Constants.SAMPLE_VSSX_2);
            // Merge VSSX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSSX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            