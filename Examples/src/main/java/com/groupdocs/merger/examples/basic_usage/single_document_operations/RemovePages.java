package com.groupdocs.merger.examples.basic_usage.single_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.RemoveOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to remove document pages.
 */
public class RemovePages {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_10_PAGES;
        String filePathOut = new File(Constants.OutputPath, "RemoveDocumentPage-"+ Paths.get(filePath).getFileName().toString()).getPath();

        RemoveOptions removeOptions = new RemoveOptions(new int[] { 3, 5 });

        Merger merger = new Merger(filePath);

        merger.removePages(removeOptions);
        merger.save(filePathOut);

        System.out.print("Source document pages was removed successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}
