package com.groupdocs.merger.examples.basic_usage.security_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.LoadOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to remove document password.
 */
public class RemoveDocumentPassword {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_PROTECTED;
        String filePathOut = new File(Constants.OutputPath, "RemoveDocumentPassword-" + Paths.get(filePath).getFileName().toString()).getPath();

        LoadOptions loadOptions = new LoadOptions(Constants.SAMPLE_PASSWORD);

        Merger merger = new Merger(filePath, loadOptions);
        merger.removePassword();
        merger.save(filePathOut);

        System.out.print("Source document password was removed successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}