package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLTX files into single file.
    * For more details about merging Microsoft Excel Open XML Template (.xltx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xltx
    */

    public class MergeXltx
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xltx").getPath();
            // Load the source XLTX file
            Merger merger = new Merger(Constants.SAMPLE_XLTX);
            {
                // Add another XLTX file to merge
                merger.join(Constants.SAMPLE_XLTX_2);
                // Merge XLTX files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLTX files merge completed successfully. \nCheck output in " + outputFolder);
        }
    }


            
            