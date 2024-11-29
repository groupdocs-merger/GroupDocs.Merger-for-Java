package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXpsTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXps.run(SampleFiles.SAMPLE_XPS, SampleFiles.SAMPLE_XPS);
        Assertions.assertThat(result).isNotNull().exists();
    }
}