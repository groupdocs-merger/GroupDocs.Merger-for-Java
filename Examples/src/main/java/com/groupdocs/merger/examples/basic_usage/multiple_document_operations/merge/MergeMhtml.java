package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
    /**
    * This example demonstrates how to merge multiple MHTML files into single file.
    * For more details about merging MIME Encapsulation of Aggregate HTML (.mhtml) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/mhtml
    */

public class MergeMhtml
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.mhtml").getPath();
        // Load the source MHTML file
        Merger merger = new Merger(Constants.SAMPLE_MHTML);
        {
            // Add another MHTML file to merge
            merger.join(Constants.SAMPLE_MHTML_2);
            // Merge MHTML files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nMHTML files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            