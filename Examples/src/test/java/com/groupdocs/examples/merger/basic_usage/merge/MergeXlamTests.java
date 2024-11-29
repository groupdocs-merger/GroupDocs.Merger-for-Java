package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXlamTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXlam.run(SampleFiles.SAMPLE_XLAM, SampleFiles.SAMPLE_XLAM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}