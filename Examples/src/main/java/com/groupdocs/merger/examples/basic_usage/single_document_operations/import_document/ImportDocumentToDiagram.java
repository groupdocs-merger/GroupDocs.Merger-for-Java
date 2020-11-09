package com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document;

import com.groupdocs.merger.Merger;

import com.groupdocs.merger.domain.options.OleDiagramOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportDocumentToDiagram {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_VSDX;
        String imageFilePath = Constants.SAMPLE_EMF;
        String embeddedFilePath = Constants.SAMPLE_PPTX;
        String filePathOut = new File(Constants.OutputPath, "ImportDocumentToDiagram" + Paths.get(filePath).getFileName().toString()).getPath();


        File file = new File(imageFilePath);
        byte[] imageBytes = Files.readAllBytes(file.toPath());

        int pageNumber = 2;
        OleDiagramOptions oleDiagramOptions = new OleDiagramOptions(embeddedFilePath, imageBytes, pageNumber);
        oleDiagramOptions.setX(1);
        oleDiagramOptions.setY(1);
        oleDiagramOptions.setWidth(2);
        oleDiagramOptions.setHeight(1);

        Merger merger = new Merger(filePath);

        merger.importDocument(oleDiagramOptions);
        merger.save(filePathOut);


        System.out.print("Embedded object was added to the source document successfully.");
        System.out.print("Check output "+filePathOut);
    }
}
