package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple RTF files into single file.
    * For more details about merging Rich Text File Format (.rtf) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/rtf
    */

public class MergeRtf
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.rtf").getPath();
        // Load the source RTF file
        Merger merger = new Merger(Constants.SAMPLE_RTF);
        {
            // Add another RTF file to merge
            merger.join(Constants.SAMPLE_RTF_2);
            // Merge RTF files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nRTF files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
