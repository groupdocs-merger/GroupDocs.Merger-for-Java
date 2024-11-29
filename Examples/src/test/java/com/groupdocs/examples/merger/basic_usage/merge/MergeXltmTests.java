package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXltmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXltm.run(SampleFiles.SAMPLE_XLTM, SampleFiles.SAMPLE_XLTM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}