package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSDX files into single file.
    * For more details about merging Microsoft Visio File Format (.vsdx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vsdx
    */

public class MergeVsdx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vsdx").getPath();
        // Load the source VSDX file
        Merger merger = new Merger(Constants.SAMPLE_VSDX);
        {
            // Add another VSDX file to merge
            merger.join(Constants.SAMPLE_VSDX_2);
            // Merge VSDX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSDX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            