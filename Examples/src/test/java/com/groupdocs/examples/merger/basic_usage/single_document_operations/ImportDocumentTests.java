package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class ImportDocumentTests extends TestsSetUp {


    @Test
    void testToDiagram() {
        Path result = ImportDocument.toDiagram(SampleFiles.SAMPLE_VSDX, SampleFiles.SAMPLE_EMF, SampleFiles.SAMPLE_PPTX);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToPdf() {
        Path result = ImportDocument.toPdf(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_PPTX);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToPresentation() {
        Path result = ImportDocument.toPresentation(SampleFiles.SAMPLE_PPTX, SampleFiles.SAMPLE_PDF);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToSpreadsheet() {
        Path result = ImportDocument.toSpreadsheet(SampleFiles.SAMPLE_XLSX, SampleFiles.SAMPLE_PDF);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToWordProcessing() {
        Path result = ImportDocument.toWordProcessing(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE_PDF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}