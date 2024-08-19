package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
 * This example demonstrates how to merge multiple PPTM files into single file.
 * For more details about merging PowerPoint Open XML Presentation (.pptm) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/pptm
 */
public class MergePptm {
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: MergePptm");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.pptm").getPath();

        // Load the source PPTM file
        Merger merger = new Merger(Constants.SAMPLE_PPTM);
        {
            // Add another PPTM file to merge
            merger.join(Constants.SAMPLE_PPTM);
            // Merge PPTM files and save result
            merger.save(outputFile);
        }

        System.out.print("\nPPTM files merge completed successfully. \nCheck output in " + outputFolder);
    }
}
