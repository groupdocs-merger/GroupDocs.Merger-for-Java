package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXltTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXlt.run(SampleFiles.SAMPLE_XLT, SampleFiles.SAMPLE_XLT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}