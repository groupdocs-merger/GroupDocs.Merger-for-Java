package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple PPT files into single file.
    * For more details about merging PowerPoint Presentation (.ppt) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/ppt
    */

public class MergePpt
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.ppt").getPath();
        // Load the source PPT file
        Merger merger = new Merger(Constants.SAMPLE_PPT);
        {
            // Add another PPT file to merge
            merger.join(Constants.SAMPLE_PPT_2);
            // Merge PPT files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPPT files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            