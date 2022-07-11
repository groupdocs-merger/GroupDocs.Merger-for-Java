package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple TEX files into single file.
    * For more details about merging LaTeX Source Document (.tex) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/tex
    */

public class MergeTex
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.tex").getPath();
        // Load the source TEX file
        Merger merger = new Merger(Constants.SAMPLE_TEX);
        {
            // Add another TEX file to merge
            merger.join(Constants.SAMPLE_TEX_2);
            // Merge TEX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nTEX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            