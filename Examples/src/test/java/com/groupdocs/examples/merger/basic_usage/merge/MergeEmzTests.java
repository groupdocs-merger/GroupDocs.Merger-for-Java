package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeEmzTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeEmz.run(SampleFiles.SAMPLE_EMZ, SampleFiles.SAMPLE_EMZ);
        Assertions.assertThat(result).isNotNull().exists();
    }
}