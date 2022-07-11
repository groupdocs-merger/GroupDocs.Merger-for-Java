package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSSM files into single file.
    * For more details about merging Microsoft Visio Macro Enabled File Format (.vssm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vssm
    */

public class MergeVssm
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vssm").getPath();
                // Load the source VSSM file
        Merger merger = new Merger(Constants.SAMPLE_VSSM);
        {
            // Add another VSSM file to merge
            merger.join(Constants.SAMPLE_VSSM_2);
            // Merge VSSM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSSM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            