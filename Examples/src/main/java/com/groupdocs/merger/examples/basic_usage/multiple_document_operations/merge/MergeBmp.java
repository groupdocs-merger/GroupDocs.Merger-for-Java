package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeBmp {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.bmp").getPath();

        // Load the source BMP file
        Merger merger = new Merger(Constants.SAMPLE_BMP);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another BMP file to merge
            merger.join(Constants.SAMPLE_BMP, joinOptions);
            // Merge BMP files and save result
            merger.save(outputFile);
        }

        System.out.print("\nBMP files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
