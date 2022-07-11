package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
    /**
    * This example demonstrates how to merge multiple HTML files into single file.
    * For more details about merging Hyper Text Markup Language (.html) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/html
    */

public class MergeHtml
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.html").getPath();
        // Load the source HTML file
        Merger merger = new Merger(Constants.SAMPLE_HTML);
        {
            // Add another HTML file to merge
            merger.join(Constants.SAMPLE_HTML_2);
            // Merge HTML files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nHTML files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            