package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple PPTX files into single file.
    * For more details about merging PowerPoint Open XML Presentation (.pptx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/pptx
    */

public class MergePptx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.pptx").getPath();
                // Load the source PPTX file
        Merger merger = new Merger(Constants.SAMPLE_PPTX);
        {
            // Add another PPTX file to merge
            merger.join(Constants.SAMPLE_PPTX_2);
            // Merge PPTX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPPTX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            