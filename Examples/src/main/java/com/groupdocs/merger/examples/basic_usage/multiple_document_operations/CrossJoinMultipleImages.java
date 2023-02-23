package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.domain.options.interfaces.IImageJoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
     * This example demonstrates how to join documents with different file types.
     */
    public class CrossJoinMultipleImages
    {
        public static void run() throws Exception
        {
            String filePath = Constants.SAMPLE_PNG;
            String filePathOut = new File(Constants.OutputPath, "CrossJoinMultipleDocuments-" + Paths.get(filePath).getFileName().toString()).getPath();

            IImageJoinOptions imageJoinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);

            Merger merger = new Merger(filePath);
            {
                merger.join(Constants.SAMPLE_BMP, imageJoinOptions);
                merger.join(Constants.SAMPLE_JPG, imageJoinOptions);
                merger.save(filePathOut);
            }

            System.out.print("Source documents was merged successfully.");
            System.out.print("Check output "+filePathOut);
        }
    }

