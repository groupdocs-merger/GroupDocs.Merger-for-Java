package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple ODT files into single file.
    * For more details about merging Open Document Text (.odt) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/odt
    */

public class MergeOdt
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.odt").getPath();
                // Load the source ODT file
        Merger merger = new Merger(Constants.SAMPLE_ODT);
        {
            // Add another ODT file to merge
            merger.join(Constants.SAMPLE_ODT_2);
            // Merge ODT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nODT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            