package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOTX files into single file.
    * For more details about merging Word Open XML Document Template (.dotx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/dotx
    */

public class MergeDotx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.dotx").getPath();
        // Load the source DOTX file
        Merger merger = new Merger(Constants.SAMPLE_DOTX);
        {
            // Add another DOTX file to merge
            merger.join(Constants.SAMPLE_DOTX_2);
            // Merge DOTX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOTX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            