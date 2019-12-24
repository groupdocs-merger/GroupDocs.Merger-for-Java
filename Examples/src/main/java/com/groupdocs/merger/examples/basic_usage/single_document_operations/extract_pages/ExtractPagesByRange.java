package com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ExtractOptions;
import com.groupdocs.merger.domain.options.RangeMode;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to extract document pages by specifying page numbers range.
 */
public class ExtractPagesByRange {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX;
        String filePathOut = new File(Constants.OutputPath, "ExtractPagesByRange-" + Paths.get(filePath).getFileName().toString()).getPath();

        ExtractOptions extractOptions = new ExtractOptions(1, 3, RangeMode.EvenPages); // Resultant document will contain page 2

        Merger merger = new Merger(filePath);
        merger.extractPages(extractOptions);
        merger.save(filePathOut);

        System.out.print("Source document was extractmed successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}