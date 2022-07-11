package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
  /**
    * This example demonstrates how to merge multiple DOC files into single file.
    * For more details about merging Microsoft Word Document (.doc) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/doc
    */

public class MergeDoc
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.doc").getPath();
        // Load the source DOC file
        Merger merger = new Merger(Constants.SAMPLE_DOC);
        {
            // Add another DOC file to merge
            merger.join(Constants.SAMPLE_DOC_2);
            // Merge DOC files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nDOC files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            