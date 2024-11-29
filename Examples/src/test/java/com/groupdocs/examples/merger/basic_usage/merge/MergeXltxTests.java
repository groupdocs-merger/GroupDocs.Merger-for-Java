package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXltxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXltx.run(SampleFiles.SAMPLE_XLTX, SampleFiles.SAMPLE_XLTX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}