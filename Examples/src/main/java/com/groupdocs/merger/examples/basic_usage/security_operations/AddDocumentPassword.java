package com.groupdocs.merger.examples.basic_usage.security_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.AddPasswordOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to add password to document.
 */
public class AddDocumentPassword {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PPTX;
        String filePathOut = new File(Constants.OutputPath, "AddDocumentPassword-"+ Paths.get(filePath).getFileName().toString()).getPath();

        AddPasswordOptions addOptions = new AddPasswordOptions(Constants.SAMPLE_PASSWORD);

        Merger merger = new Merger(filePath);
        merger.addPassword(addOptions);
        merger.save(filePathOut);


        System.out.print("Source document password was added successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}