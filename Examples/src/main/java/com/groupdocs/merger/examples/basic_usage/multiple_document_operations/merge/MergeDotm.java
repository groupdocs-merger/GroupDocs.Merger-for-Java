package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOTM files into single file.
    * For more details about merging Microsoft Word Macro-Enabled Template (.dotm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/dotm
    */

public class MergeDotm
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.dotm").getPath();
        // Load the source DOTM file
        Merger merger = new Merger(Constants.SAMPLE_DOTM);
        {
            // Add another DOTM file to merge
            merger.join(Constants.SAMPLE_DOTM_2);
            // Merge DOTM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOTM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            