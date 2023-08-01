package com.groupdocs.merger.examples.basic_usage;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.common.PageStreamFactory;
import com.groupdocs.merger.domain.options.PreviewMode;
import com.groupdocs.merger.domain.options.PreviewOptions;
import com.groupdocs.merger.domain.options.interfaces.IPreviewOptions;
import com.groupdocs.merger.examples.Constants;
//import com.groupdocs.merger.exception.GroupDocsException;
import com.groupdocs.merger.exceptions.GroupDocsMergerException;

import java.io.FileNotFoundException;
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

        IPreviewOptions previewOption = new PreviewOptions(new PageStreamFactory()  {
            @Override
            public OutputStream createPageStream(int pageNumber) {
                return createStream(pageNumber);
            }

            @Override
            public void closePageStream(int pageNumber, OutputStream pageStream) {
                releasePageStream(pageNumber, pageStream);
            }
        }, PreviewMode.JPEG);
        merger.generatePreview(previewOption);

    }

    private static String getImagePath(int pageNumber)
    {
        return Constants.OutputPath +"image-"+pageNumber+".jpg";
    }

    private static OutputStream createStream(int pageNumber)
    {
        try{
            String imageFilePath = getImagePath(pageNumber);
            return new FileOutputStream(imageFilePath);
        }catch (FileNotFoundException e){
            System.out.print(e.getMessage());
            return null;
        }

    }

    private static void releasePageStream(int pageNumber, OutputStream pageStream)
    {
        try {
            pageStream.close();
            String imageFilePath = getImagePath(pageNumber);
            System.out.print("Image file "+imageFilePath+" is ready for preview.");
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}