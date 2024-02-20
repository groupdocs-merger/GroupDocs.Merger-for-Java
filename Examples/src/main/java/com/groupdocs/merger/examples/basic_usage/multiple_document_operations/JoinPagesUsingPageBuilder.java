package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.builders.PageBuilder;
import com.groupdocs.merger.domain.options.PageBuilderOptions;
import com.groupdocs.merger.domain.result.IPageInfo;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

public class JoinPagesUsingPageBuilder {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, Paths.get(filePath).getFileName().toString()).getPath();

        Merger merger = new Merger(filePath);
        {
            merger.join(Constants.SAMPLE_PDF_2);

            PageBuilder pageBuilder = merger.createPageBuilder();
            pageBuilder.addPage(pageBuilder.getDocuments().get(1).getPages()[0]); // Add 1 page of the second document
            pageBuilder.addPage(pageBuilder.getDocuments().get(0).getPages()[1]); // Add 2 page of the first document
            pageBuilder.addPage(pageBuilder.getDocuments().get(1).getPages()[1]); // Add 2 page of the second document

            merger.applyPageBuilder(pageBuilder);
            merger.save(filePathOut);
        }

        System.out.print("Source documents were merged successfully.");
        System.out.print("Check output "+filePathOut);
    }
}
