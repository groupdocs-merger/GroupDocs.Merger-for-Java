package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeMhtmlTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeMhtml.run(SampleFiles.SAMPLE_MHTML, SampleFiles.SAMPLE_MHTML);
        Assertions.assertThat(result).isNotNull().exists();
    }
}