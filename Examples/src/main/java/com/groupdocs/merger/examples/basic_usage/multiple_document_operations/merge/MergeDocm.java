package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOCM files into single file.
    * For more details about merging Microsoft Word Macro-Enabled Document (.docm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/docm
    */

public class MergeDocm
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.docm").getPath();
                // Load the source DOCM file
        Merger merger = new Merger(Constants.SAMPLE_DOCM);
        {
            // Add another DOCM file to merge
            merger.join(Constants.SAMPLE_DOCM_2);
            // Merge DOCM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOCM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}

            
            