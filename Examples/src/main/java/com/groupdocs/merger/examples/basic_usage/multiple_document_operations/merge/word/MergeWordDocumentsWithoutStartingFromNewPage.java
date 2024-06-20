package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge.word;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.WordJoinMode;
import com.groupdocs.merger.domain.options.WordJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
 * This example demonstrates how merge Word documents without starting from a new page into single file.
 * For more details about merging Microsoft Word Document (.doc) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/word/
 */
public class MergeWordDocumentsWithoutStartingFromNewPage
{
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: MergeWordDocumentsWithoutStartingFromNewPage");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.doc").getPath();

        // Load the source DOC file
        Merger merger = new Merger(Constants.SAMPLE_DOC);
        {
            // Define Word join options
            WordJoinOptions joinOptions = new WordJoinOptions();
            joinOptions.setMode(WordJoinMode.Continuous);
            // Add another DOC file to merge
            merger.join(Constants.SAMPLE_DOC_2, joinOptions);
            // Merge DOC files and save result
            merger.save(outputFile);
        }

        System.out.print("\nDOC files merge completed successfully. \nCheck output in "+outputFolder );
    }
}

