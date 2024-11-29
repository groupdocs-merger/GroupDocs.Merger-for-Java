package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeDocxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeDocx.run(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE_DOCX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}