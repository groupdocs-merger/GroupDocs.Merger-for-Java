package com.groupdocs.merger.examples.basic_usage.single_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.OrientationMode;
import com.groupdocs.merger.domain.options.OrientationOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to change document page orientation.
 */
public class ChangePageOrientation {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX;
        String filePathOut = new File(Constants.OutputPath, "ChangePageOrientation-"+ Paths.get(filePath).getFileName().toString()).getPath();

        OrientationOptions orientationOptions = new OrientationOptions(OrientationMode.Landscape, new int[] { 3, 4 });

        Merger merger = new Merger(filePath);
        merger.changeOrientation(orientationOptions);
        merger.save(filePathOut);

        System.out.print("Source document changed orientation successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}