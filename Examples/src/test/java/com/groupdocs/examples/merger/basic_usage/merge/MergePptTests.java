package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergePptTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergePpt.run(SampleFiles.SAMPLE_PPT, SampleFiles.SAMPLE_PPT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}