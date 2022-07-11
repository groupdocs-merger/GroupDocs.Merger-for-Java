package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VSDM files into single file.
    * For more details about merging Visio Macro-Enabled Drawing (.vsdm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vsdm
    */

public class MergeVsdm
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vsdm").getPath();
        // Load the source VSDM file
        Merger merger = new Merger(Constants.SAMPLE_VSDM);
        {
            // Add another VSDM file to merge
            merger.join(Constants.SAMPLE_VSDM_2);
            // Merge VSDM files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVSDM files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            