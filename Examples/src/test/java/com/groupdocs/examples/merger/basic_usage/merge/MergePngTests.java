package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergePngTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergePng.run(SampleFiles.SAMPLE_PNG, SampleFiles.SAMPLE_PNG);
        Assertions.assertThat(result).isNotNull().exists();
    }
}