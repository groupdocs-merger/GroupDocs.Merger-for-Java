package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVsxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVsx.run(SampleFiles.SAMPLE_VSX, SampleFiles.SAMPLE_VSX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}