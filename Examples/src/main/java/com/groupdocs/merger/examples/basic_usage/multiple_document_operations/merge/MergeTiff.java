package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeTiff {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.tiff").getPath();

        // Load the source TIFF file
        Merger merger = new Merger(Constants.SAMPLE_TIFF);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another TIFF file to merge
            merger.join(Constants.SAMPLE_TIFF, joinOptions);
            // Merge TIFF files and save result
            merger.save(outputFile);
        }

        System.out.print("\nTIFF files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
