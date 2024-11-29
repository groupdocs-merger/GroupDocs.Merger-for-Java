package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeOneTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeOne.run(SampleFiles.SAMPLE_ONE, SampleFiles.SAMPLE_ONE);
        Assertions.assertThat(result).isNotNull().exists();
    }
}