package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class ExtractPagesTests extends TestsSetUp {


    @Test
    void testByNumbers() {
        Path result = ExtractPages.byNumbers(SampleFiles.SAMPLE_DOCX);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testByRange() {
        Path result = ExtractPages.byRange(SampleFiles.SAMPLE_DOCX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}