package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple TXT files into single file.
    * For more details about merging Plain Text File Format (.txt) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/txt
    */

public class MergeTxt
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.txt").getPath();
        // Load the source TXT file
        Merger merger = new Merger(Constants.SAMPLE_TXT);
        {
            // Add another TXT file to merge
            merger.join(Constants.SAMPLE_TXT_2);
            // Merge TXT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nTXT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            