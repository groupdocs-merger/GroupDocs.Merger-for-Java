package com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ExtractOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to extract document pages by specifying their numbers.
 */
public class ExtractPagesByNumbers {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX;
        String filePathOut = new File(Constants.OutputPath, "ExtractPagesByNumbers-"+ Paths.get(filePath).getFileName().toString()).getPath();

        ExtractOptions extractOptions = new ExtractOptions(new int[] { 1, 4 }); // Resultant document will contain pages 1 and 4

        Merger merger = new Merger(filePath);
        merger.extractPages(extractOptions);
        merger.save(filePathOut);

        System.out.print("Source document was extractmed successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}