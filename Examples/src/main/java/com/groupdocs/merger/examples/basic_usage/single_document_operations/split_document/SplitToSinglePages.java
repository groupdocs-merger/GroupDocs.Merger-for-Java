package com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.common.SplitStreamFactory;
import com.groupdocs.merger.domain.options.SplitMode;
import com.groupdocs.merger.domain.options.SplitOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *This example demonstrates how to split the document to several one-page documents (by exact page numbers).
 */
public class SplitToSinglePages {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_10_PAGES;
        String filePathOut = new File(Constants.OutputPath, "SplitToSinglePages-"+ Paths.get(filePath).getFileName().toString()).getPath();

        SplitOptions splitOptions = new SplitOptions(filePathOut, new int[] { 3, 6, 8 });
        Merger merger = new Merger(filePath);
        merger.split(splitOptions);


        System.out.print("Source document was splitted successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }

    public static List<OutputStream> getPagesStream() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_10_PAGES;
        final List<OutputStream> resultStreams = new ArrayList<OutputStream>();
        SplitOptions splitOptions = new SplitOptions(new SplitStreamFactory() {
            @Override
            public OutputStream createSplitStream(int pageNumber) {
                return new ByteArrayOutputStream();
            }

            @Override
            public void closeSplitStream(int pageNumber, OutputStream pageStream) {
                resultStreams.add(pageStream);
            }
        },  new int[] { 3, 4}, SplitMode.Pages);
        Merger merger = new Merger(filePath);
        merger.split(splitOptions);

        return resultStreams;

    }
}