package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple ODS files into single file.
    * For more details about merging Open Document Spreadsheet (.ods) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/ods
    */

public class MergeOds
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.ods").getPath();
        // Load the source ODS file
        Merger merger = new Merger(Constants.SAMPLE_ODS);
        {
            // Add another ODS file to merge
            merger.join(Constants.SAMPLE_ODS_2);
            // Merge ODS files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nODS files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            