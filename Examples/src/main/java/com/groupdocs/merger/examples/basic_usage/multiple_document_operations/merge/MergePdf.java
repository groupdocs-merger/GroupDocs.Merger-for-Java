package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple PDF files into single file.
    * For more details about merging Portable Document (.pdf) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/pdf
    */

public class MergePdf
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.pdf").getPath();
        // Load the source PDF file
        Merger merger = new Merger(Constants.SAMPLE_PDF);
        {
            // Add another PDF file to merge
            merger.join(Constants.SAMPLE_PDF_2);
            // Merge PDF files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPDF files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
