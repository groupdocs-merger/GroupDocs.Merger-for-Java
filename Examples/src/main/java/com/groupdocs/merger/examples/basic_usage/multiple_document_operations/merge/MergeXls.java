package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLS files into single file.
    * For more details about merging Microsoft Excel Binary File Format (.xls) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xls
    */

public class MergeXls
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.xls").getPath();
        // Load the source XLS file
        Merger merger = new Merger(Constants.SAMPLE_XLS);
        {
            // Add another XLS file to merge
            merger.join(Constants.SAMPLE_XLS_2);
            // Merge XLS files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nXLS files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}



            
            