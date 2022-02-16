package com.groupdocs.merger.examples.basic_usage.single_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.RotateMode;
import com.groupdocs.merger.domain.options.RotateOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to rotate document pages.
 */
public class RotatePages {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF_2;
        String filePathOut = new File(Constants.OutputPath, "RotatePages-"+ Paths.get(filePath).getFileName().toString()).getPath();

        RotateOptions rotateOptions = new RotateOptions(RotateMode.Rotate180, new int[] { 1 });

        Merger merger = new Merger(filePath);
        merger.rotatePages(rotateOptions);
        merger.save(filePathOut);


        System.out.print("Source document was rotated successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}