package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class SplitDocumentTests extends TestsSetUp {


    @Test
    void testToMultiPageDocuments() {
        Path result = SplitDocument.toMultiPageDocuments(SampleFiles.SAMPLE_DOCX_10_PAGES);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToSinglePages() {
        Path result = SplitDocument.toSinglePages(SampleFiles.SAMPLE_DOCX_10_PAGES);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToSinglePagesByRange() {
        Path result = SplitDocument.toSinglePagesByRange(SampleFiles.SAMPLE_DOCX_10_PAGES);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToSinglePagesByRangeWithFilter() {
        Path result = SplitDocument.toSinglePagesByRangeWithFilter(SampleFiles.SAMPLE_DOCX_10_PAGES);
        Assertions.assertThat(result).isNotNull().exists();
    }
}