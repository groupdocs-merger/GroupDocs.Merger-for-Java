package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeSvgTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeSvg.run(SampleFiles.SAMPLE_SVG, SampleFiles.SAMPLE_SVG);
        Assertions.assertThat(result).isNotNull().exists();
    }
}