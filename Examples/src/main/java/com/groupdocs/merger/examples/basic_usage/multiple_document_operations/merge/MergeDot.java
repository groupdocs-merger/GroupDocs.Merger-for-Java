package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOT files into single file.
    * For more details about merging Microsoft Word Document Template (.dot) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/dot
    */

public class MergeDot
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.dot").getPath();
        // Load the source DOT file
        Merger merger = new Merger(Constants.SAMPLE_DOT);
        {
            // Add another DOT file to merge
            merger.join(Constants.SAMPLE_DOT_2);
            // Merge DOT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}

            
            