package com.groupdocs.merger.examples.basic_usage;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.common.CreatePageStream;
import com.groupdocs.merger.domain.common.ReleasePageStream;
import com.groupdocs.merger.domain.options.PreviewMode;
import com.groupdocs.merger.domain.options.PreviewOptions;
import com.groupdocs.merger.domain.options.interfaces.IPreviewOptions;
import com.groupdocs.merger.examples.Constants;
import com.groupdocs.merger.exception.GroupDocsException;
import com.groupdocs.merger.exceptions.GroupDocsMergerException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * This example demonstrates how to generate document pages preview.
 */
public class GenerateDocumentPagesPreview {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_XLSX;

        Merger merger = new Merger(filePath);

        IPreviewOptions previewOption = new PreviewOptions(new CreatePageStream() {
            @Override
            public OutputStream invoke(int pageNumber) {
                return createPageStream(pageNumber);
            }
        }, new ReleasePageStream() {
            @Override
            public void invoke(int pageNumber, OutputStream pageStream) {
                releasePageStream(pageNumber, pageStream);
            }
        }, PreviewMode.JPEG);
        merger.generatePreview(previewOption);

    }

    private static String getImagePath(int pageNumber)
    {
        return Constants.OutputPath +"\\image-" + pageNumber+".jpg";
    }

    private static OutputStream createPageStream(int pageNumber)
    {
        try{
            String imageFilePath = getImagePath(pageNumber);
            return new FileOutputStream(imageFilePath);
        }catch (Exception e){
            throw new GroupDocsException(e.getMessage());
        }

    }

    private static void releasePageStream(int pageNumber, OutputStream pageStream)
    {
        try {
            pageStream.close();
            String imageFilePath = getImagePath(pageNumber);
            System.out.print("Image file " + imageFilePath+" is ready for preview.");
        }catch (Exception e){
            throw new GroupDocsException(e.getMessage());
        }
    }
}