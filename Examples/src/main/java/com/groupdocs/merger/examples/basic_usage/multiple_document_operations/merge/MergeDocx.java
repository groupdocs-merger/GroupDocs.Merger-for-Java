package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOCX files into single file.
    * For more details about merging Microsoft Word Open XML Document (.docx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/docx
    */

public class MergeDocx
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.docx").getPath();
        // Load the source DOCX file
        Merger merger = new Merger(Constants.SAMPLE_DOCX);
        {
            // Add another DOCX file to merge
            merger.join(Constants.SAMPLE_DOCX_2);
            // Merge DOCX files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOCX files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            