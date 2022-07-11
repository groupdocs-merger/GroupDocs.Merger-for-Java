package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSTM files into single file.
    * For more details about merging Visio Macro-Enabled Drawing Template (.vstm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vstm
    */

public class MergeVstm
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vstm").getPath();
        // Load the source VSTM file
        Merger merger = new Merger(Constants.SAMPLE_VSTM);
        {
            // Add another VSTM file to merge
            merger.join(Constants.SAMPLE_VSTM_2);
            // Merge VSTM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSTM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            