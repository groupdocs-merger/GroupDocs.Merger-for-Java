package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class MergeWav {
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.wav").getPath();

        // Load the source Wav file
        Merger merger = new Merger(Constants.SAMPLE_WAV);
        {
            // Add another Wav file to merge
            merger.join(Constants.SAMPLE_WAV);
            // Merge Wav files and save result
            merger.save(outputFile);
        }

        System.out.print("\nWav files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
