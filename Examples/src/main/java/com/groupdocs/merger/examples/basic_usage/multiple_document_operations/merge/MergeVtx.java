package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple VTX files into single file.
    * For more details about merging Microsoft Visio Drawing Template (.vtx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/vtx
    */

public class MergeVtx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.vtx").getPath();
                    // Load the source VTX file
            Merger merger = new Merger(Constants.SAMPLE_VTX);
            {
                // Add another VTX file to merge
                merger.join(Constants.SAMPLE_VTX_2);
                // Merge VTX files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nVTX files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            