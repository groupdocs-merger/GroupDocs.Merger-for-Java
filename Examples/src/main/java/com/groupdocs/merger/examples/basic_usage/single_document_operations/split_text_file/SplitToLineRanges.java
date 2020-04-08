package com.groupdocs.merger.examples.basic_usage.single_document_operations.split_text_file;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.TextSplitMode;
import com.groupdocs.merger.domain.options.TextSplitOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to split the text file to the line interval text ones.
 */
public class SplitToLineRanges {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_TXT;
        String filePathOut = new File(Constants.OutputPath, "SplitToLineRanges-"+ Paths.get(filePath).getFileName().toString()).getPath();

        TextSplitOptions splitOptions = new TextSplitOptions(filePathOut, TextSplitMode.Interval, new int[] { 3, 6 });

        Merger merger = new Merger(filePath);
        merger.split(splitOptions);


        System.out.print("Source document was splitted successfully.");
        System.out.print("Check output " + filePathOut + ".");

    }
}