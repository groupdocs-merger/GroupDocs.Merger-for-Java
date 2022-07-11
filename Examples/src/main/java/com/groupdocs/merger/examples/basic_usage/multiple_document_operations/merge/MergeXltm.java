package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLTM files into single file.
    * For more details about merging Microsoft Excel Macro-Enabled Template (.xltm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xltm
    */

    public class MergeXltm
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xltm").getPath();
            // Load the source XLTM file
            Merger merger = new Merger(Constants.SAMPLE_XLTM);
            {
                // Add another XLTM file to merge
                merger.join(Constants.SAMPLE_XLTM_2);
                // Merge XLTM files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLTM files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            