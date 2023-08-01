package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeSvg {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.svg").getPath();

        // Load the source SVG file
        Merger merger = new Merger(Constants.SAMPLE_SVG);
        {
            // Define image join options with vertical join mode
            ImageJoinOptions joinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
            // Add another SVG file to merge
            merger.join(Constants.SAMPLE_SVG, joinOptions);
            // Merge SVG files and save result
            merger.save(outputFile);
        }

        System.out.print("\nSVG files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
