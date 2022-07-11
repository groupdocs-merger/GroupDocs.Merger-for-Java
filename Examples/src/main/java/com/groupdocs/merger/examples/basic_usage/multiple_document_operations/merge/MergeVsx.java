package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSX files into single file.
    * For more details about merging Vector Scalar Extension (.vsx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vsx
    */

public class MergeVsx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vsx").getPath();
        // Load the source VSX file
        Merger merger = new Merger(Constants.SAMPLE_VSX);
        {
            // Add another VSX file to merge
            merger.join(Constants.SAMPLE_VSX_2);
            // Merge VSX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            