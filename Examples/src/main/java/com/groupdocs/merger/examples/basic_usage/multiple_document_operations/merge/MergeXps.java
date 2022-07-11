package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
    * This example demonstrates how to merge multiple XPS files into single file.
    * For more details about merging Open XML Paper Specification (.xps) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xps
    */
    public class MergeXps
    {
        public static void run() throws Exception
        {            
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xps").getPath();
            
            // Load the source XPS file
            Merger merger = new Merger(Constants.SAMPLE_XPS);
            {
                // Add another XPS file to merge
                merger.join(Constants.SAMPLE_XPS_2);
                // Merge XPS files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXPS files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            