package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple PPSX files into single file.
    * For more details about merging PowerPoint Open XML Slide Show (.ppsx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/ppsx
    */

public class MergePpsx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.ppsx").getPath();
        // Load the source PPSX file
        Merger merger = new Merger(Constants.SAMPLE_PPSX);
        {
            // Add another PPSX file to merge
            merger.join(Constants.SAMPLE_PPSX_2);
            // Merge PPSX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPPSX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            