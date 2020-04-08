package com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.FileType;
import com.groupdocs.merger.domain.options.LoadOptions;
import com.groupdocs.merger.exceptions.GroupDocsMergerException;

import java.io.InputStream;
import java.net.URL;

/**
 * This example demonstrates how to load document from url.
 */
public class LoadDocumentFromUrl {
    public static void run() throws Exception
    {
         String url = "https://github.com/groupdocs-merger/GroupDocs.Merger-for-.NET/blob/master/Examples/Resources/SampleFiles/Pdf/sample.pdf?raw=true";
         try {
             InputStream stream = new URL(url).openStream();

             LoadOptions loadOptions = new LoadOptions(FileType.PDF);
             Merger merger = new Merger(stream, loadOptions);
             System.out.print("Document loaded from URL successfully.");
         } catch ( Exception e){
             throw new GroupDocsMergerException(e.getMessage());
         }

    }

}