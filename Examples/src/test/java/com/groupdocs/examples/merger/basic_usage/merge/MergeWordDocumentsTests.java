package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeWordDocumentsTests extends TestsSetUp {


    @Test
    void testWithoutStartingFromNewPage() {
        Path result = MergeWordDocuments.withoutStartingFromNewPage(SampleFiles.SAMPLE_DOC, SampleFiles.SAMPLE_DOC);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testWithPredefinedComplianceMode() {
        Path result = MergeWordDocuments.withPredefinedComplianceMode(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE2_DOCX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}