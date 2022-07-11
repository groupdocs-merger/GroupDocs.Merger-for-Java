package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergePng {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.png").getPath();
        // Load the source PNG file
        Merger merger = new Merger(Constants.SAMPLE_PNG);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another PNG file to merge
            merger.join(Constants.SAMPLE_PNG, joinOptions);
            // Merge PNG files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nPNG files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
