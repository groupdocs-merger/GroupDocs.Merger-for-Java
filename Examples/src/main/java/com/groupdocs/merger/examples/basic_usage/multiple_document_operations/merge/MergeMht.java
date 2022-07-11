package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
    /**
    * This example demonstrates how to merge multiple MHT files into single file.
    * For more details about merging MIME Encapsulation of Aggregate HTML (.mht) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/mht
    */

public class MergeMht
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.mht").getPath();
                // Load the source MHT file
        Merger merger = new Merger(Constants.SAMPLE_MHT);
        {
            // Add another MHT file to merge
            merger.join(Constants.SAMPLE_MHT_2);
            // Merge MHT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nMHT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            