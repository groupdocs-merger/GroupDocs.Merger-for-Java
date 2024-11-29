package com.groupdocs.examples.merger.basic_usage.loading;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.testng.annotations.Test;

class LoadDocumentTests extends TestsSetUp {


    @Test
    void testFromLocalDisk() {
        LoadDocument.fromLocalDisk(SampleFiles.SAMPLE_DOCX);
    }

    @Test
    void testFromStream() {
        LoadDocument.fromStream(SampleFiles.SAMPLE_DOCX);
    }

    @Test
    void testFromUrl() {
        LoadDocument.fromUrl("https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java/blob/master/Examples/Resources/SampleFiles/Pdf/sample.pdf?raw=true");
    }
}