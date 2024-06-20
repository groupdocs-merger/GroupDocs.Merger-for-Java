package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge.word;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.WordJoinCompliance;
import com.groupdocs.merger.domain.options.WordJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

/**
 * This example demonstrates how merge Word documents with pre-defined Compliance mode into single file.
 * For more details about merging Microsoft Word Document (.docx) files please check this documentation article
 * https://docs.groupdocs.com/merger/net/merge/word/
 */
public class MergeWordDocumentsWithPredefinedComplianceMode
{
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: MergeWordDocumentsWithPredefinedComplianceMode");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.docx").getPath();

        // Load the source DOCX file
        Merger merger = new Merger(Constants.SAMPLE_DOCX);
        {
            // Define Word join options
            WordJoinOptions joinOptions = new WordJoinOptions();
            joinOptions.setCompliance(WordJoinCompliance.Iso29500_2008_Strict);
            // Add another DOCX file to merge
            merger.join(Constants.SAMPLE_DOCX_2, joinOptions);
            // Merge DOCX files and save result
            merger.save(outputFile);
        }

        System.out.print("\nDOCX files merge completed successfully. \nCheck output in " +outputFolder );
    }
}

