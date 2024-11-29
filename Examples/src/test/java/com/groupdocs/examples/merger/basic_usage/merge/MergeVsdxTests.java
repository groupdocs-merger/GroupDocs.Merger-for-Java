package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVsdxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVsdx.run(SampleFiles.SAMPLE_VSDX, SampleFiles.SAMPLE_VSDX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}