package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeSvgzTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeSvgz.run(SampleFiles.SAMPLE_SVGZ, SampleFiles.SAMPLE_SVGZ);
        Assertions.assertThat(result).isNotNull().exists();
    }
}