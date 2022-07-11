package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VDX files into single file.
    * For more details about merging Microsoft Visio XML Drawing File Format (.vdx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vdx
    */

public class MergeVdx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vdx").getPath();
                // Load the source VDX file
        Merger merger = new Merger(Constants.SAMPLE_VDX);
        {
            // Add another VDX file to merge
            merger.join(Constants.SAMPLE_VDX_2);
            // Merge VDX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nVDX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            