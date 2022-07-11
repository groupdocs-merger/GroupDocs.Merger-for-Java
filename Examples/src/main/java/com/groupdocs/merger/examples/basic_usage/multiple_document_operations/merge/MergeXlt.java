package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLT files into single file.
    * For more details about merging Microsoft Excel Template (.xlt) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xlt
    */

    public class MergeXlt
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xlt").getPath();
                    // Load the source XLT file
            Merger merger = new Merger(Constants.SAMPLE_XLT);
            {
                // Add another XLT file to merge
                merger.join(Constants.SAMPLE_XLT_2);
                // Merge XLT files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLT files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            