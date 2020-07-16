package com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.OleSpreadsheetOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to add the OLE object to the Spreadsheet document page.
 */
public class ImportDocumentToSpreadsheet {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_XLSX;
        String embeddedFilePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, "ImportDocumentToSpreadsheet-" + Paths.get(filePath).getFileName().toString()).getPath();

        int pageNumber = 2;
        OleSpreadsheetOptions oleCellsOptions = new OleSpreadsheetOptions(embeddedFilePath, pageNumber);
        oleCellsOptions.setRowIndex(2);
        oleCellsOptions.setColumnIndex(2);

        Merger merger = new Merger(filePath);
        {
            merger.importDocument(oleCellsOptions);
            merger.save(filePathOut);
        }

        System.out.print("Embedded object was added to the source document page successfully.");
        System.out.print("Check output "+filePathOut);
    }
}