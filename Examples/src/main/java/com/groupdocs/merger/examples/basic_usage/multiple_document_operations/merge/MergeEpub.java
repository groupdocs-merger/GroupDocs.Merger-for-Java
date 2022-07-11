package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
    /**
    * This example demonstrates how to merge multiple EPUB files into single file.
    * For more details about merging Digital E-Book File Format (.epub) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/epub
    */

public class MergeEpub
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.epub").getPath();
                // Load the source EPUB file
        Merger merger = new Merger(Constants.SAMPLE_EPUB);
        {
            // Add another EPUB file to merge
            merger.join(Constants.SAMPLE_EPUB_2);
            // Merge EPUB files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nEPUB files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            