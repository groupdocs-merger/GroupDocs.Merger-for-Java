package com.groupdocs.merger.examples.basic_usage.security_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.LoadOptions;
import com.groupdocs.merger.domain.options.UpdatePasswordOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to update document password.
 */
public class UpdateDocumentPassword {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_XLSX_PROTECTED;
        String filePathOut = new File(Constants.OutputPath, "UpdateDocumentPassword-" + Paths.get(filePath).getFileName().toString()).getPath();

        LoadOptions loadOptions = new LoadOptions(Constants.SAMPLE_PASSWORD);
        UpdatePasswordOptions updateOptions = new UpdatePasswordOptions(Constants.SAMPLE_PASSWORD + Constants.SAMPLE_PASSWORD);

        Merger merger = new Merger(filePath, loadOptions);
        merger.updatePassword(updateOptions);
        merger.save(filePathOut);

        System.out.print("Source document password was updated successfully.");
        System.out.print("Check output " + filePathOut + ".");

    }
}