package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class SplitTextFileTests extends TestsSetUp {


    @Test
    void testToLineRanges() {
        Path result = SplitTextFile.toLineRanges(SampleFiles.SAMPLE_TXT);
        Assertions.assertThat(result).isNotNull().exists();
    }

    @Test
    void testToSeparateLines() {
        Path result = SplitTextFile.toSeparateLines(SampleFiles.SAMPLE_TXT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}