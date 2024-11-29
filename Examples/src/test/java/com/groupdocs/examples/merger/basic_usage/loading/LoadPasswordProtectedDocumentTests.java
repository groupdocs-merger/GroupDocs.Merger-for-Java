package com.groupdocs.examples.merger.basic_usage.loading;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.testng.annotations.Test;

class LoadPasswordProtectedDocumentTests extends TestsSetUp {


    @Test
    void testRun() {
        LoadPasswordProtectedDocument.run(SampleFiles.SAMPLE_PROTECTED_DOCX);
    }
}