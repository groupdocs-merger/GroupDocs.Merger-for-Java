package com.groupdocs.merger.examples.basic_usage.single_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.SwapOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to swap document pages.
 */
public class SwapPages {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PPTX;
        String filePathOut = new File(Constants.OutputPath, "SwapPages-"+ Paths.get(filePath).getFileName().toString()).getPath();

        int pageNumber1 = 3;
        int pageNumber2 = 6;
        SwapOptions swapOptions = new SwapOptions(pageNumber2, pageNumber1);

        Merger merger = new Merger(filePath);
        merger.swapPages(swapOptions);
        merger.save(filePathOut);



        System.out.print("Source document was swapped successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}